public class LinkedListDemo
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        Node addNode = new Node(5);
        list.append(addNode);
        addNode = new Node(3);
        list.append(addNode);
        list.printLinkedList();
        list.insert(new Node(9), new Node(3)); list.printLinkedList();
        list.insert(new Node(6), new Node(5)); list.printLinkedList();
        list.insert(new Node(8), new Node(7)); list.printLinkedList();
        list.insert(new Node(0), new Node(999)); list.printLinkedList();
        Node deleteNode = new Node(3);
        list.delete(deleteNode); list.printLinkedList();
        deleteNode = new Node(5);
        list.delete(deleteNode); list.printLinkedList();
        deleteNode = new Node(0);
        list.delete(deleteNode); list.printLinkedList();

        System.out.println("\nAPPEND");
        LinkedList list2 = new LinkedList();
        addNode = new Node(1);
        list2.append(addNode);
        addNode = new Node(5);
        list2.append(addNode);
        addNode = new Node(2);
        list2.append(addNode);
        addNode = new Node(7);
        list2.append(addNode);
        addNode = new Node(0);
        list2.append(addNode);
        list2.printLinkedList();

		System.out.println("\nDELETE");
		deleteNode = new Node(1);
        list2.delete(deleteNode); list2.printLinkedList();
        deleteNode = new Node(2);
        list2.delete(deleteNode); list2.printLinkedList();
        deleteNode = new Node(0);
        list2.delete(deleteNode); list2.printLinkedList();
        
        System.out.println("\nINSERT");
        list2.insertBefore(new Node(1),2); list2.printLinkedList();
        list2.insertAfter(new Node(2),2); list2.printLinkedList();
        list2.delete(new Node(1)); list2.printLinkedList();
        
    }
}

