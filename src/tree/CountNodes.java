package tree;

/**
 * Created by z002gh2 on 3/10/19.
 */
public class CountNodes {

    public static int countNodes(TreeNode node){
      int  counter = 1;
        if(null == node){
            return 0;
        }else{
            counter = counter + countNodes(node.leftChild);
            counter = counter + countNodes(node.rightChild);

        }
        return counter;
    }

    public static int getLeafNodesCount(TreeNode root){
        if(null == root){
            return 0;
        }
        if(root.leftChild == null && root.rightChild == null){
            return 1;
        }
        return getLeafNodesCount(root.leftChild) + getLeafNodesCount(root.rightChild);
    }

    public static int getHalfLeafNodesCount(TreeNode node){
        if (null == node){
            return 0;
        }
        if( node.leftChild == null && node.rightChild != null){
            return 1;
        }
        if(node.leftChild != null && node.rightChild == null){
            return 1;
        }
        return getHalfLeafNodesCount(node.leftChild)+ getHalfLeafNodesCount(node.rightChild);
    }
    public static void main(String[] args) {

        Tree t = new Tree();
        t.insert(50);
        t.insert(60);
        t.insert(70);
        t.insert(40);
        t.insert(30);
        t.insert(45);
        t.insert(55);
        t.insert(65);

        System.out.println(countNodes(t.root));

        System.out.println(getLeafNodesCount(t.root));

        System.out.println(getHalfLeafNodesCount(t.root));


    }

}
