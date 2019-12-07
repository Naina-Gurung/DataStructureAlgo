package checklist;


import tree_classroom.Tree;
import tree_classroom.TreeNode;

public class TreeSecondMinimumTreeOrderOneSpaceComplexity {

  static   long firstMinimum=Long.MAX_VALUE;
  static   long secondMinimum=Long.MAX_VALUE;

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new TreeNode(2);
        tree.root.leftChild = new TreeNode(2);
        tree.root.rightChild = new TreeNode(5);
        tree.root.rightChild.leftChild = new TreeNode(5);
        tree.root.rightChild.rightChild = new TreeNode(7);
        System.out.println(findSecondMinimumValue(tree.root));

    }

    public  static int findSecondMinimumValue(TreeNode root){

        getSecondVal(root);
        return secondMinimum<Long.MAX_VALUE? (int) secondMinimum:-1;
    }

    public static  void getSecondVal(TreeNode root){

        if(root==null)
            return ;

        if(root.getData()<firstMinimum){
            secondMinimum=firstMinimum;
            firstMinimum=root.getData();
        }
        else if(root.getData()<secondMinimum && root.getData()!=firstMinimum)
            secondMinimum=root.getData();

        getSecondVal(root.leftChild);
        getSecondVal(root.rightChild);
    }
}
