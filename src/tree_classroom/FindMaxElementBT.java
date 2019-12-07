package tree_classroom;

import java.util.LinkedList;
import java.util.Queue;

public class FindMaxElementBT {

	
	public static int findMaxWithoutRecursion(TreeNode root){
		int max=0;
		if (null == root){
			return 0;
		}else{
			Queue<TreeNode> queue = new LinkedList<>();
			max= root.data;
			queue.offer(root);
			while(!queue.isEmpty()){
				TreeNode temp =queue.poll();
				if(temp.data>max){
					max= temp.data;
				}
				if(temp.leftChild!=null){
					queue.offer(temp.leftChild);
				}if(temp.rightChild!=null){
					queue.offer(temp.rightChild);
				}
			}
					
		}
		return max;
	}
	
	public static int findMax(TreeNode root){
		int max =0;
		if(null!= root){
			int left = findMax(root.leftChild);
			int right= findMax(root.rightChild);
			if(left>right){
				max=left;
			}else{
				max=right;
			}
			if(root.data>max){
				return root.data;
			}
		}
		return max;
		
	}
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.root = new TreeNode(1);
		tree.root.rightChild = new TreeNode(2);
		tree.root.rightChild.rightChild = new TreeNode(5);
		tree.root.rightChild.rightChild.leftChild = new TreeNode(3);
		tree.root.rightChild.rightChild.rightChild= new TreeNode(6);
		tree.root.rightChild.rightChild.leftChild.rightChild = new TreeNode(4);

		//System.out.println(findMaxWithoutRecursion(tree.root));
		System.out.println(findMax(tree.root));
	}

}
