package tree;

/**
 * Created by z002gh2 on 3/24/19.
 */
public class MaxElementTree {
    public static int getMax(TreeNode node){
        int maxValue = Integer.MIN_VALUE;
        if(node == null){
            return 0;
        }
        if(node != null){
            int leftMax = getMax(node.leftChild);
            int rightMax = getMax(node.rightChild);
            if(leftMax>rightMax){
                maxValue = leftMax;
            }else maxValue = rightMax;
        }
        if(node.data>maxValue){
            maxValue=node.data;
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new TreeNode(2);
        tree.root.leftChild = new TreeNode(1);
        tree.root.rightChild = new TreeNode(4);
        tree.root.rightChild.rightChild = new TreeNode(6);
        tree.root.rightChild.leftChild = new TreeNode(3);

        System.out.println(getMax(tree.root));
    }
}
