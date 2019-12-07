package tree;

/**
 * Created by z002gh2 on 4/18/19.
 */
public class QueueNodesTOPView {
    TreeNode node;
    int hd;

    public QueueNodesTOPView(TreeNode node,int hd) {
        // TODO Auto-generated constructor stub
        this.node=node;
        this.hd=hd;
    }
    public TreeNode getNode() {
        return node;
    }
    public void setNode(TreeNode node) {
        this.node = node;
    }
    public int getHd() {
        return hd;
    }
    public void setHd(int hd) {
        this.hd = hd;
    }
}
