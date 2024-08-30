public class BNode {
    int data;
    BNode left;
    BNode right;

    // constructor
    public BNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public String toString() {
        return Integer.toString(data); // also data + "";
    }

}
