public class BNode {
    private String data; // change all classes to use STRING as data
    private BNode left;
    private BNode right;

    // constructor
    public BNode(String data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public BNode getLeft() {
        return left;
    }

    public void setLeft(BNode left) {
        this.left = left;
    }

    public BNode getRight() {
        return right;
    }

    public void setRight(BNode right) {
        this.right = right;
    }

    public String toString() {
        return data; // also data + "";
    }

}
