package tree_classroom;

public class FindHeightOfTree {
	
	public static void main(String args[]){
		Tree tree = new Tree();
		tree.insert(1);
		tree.insert(2);
		tree.insert(3);
//		tree.insert(60);
//		tree.insert(80);
//		tree.insert(100);
		System.out.println(findHeight(tree.root));
		System.out.println(maxElement(tree.root));
	}
	
	private static int findHeight(TreeNode root){
		
		if(null == root){
			return 0;
		}else{
			int leftHeight=1+findHeight(root.leftChild);
			int rightHeight=1+findHeight(root.rightChild);
			if(leftHeight>rightHeight){
				return leftHeight;
			}else{
				return rightHeight;
			}
		}
		
	}
	
	public static int maxElement(TreeNode root){
		int maxValue= Integer.MIN_VALUE;
		if(null!=root){
			int left=maxElement(root.leftChild);
			int right = maxElement(root.rightChild);
			if(left>right){
				maxValue=left;
			}else{
				maxValue=right;
				
			}
			if(root.data>maxValue){
				maxValue=root.data;
			}
		}
		return maxValue;
	}

}
