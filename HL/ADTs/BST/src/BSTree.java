public class BSTree {
    //field/attribute/instance variable
    BNode root;

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
            System.out.println("--> Inserted " + newBNode.data + " as the " +
                    "root");
        }
    }

    public void addNode(BNode node, BNode newNode) {
        if (newNode.data < node.data) {
            if (node.left != null) {
                addNode(node.left, newNode);
            } else {
                System.out.println("--> Inserted " + newNode.data +
                        " to the left of " + node.data);
                node.left = newNode;
            }
        } else if (newNode.data > node.data) {
            if (node.right != null) {
                addNode(node.right, newNode);
            } else {
                System.out.println("--> Inserted " + newNode.data +
                        " to the right of " + node.data);
                node.right = newNode;
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
        if (node.data == key) {
            return true;
        } else if (key > node.data) {
            return search(node.right, key);
        } else {//if (key < node.data) {
            return search(node.left, key);
        }
    }

    public void inOrder() {
        if(isEmpty()) {
            System.out.println("Tree is empty");
        } else {
            inOrder(root);
        }
    }

    public void inOrder(BNode node) {
        if(node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

}

