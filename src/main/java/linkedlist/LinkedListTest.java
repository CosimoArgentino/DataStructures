package linkedlist;

public class LinkedListTest {
    public static void main(String[] args){
        LinkedListImpl listImpl = new LinkedListImpl();
        listImpl.addNode(10);
        listImpl.addNode(20);
        listImpl.addNode(30);
        listImpl.addNode(40);
        listImpl.printLinkedList();
        listImpl.addNodeAtStart(50);
        listImpl.printLinkedList();
        listImpl.removeNode();
        listImpl.printLinkedList();
        listImpl.removeNodeAtCertainIndex(3);
        listImpl.printLinkedList();
    }
}
