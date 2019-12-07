package tree_classroom;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;


public class TreeTOPViewClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree tree = new Tree ();
		tree.root = new TreeNode(1);
		tree.root.leftChild= new TreeNode(2);
		tree.root.rightChild = new TreeNode(3);
		tree.root.leftChild.rightChild= new TreeNode(4);
		tree.root.leftChild.rightChild.rightChild= new TreeNode(5);
		tree.root.leftChild.rightChild.rightChild.rightChild= new TreeNode(6);
		
		topView(tree.root);

		
	}
	
	public static void topView (TreeNode root){
		Queue<QueueCustome> queue = new LinkedList<QueueCustome>();
		if ( null == root){
			return;
		}
		queue.offer(new QueueCustome(root,0));
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		while(!queue.isEmpty()){
			QueueCustome cust = queue.poll();
			TreeNode node = cust.node;
			int distance = cust.distance;
			if(!map.containsKey(distance)){
				map.put(distance, node.data);
			}
			
			if(node.leftChild!=null){
				queue.offer(new QueueCustome(node.leftChild, distance-1));				
			}if(node.rightChild!=null){
				queue.offer(new QueueCustome(node.rightChild, distance+1));
				
			}
		}
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet() ){
			System.out.println(entry.getValue());
		}
	}

}
