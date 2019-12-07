package tree_classroom;

import java.util.Stack;

public class PrintRootToLeafPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tree tree = new Tree();
        tree.root = new TreeNode(1);
        tree.root.leftChild = new TreeNode(2);
        tree.root.rightChild = new TreeNode(3);
        //tree.root.leftChild.leftChild = new TreeNode(4);
        tree.root.leftChild.rightChild = new TreeNode(5);
        Stack<Integer> st = new Stack<>();
        rootToLeaf(tree.root, st);
	}

	
	public static void rootToLeaf(TreeNode root,Stack<Integer> st){
		if(null == root){
			return;
		}
		st.push(root.data);
		rootToLeaf(root.leftChild, st);
		if(root.leftChild == null && root.rightChild == null){
			System.out.println(st);
		}
		rootToLeaf(root.rightChild, st);
		st.pop();
		
	}
	
	public static void printStack(Stack<Integer> st){
		int size = st.size();
		
	}
}
