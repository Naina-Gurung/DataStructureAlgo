package tree_classroom;// build tree from IN order and PRE order

public class CreateTreeINandPRE {
	public static int preIndex = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] preorder = { 1, 2, 4, 3 };
		int[] inorder = { 4, 2, 1, 3 };
		TreeNode root = buildTree(preorder, inorder);
		System.out.println(root.data);

	}

	public static TreeNode buildTree(int[] preorder, int[] inorder) {

		return construct(inorder, preorder, 0, inorder.length - 1);
	}

	public static TreeNode construct(int[] inorder, int[] preorder, int inStart, int inEnd) {
		if (inStart > inEnd) {
			return null;
		}

		int val = preorder[preIndex++];
		TreeNode p = new TreeNode(val);

		// find parent element index from inorder
		int k = 0;
		for (int i = 0; i < inorder.length; i++) {
			if (val == inorder[i]) {
				k = i;
				break;
			}
		}

		p.leftChild = construct(preorder, inorder, inStart, k - 1);
		p.rightChild = construct(preorder, inorder, k + 1, inEnd);

		return p;
	}

}
