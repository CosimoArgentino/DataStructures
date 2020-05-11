package linkedlist;

public class LinkedListTest {
    public static void main(String[] args){
        LinkedListImpl listImpl = new LinkedListImpl();
        listImpl.addNode(10);
        listImpl.addNode(78);
        listImpl.addNode(64);
        listImpl.addNode(98);
        System.out.println("Looking for 50... : " + listImpl.search(50));
        listImpl.printLinkedList();
        listImpl.addNodeAtStart(50);
        listImpl.printLinkedList();
        listImpl.removeNodeAtIndex(2);
        listImpl.printLinkedList();
    }
}
