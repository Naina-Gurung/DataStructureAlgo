package tree;

import java.util.Stack;

/**
 * Created by z002gh2 on 3/28/19.
 */
public class PrintRootToLeafNodes {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.root= new TreeNode('A');
        t.root.leftChild= new TreeNode('B');
        t.root.rightChild= new TreeNode('C');
        t.root.leftChild.rightChild= new TreeNode('E');
        t.root.leftChild.leftChild= new TreeNode('D');
        t.root.leftChild.leftChild.leftChild= new TreeNode('F');
        Stack<String> st = new Stack<>();
        rootToLeaf(t.root,st);
    }

    public static void rootToLeaf(TreeNode root,Stack<String> st) {
        if(null == root){
            return;
        }
        //st.push(root.data);
        rootToLeaf(root.leftChild, st);



    }

}
