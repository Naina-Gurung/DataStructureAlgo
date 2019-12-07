package tree;

/**
 * Created by z002gh2 on 3/23/19.
 */
public class MirrorImage {

    public static boolean checkMirrorImage(TreeNode node1, TreeNode node2){

        if(node1 == null && node2 == null){
            return true;
        }
        if(node1 == null || node2 == null){
            return false;
        }
        else if(node1.data == node2.data){
            return checkMirrorImage(node1.getLeftChild(),node2.getRightChild())
                    && checkMirrorImage(node1.getRightChild(),node2.getLeftChild());
        }
        return false;

    }

    public static void main(String[] args) {

        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(1);
        root1.leftChild = new TreeNode(2);
        root1.rightChild = new TreeNode(3);
        root1.leftChild.leftChild = new TreeNode(4);
        root1.leftChild.rightChild = new TreeNode(5);

        root2.leftChild = new TreeNode(3);
        root2.rightChild = new TreeNode(2);
        root2.rightChild.leftChild = new TreeNode(5);
        root2.rightChild.rightChild = new TreeNode(4);

        System.out.println(checkMirrorImage(root1, root2));


    }
}
