package tree_classroom;

public class TreeToDLL {
		 
	    private TreeNode root;
	    public static TreeNode prev= null;

	 /*   private static TreeNode convertToDoublyLinkedList(TreeNode root) {
	         
	        if (root.getLeftChild() != null) {
	            TreeNode left = convertToDoublyLinkedList(root.getLeftChild());
	            while (left.getRightChild() != null) {
	                left = left.getRightChild();
	            }
	            left.setRightChild(root);
	            root.setLeftChild(left);
	        }
	         
	        if (root.getRightChild() != null) {
	            TreeNode right = convertToDoublyLinkedList(root.getRightChild());
	            while (right.getLeftChild() != null) {
	                right = right.getLeftChild();
	            }
	            right.setLeftChild(root);
	            root.setRightChild(right);
	        }
	 
	        return root;
	    }*/
	    
	    public static void main(String[] args) {
			// TODO Auto-generated method stub
	    	 Tree tree = new Tree();
		        tree.root = new TreeNode(10);
		        tree.root.leftChild = new TreeNode(20);
		        tree.root.rightChild = new TreeNode(30);
		        
		      /* TreeNode root = convertToDoublyLinkedList(tree.root);
		   	 
		        // Move to the leftmost TreeNode in the list
		        while (root.getLeftChild() != null)
		            root = root.getLeftChild();*/
		        convert(tree.root, null);
		        while (tree.root.getLeftChild() != null)
		        	tree.root = tree.root.getLeftChild();
		        
		        System.out.println(tree.root.data);
		       
		}
	    
	    public static void convert(TreeNode root, TreeNode head){
	    	
	    	if ( null == root){
	    		return;
	    	}
	    	convert(root.leftChild, head);
	    	if(null == prev){
	    		head = root;
	    	}else{
	    		root.leftChild=prev;
	    		prev.rightChild= root;
	    	}
	    	prev = root;
	    	convert(root.rightChild, head);
	    }
}
