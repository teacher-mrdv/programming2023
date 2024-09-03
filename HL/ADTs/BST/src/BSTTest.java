public class BSTTest {
    public static void main(String[] args) {
        BSTree myBST = new BSTree(5);
        myBST.addNode(8);
        myBST.addNode(6);
        myBST.addNode(4);
        myBST.addNode(2);
        myBST.inOrder();
    }
}
