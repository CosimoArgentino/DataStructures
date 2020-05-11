package linkedlist;

/**
 * author: Cosimo Argentino
 * This rapresents the node of the list.
 * For this example I've used just an int as value,
 * but we can use complex objects of course
 */
public class Node {
    private int value;
    private Node next;

    public Node(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
