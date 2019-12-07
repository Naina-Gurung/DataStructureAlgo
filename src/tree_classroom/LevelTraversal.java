package tree_classroom;

import java.util.LinkedList;
import java.util.Queue;


public class LevelTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root = new TreeNode(1);
		root.leftChild = new TreeNode(2);
		root.rightChild = new TreeNode(3);
		root.leftChild.leftChild = new TreeNode(4);
		root.leftChild.rightChild = new TreeNode(5);
		root.rightChild.leftChild = new TreeNode(6);
		root.rightChild.rightChild = new TreeNode(7);
		
		levelOrderTraversal(root);

	}
	
	public static void levelOrderTraversal (TreeNode root){

		String out=" ";
		if ( null == root){
			return;
		}else{
			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			queue.offer(root);
			while(!queue.isEmpty()){
				int count=0;
				TreeNode temp = queue.poll();
				System.out.print(temp.data+" ");
				if(null!= temp.leftChild){
					count= count+1;
					queue.offer(temp.leftChild);
				}if (null!= temp.rightChild){
					count= count+1;
					queue.offer(temp.rightChild);
				}
				out=Integer.toString(count)+",";
			}
		}
		System.out.println(out);
	}

}
