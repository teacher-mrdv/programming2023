public class BSTree {
    //field/attribute/instance variable
    BNode root;

    //constructors (overloaded)
    public BSTree(int data) {
        BNode newNode = new BNode(data);
        root = newNode;
    }

    public BSTree(BNode newNode) {
        root = newNode;
    }

    public boolean isEmpty() {
        return root == null;
    }
    public void addNode(int data) {
        BNode newBNode = new BNode(data);
        addNode(root, newBNode);
    }

    public void addNode(BNode newBNode) {
        addNode(root, newBNode);
    }

    public void addNode(BNode node, BNode newNode) {
        if( node == null ) {
            node = newNode;
            return;
        } else if(newNode.data < node.data) {
            addNode(node.left, newNode);
        } else if(newNode.data > node.data) {
            addNode(node.right, newNode);
        }
    }
}
