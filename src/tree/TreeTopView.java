package tree;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by z002gh2 on 4/18/19.
 */
public class TreeTopView {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TreeNode root = new TreeNode(1);
        root.leftChild = new TreeNode(2);
        root.rightChild = new TreeNode(3);
        root.leftChild.rightChild = new TreeNode(4);
        root.leftChild.rightChild.rightChild = new TreeNode(5);
        root.leftChild.rightChild.rightChild.rightChild = new TreeNode(6);
        treeTopView(root);

    }

    public static void treeTopView(TreeNode root){
        if (null == root){
            return;
        }
        Queue<QueueNodesTOPView> queue= new LinkedList<>();
        QueueNodesTOPView item = new QueueNodesTOPView(root,0);
        queue.offer(item);
        HashSet<Integer> set = new HashSet<>();
        while(!queue.isEmpty()){
            QueueNodesTOPView temp = queue.poll();
            int hd=temp.hd;
            TreeNode node = temp.node;


            if(!set.contains(hd)){
                set.add(hd);
                System.out.println(node.data);
            }

            if(node.leftChild!=null){
                queue.add(new QueueNodesTOPView(node.leftChild, hd-1));
            }
            if(node.rightChild!=null){
                queue.add(new QueueNodesTOPView(node.rightChild, hd+1));
            }

        }

    }
}
