package tree_classroom;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	
	public static void levelOrderTraversal(TreeNode root){
		//int max= Integer.MIN_VALUE;
		if ( null == root){
			return;
		}else{
			Queue<TreeNode> queue = new LinkedList<>();
			queue.offer(root);
			while(!queue.isEmpty()){
				TreeNode temp = queue.poll();
				System.out.println(temp.data);
//				if(temp.data>max){
//					max=temp.data;
//				}
				if(null!=temp.leftChild){
					queue.offer(temp.leftChild);
				}if(null!=temp.rightChild){
					queue.offer(temp.rightChild);
				}
			}
		}
		//System.out.println("maximum element is "+max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tree = new Tree();
		tree.root = new TreeNode(1);
		tree.root.rightChild = new TreeNode(2);
		tree.root.rightChild.rightChild = new TreeNode(5);
		tree.root.rightChild.rightChild.leftChild = new TreeNode(3);
		tree.root.rightChild.rightChild.rightChild= new TreeNode(6);
		tree.root.rightChild.rightChild.leftChild.rightChild = new TreeNode(4);
		
		levelOrderTraversal(tree.root);

	}

}
