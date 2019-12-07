package tree;

/**
 * Created by z002gh2 on 3/10/19.
 */
public class TreeNodeDriver {

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

 TraverseWithRecursion t1 = new TraverseWithRecursion();
       // t1.preOrder(t.root);
       // System.out.println(" ");
       // System.out.println(t.findData(30));

        // t.postOrder(t.root);





    }


}
