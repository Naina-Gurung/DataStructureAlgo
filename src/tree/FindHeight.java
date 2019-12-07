package tree;

/**
 * Created by z002gh2 on 3/24/19.
 */
public class FindHeight {
    TreeNode node;

    public static int findHeight(TreeNode node){
        int cnt=1;
        int leftHeight;
        int rightHeight;
        if(node != null){

            leftHeight= cnt + findHeight(node.leftChild);
            rightHeight = cnt + findHeight(node.rightChild);
            if (leftHeight>rightHeight){

                return leftHeight;
            }
            else {
                return rightHeight;}
        } else return 0;


    }

    public static void main(String[] args) {

        Tree t = new Tree();
        t.insert(2);
        t.insert(1);
        t.insert(4);
        t.insert(3);
        t.insert(5);

        //t.preOrder(t.root);

        /*t.insert(45);
        t.insert(55);
        t.insert(65);*/

        /*Tree tree = new Tree();
        tree.root = new TreeNode(2);
        tree.root.leftChild = new TreeNode(1);
        tree.root.rightChild = new TreeNode(4);
        tree.root.rightChild.rightChild = new TreeNode(5);
        tree.root.rightChild.leftChild = new TreeNode(3);*/


        //tree.root.rightChild.rightChild.leftChild = new TreeNode(3);
       // tree.root.rightChild.rightChild.rightChild= new TreeNode(6);
        //tree.root.rightChild.rightChild.leftChild.rightChild = new TreeNode(4);


        System.out.println(findHeight(t.root));
    }


}
