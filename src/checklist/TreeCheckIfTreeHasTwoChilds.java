package checklist;

import tree_classroom.Tree;
import tree_classroom.TreeNode;

public class TreeCheckIfTreeHasTwoChilds {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new TreeNode(1);
        tree.root.leftChild = new TreeNode(2);
        tree.root.rightChild = new TreeNode(3);
        tree.root.leftChild.leftChild = new TreeNode(4);
        tree.root.leftChild.rightChild = new TreeNode(5);
     //   tree.root.rightChild.leftChild = new TreeNode(7);
      //  tree.root.rightChild.rightChild = new TreeNode(9);
        boolean result = haveTwoChild(tree.root);

        if(result == true){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }




    public static boolean haveTwoChild(TreeNode root){
        if(root == null){
            return true;
        }else if(root.leftChild == null && root.rightChild == null){
                return true;
        }else if(root.leftChild == null || root.rightChild == null){
            return false;
        }else {
            boolean flag = true;

            flag = flag && haveTwoChild(root.leftChild);
            flag = flag && haveTwoChild(root.rightChild);

            return flag;
        }
    }
}