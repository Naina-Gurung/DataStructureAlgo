package checklist;

import tree_classroom.Tree;
import tree_classroom.TreeNode;

public class TreeDeepestCommonAncestor {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new TreeNode(3);
        tree.root.leftChild = new TreeNode(5);
        tree.root.rightChild = new TreeNode(1);
        tree.root.leftChild.leftChild = new TreeNode(6);
        tree.root.leftChild.rightChild = new TreeNode(2);
        tree.root.rightChild.leftChild = new TreeNode(0);
        tree.root.rightChild.rightChild = new TreeNode(8);
        tree.root.leftChild.rightChild.leftChild = new TreeNode(7);
        tree.root.leftChild.rightChild.rightChild = new TreeNode(4);
        System.out.println( deepestCommonAncestor(tree.root, tree.root.leftChild ,tree.root.rightChild));

    }

    public static TreeNode deepestCommonAncestor(TreeNode root,TreeNode p, TreeNode q){
        if (root == null || root == p || root == q) return root;
        TreeNode left = deepestCommonAncestor(root.leftChild, p, q);
        TreeNode right = deepestCommonAncestor(root.rightChild, p, q);
        if ((left == p && right == q) || (left == q && right == p))
            return root; // common ancestor
        else return left == null ? right : left;
    }
}
