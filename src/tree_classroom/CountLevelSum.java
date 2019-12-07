package tree_classroom;

import java.util.LinkedList;
import java.util.Queue;

public class CountLevelSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree tree = new Tree();
		tree.root = new TreeNode(1);
		tree.root.rightChild = new TreeNode(2);
		tree.root.leftChild = new TreeNode(3);
		tree.root.rightChild.rightChild = new TreeNode(5);
		tree.root.leftChild.leftChild = new TreeNode(6);
		/*tree.root.rightChild.rightChild.leftChild = new TreeNode(3);
		tree.root.rightChild.rightChild.rightChild= new TreeNode(6);
		tree.root.rightChild.rightChild.leftChild.rightChild = new TreeNode(4);*/
		levelSum(tree.root);
		

	}

	public static void levelSum(TreeNode root){
		if(null == root){
			return;
		}else{
			TreeNode current = root;
			Queue<TreeNode> queue = new LinkedList<>();
			queue.offer(current);
			queue.offer(null);
			int sum =0;
			int maxSum =0;
			int levelNumber =0;
			while(!queue.isEmpty()){
				TreeNode node = queue.poll();
				if(null!=node){
				if(node.leftChild!=null){
					queue.offer(node.leftChild);
					
				}if(node.rightChild!=null){
					queue.offer(node.rightChild);
				
				}
				sum = sum+node.data;
				
				}else{
					//System.out.println(sum);  
					
					if(sum>maxSum){
						maxSum= sum;
					}
					if(!queue.isEmpty()){
						queue.offer(null);
					}
					sum=0;
					levelNumber++;
				}
				System.out.println(maxSum);
			}
		}
	}
}
