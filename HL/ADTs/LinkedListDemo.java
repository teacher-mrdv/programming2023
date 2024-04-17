public class LinkedListDemo
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        Node addNode = new Node(5);
        list.append(addNode);
        addNode.data = 3;
        list.append(addNode);
        list.printLinkedList();
        list.insert(new Node(9), new Node(3)); list.printLinkedList();
        list.insert(new Node(6), new Node(5)); list.printLinkedList();
        list.insert(new Node(8), new Node(7)); list.printLinkedList();
        list.insert(new Node(0), new Node(999)); list.printLinkedList();
        Node deleteNode = new Node(3);
        list.delete(deleteNode); list.printLinkedList();
        deleteNode.data = 5;
        list.delete(deleteNode); list.printLinkedList();
        deleteNode.data = 0;
        list.delete(deleteNode); list.printLinkedList();

        System.out.println();
        LinkedList list2 = new LinkedList();
        addNode.data = 1;
        list2.append(addNode);
        addNode.data = 5;
        list2.append(addNode);
        addNode.data = 2;
        list2.append(addNode);
        addNode.data = 7;
        list2.append(addNode);
        addNode.data = 0;
        list2.append(addNode);
        list2.printLinkedList();

		deleteNode.data = 1;
        list2.delete(deleteNode); list2.printLinkedList();
        deleteNode.data = 2;
        list2.delete(deleteNode); list2.printLinkedList();
        deleteNode.data = 0;
        list2.delete(deleteNode); list2.printLinkedList();

		/*
        list2.insertBefore(1,2); list2.printLinkedList();
        list2.insertAfter(2,2); list2.printLinkedList();
        list2.delete(1); list2.printLinkedList();
        */
    }
}

