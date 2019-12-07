package tree_classroom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class VerticalTraversal {
	
	public static HashMap<Integer, List<Integer>> map = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		map = new HashMap<Integer, List<Integer>>();
		
		Tree tree = new Tree();
		tree.root = new TreeNode(1);
		tree.root.rightChild = new TreeNode(3);
		tree.root.leftChild = new TreeNode(2);
		tree.root.leftChild.leftChild = new TreeNode(4);
		tree.root.leftChild.rightChild = new TreeNode(5);
		tree.root.rightChild.rightChild = new TreeNode(6);
		
		verticalTraversal(tree.root, 0);
		for(Map.Entry<Integer, List<Integer>> entry: map.entrySet()){
			System.out.println("Distance  :  "+entry.getKey() + " Nodes : "+entry.getValue());
		}

	}
	
	public static void verticalTraversal(TreeNode root, int distance){
		if ( null ==  root){
			return;			
		}
		ArrayList<Integer> list = null;
		if(map.containsKey(distance)){
			list = (ArrayList<Integer>) map.get(distance);
		}else{
			list = new ArrayList<Integer>();
		}
		list.add(root.data);
		map.put(distance, list);
		
		verticalTraversal(root.leftChild, distance-1);
		verticalTraversal(root.rightChild, distance+1);
	}

}
