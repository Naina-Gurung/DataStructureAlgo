package checklist;


import tree_classroom.TreeNode;
import tree_classroom.Tree;

import java.util.HashSet;
import java.util.Set;

public class TreeBTSecondMinimum {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new TreeNode(2);
        tree.root.leftChild = new TreeNode(2);
        tree.root.rightChild = new TreeNode(5);
        tree.root.rightChild.leftChild = new TreeNode(5);
        tree.root.rightChild.rightChild = new TreeNode(7);
        System.out.println(findSecondMinimumValue(tree.root));

    }

    public static int findSecondMinimumValue(TreeNode root) {
        Set<Integer> uniques = new HashSet<Integer>();
        dfs(root, uniques);
        System.out.println(uniques);
        int min1 = root.getData();
        long ans = Long.MAX_VALUE;
        for (int v : uniques) {
            if (min1 < v && v < ans) ans = v;
        }
        return ans < Long.MAX_VALUE ? (int) ans : -1;
    }

    public static void dfs(TreeNode root, Set<Integer> uniques) {
        if (root != null) {
            uniques.add(root.getData());
            dfs(root.leftChild, uniques);
            dfs(root.rightChild, uniques);
        }

    }
}
