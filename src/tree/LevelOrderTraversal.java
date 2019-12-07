package tree;


import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by z002gh2 on 3/26/19.
 */
public class LevelOrderTraversal {

public static void levelOrderTraversal(TreeNode root){
    if(null == root){
        return;
    }else{
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            System.out.println(temp.data);
            if(null != temp.leftChild){
                queue.offer(temp.leftChild);
            }
            if(null != temp.rightChild){
                queue.offer(temp.rightChild);
            }
        }
    }
}

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new TreeNode(1);
        tree.root.rightChild = new TreeNode(2);
        tree.root.rightChild.rightChild = new TreeNode(5);
        tree.root.rightChild.rightChild.leftChild = new TreeNode(3);
        tree.root.rightChild.rightChild.rightChild =  new TreeNode(6);
        tree.root.rightChild.rightChild.leftChild.rightChild= new TreeNode(4);
        levelOrderTraversal(tree.root);
    }

}
