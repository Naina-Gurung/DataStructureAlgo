package tree;

/**
 * Created by z002gh2 on 3/10/19.
 */
public class TraverseWithRecursion {
    TreeNode root;

    public TraverseWithRecursion() {
        this.root= null;
    }

    /**
     *
     * @param root
     * preOrder
     */
    public void preOrder(TreeNode root){
        if(null != root){
            System.out.print(root.data + " ");
            preOrder(root.leftChild);
            preOrder(root.rightChild);
        }
    }

    /**
     *
     * @param root
     * inOrder
     */
    public void inOrder(TreeNode root){
        if(null != root){
            inOrder(root.leftChild);
            System.out.println(root.data);
            inOrder(root.rightChild);
        }
    }

    /**
     *
     * @param root
     * postOrder
     */
    public void postOrder(TreeNode root){
        if(null != root){
            postOrder(root.leftChild);
            postOrder(root.rightChild);
            System.out.println(root.data);
        }
    }

}
