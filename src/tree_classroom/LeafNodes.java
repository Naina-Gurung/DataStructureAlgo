package tree_classroom;

import java.util.LinkedList;
import java.util.Queue;


public class LeafNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree tree = new Tree();
		tree.root = new TreeNode(1);
		tree.root.leftChild = new TreeNode(2);
		tree.root.rightChild = new TreeNode(3);
		tree.root.rightChild.leftChild = new TreeNode(4);
		tree.root.rightChild.rightChild = new TreeNode(5);
		System.out.println( "Leaf Node " + leafNode(tree.root));
		System.out.println( " Full Node "+ fullNode(tree.root));

	}

	
	public static int leafNode(TreeNode root ){
		int count =0;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);		
		while(!queue.isEmpty()){
			TreeNode node = queue.poll();
			if(node.leftChild == null && node.rightChild== null){
				count++;
			}if(node.leftChild!=null){
				queue.offer(node.leftChild);
			}if(node.rightChild!=null){
				queue.offer(node.rightChild);
			}
			
		}
		return count;
	}
	
	public static int fullNode(TreeNode root ){
		int count =0;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);		
		while(!queue.isEmpty()){
			TreeNode node = queue.poll();
			if(node.leftChild != null && node.rightChild!= null){
				count++;
			}if(node.leftChild!=null){
				queue.offer(node.leftChild);
			}if(node.rightChild!=null){
				queue.offer(node.rightChild);
			}
			
		}
		return count;
	}
}
