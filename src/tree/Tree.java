package tree;


public class Tree {
    TreeNode root;

    public Tree() {
        this.root = null;
    }

/**
 * insert data in Tree
 */
public void insert(int data){
    TreeNode node = new TreeNode(data);
    if(null == root){
        root = node;
    }else {
        TreeNode current= root;
        TreeNode parent;
        while(true){
            parent = current;
            if(data < current.data){
                current = current.leftChild;
                if(null == current) {
                    parent.leftChild = node;
                    return;
                }
            }else {
                current = current.rightChild;
                if(null == current) {
                    parent.rightChild = node;
                    return;
                }
            }
        }
    }
}

/**
 * find data in Tree
 */
public boolean findData(int data){
    TreeNode current = root;

    while (current != null && current.data != data ){
        if(data < current.data){
            current = current.leftChild;
        }else{
            current = current.rightChild;
        }
    }

    if(current != null && current.data == data){
        System.out.println(current.data);
        return true;
    }else return false;

}

public void preOrder(TreeNode node){
    if(node == null){
        return;
    }else {
        System.out.print(node.data + " ");
        preOrder(node.leftChild);
        preOrder(node.rightChild);
    }
}

public void inOrder(TreeNode node){
    if(node == null){
        return;
    }else{
        inOrder(node.leftChild);
        System.out.print(node.data + " ");
        inOrder(node.rightChild);
    }
}

public void postOrder(TreeNode node){
    if(node == null){
        return;
    }else{
        postOrder(node.leftChild);
        postOrder(node.rightChild);
        System.out.print(node.data + " ");
    }
}

public void printAllPossiblePath(TreeNode node){
    if(node == null){
        return;
    }else{
        printAllPossiblePath(node.leftChild);
    }
}
}
