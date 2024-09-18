public class BSTTest {
    public static void main(String[] args) {
        BSTree myBST = new BSTree(5);
        myBST.addNode(8);
        myBST.addNode(6);
        myBST.addNode(4);
        myBST.addNode(2);
        //search O(logN)
        System.out.println("9? " + myBST.search(9));
        System.out.println("6? " + myBST.search(6));
        System.out.println("5? " + myBST.search(5));
        System.out.println("1? " + myBST.search(1));
        // traversals
        myBST.inOrder();
        System.out.println();
        //myBST.preOrder();
        System.out.println();
        //myBST.postOrder();
        System.out.println();
    }
}
