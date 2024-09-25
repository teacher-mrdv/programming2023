/*  HOMEWORK
    Make the necessary changes so that the BST can hold and
    process Strings as their data
 */
public class BSTree {
    //field/attribute/instance variable
    private BNode root;

    //constructors (overloaded)
    public BSTree(int data) {
        BNode newNode = new BNode(data);
        root = newNode;
        System.out.println("--> Inserted " + data + " as the root");
    }

    public BSTree(BNode newNode) {
        root = newNode;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void addNode(int data) {
        BNode newBNode = new BNode(data);
        if (!isEmpty()) {
            addNode(root, newBNode);
        } else {
            root = newBNode;
            System.out.println("--> Inserted " + data + " as the root");
        }
    }

    public void addNode(BNode newBNode) {
        if (!isEmpty()) {
            addNode(root, newBNode);
        } else {
            root = newBNode;
            System.out.println("--> Inserted " +
                    newBNode.getData() + " as the " + "root");
        }
    }

    public void addNode(BNode node, BNode newNode) {
        if (newNode.getData() < node.getData()) {
            if (node.getLeft() != null) {
                addNode(node.getLeft(), newNode);
            } else {
                System.out.println("--> Inserted " + newNode.getLeft() +
                        " to the left of " + node.getData());
                node.setLeft(newNode);
            }
        } else if (newNode.getData() > node.getData()) {
            if (node.getRight() != null) {
                addNode(node.getRight(), newNode);
            } else {
                System.out.println("--> Inserted " + newNode.getData() +
                        " to the right of " + node.getData());
                node.setRight(newNode);
            }
        }
    }

    public boolean search(int key) {
        if (!isEmpty()) {
            return search(root, key);
        } else {
            return false;
        }
    }

    public boolean search(BNode node, int key) {
        if (node == null) {
            return false;
        }
        if (node.getData() == key) {
            return true;
        } else if (key > node.getData()) {
            return search(node.getRight(), key);
        } else {//if (key < node.data) {
            return search(node.getLeft(), key);
        }
    }

    // overloading the inOrder method so that we can
    // call it without parameters and output an error
    // message if the tree is empty
    public void inOrder() {
        if(isEmpty()) {
            System.out.println("Tree is empty");
        } else {
            inOrder(root);
        }
    }

    // Left_Visit_Right
    public void inOrder(BNode node) {
        if(node == null) {
            return;
        }
        inOrder(node.getLeft());
        System.out.print(node.getData() + " ");
        inOrder(node.getRight());
    }

    public void preOrder() {
        if(isEmpty()) {
            System.out.println("Tree is empty");
        } else {
            preOrder(root);
        }
    }

    // V L R
    public void preOrder(BNode node) {
        if(node == null) {
            return;
        }
        System.out.print(node.getData() + " "); // visit
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

    public void postOrder() {
        if(isEmpty()) {
            System.out.println("Tree is empty");
        } else {
            postOrder(root);
        }
    }

    // L R V
    public void postOrder(BNode node) {
        if(node == null) {
            return;
        }
        postOrder(node.getLeft());
        postOrder(node.getRight());
        System.out.print(node.getData() + " ");
    }

}

