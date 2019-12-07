package tree_classroom;

public class TreeTraversal {
	
	public void preOrderTraversal(TreeNode root){
		if(null!= root){
			System.out.println(root.data);
			preOrderTraversal(root.leftChild);
			preOrderTraversal(root.rightChild);
		}
	}
	
	
	public void inOrderTraversal(TreeNode root){
		if(null!= root){			
			inOrderTraversal(root.leftChild);
			System.out.println(root.data);
			inOrderTraversal(root.rightChild);
		}
	}
	
	public void postOrderTraversal(TreeNode root){
		if(null!= root){			
			postOrderTraversal(root.leftChild);
			postOrderTraversal(root.rightChild);
			System.out.println(root.data);
		}
	}

}
