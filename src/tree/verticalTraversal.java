package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.Map;

/**
 * Created by z002gh2 on 3/30/19.
 */
public class verticalTraversal {

    public static TreeMap<Integer, List<Integer>> map = null;


    public static void main(String[] args) {
        map = new TreeMap<Integer, List<Integer>>();

        Tree tree = new Tree();
        tree.root = new TreeNode(1);
        tree.root.rightChild = new TreeNode(2);
        tree.root.leftChild = new TreeNode(3);
        tree.root.leftChild.leftChild = new TreeNode(6);
        tree.root.leftChild.rightChild = new TreeNode(4);
        tree.root.rightChild.rightChild = new TreeNode(5);
        tree.root.rightChild.leftChild = new TreeNode(7);

        verticalTraversal(tree.root, 0);
        for(Map.Entry<Integer, List<Integer>> entry: map.entrySet()){
            //System.out.println("Distance  :  "+entry.getKey() + " Nodes : "+entry.getValue());
            System.out.print(entry.getValue().toString().replaceAll("\\[","").replaceAll("\\]","").replaceAll(",","") + " ");
        }
    }



    public static void verticalTraversal(TreeNode root, int distance){
        // maintain a rank per node : 0 for root node, for each left node rank =(rank of parent) - 1
        // for each right node rank=(rank of parent) + 1
        // use a HashMap

        if ( null ==  root){
            return;
        }
        ArrayList<Integer> list = null;
        if(map.containsKey(distance)){
            list = (ArrayList<Integer>) map.get(distance);
        }else{
            list = new ArrayList<Integer>();
        }
        list.add(root.data);
        map.put(distance, list);

        verticalTraversal(root.leftChild, distance-1);
        verticalTraversal(root.rightChild, distance+1);
    }
}
