package linkedlist;


/**
 * author: Cosimo Argentino
 * For now it's just a starting example.
 * I'll add Lombok and thread sync to share this list
 * with multiple threads
 */
public class LinkedListImpl {

    private Node head = null;
    private Node tail = null;

    /**
     * add a node
     * @param val
     */
    public void addNode(int val){
        if(head==null){
            Node temp = new Node(val);
            head = temp;
            tail = temp;
        }else{
            tail.setNext(new Node(val));
            tail = tail.getNext();
        }
    }

    public void addNodeAtStart(int val){
        if(head==null){
            Node temp = new Node(val);
            head = temp;
            tail = temp;
        }else{
            Node temp = new Node(val);
            temp.setNext(head);
            head = temp;
        }
    }

    public void addNodeAtIndex(int val, int index){
        Node temp = head;
        int count = 0;
        while(temp!=null && ++count!=index)
            temp = temp.getNext();
        Node node  = new Node(val);
        node.setNext(temp.getNext());
        temp.setNext(node);
    }


    public void removeNode(){
        Node temp = head;
        while(temp.getNext()!=null && temp.getNext().getNext()!=null){
            temp = temp.getNext();
        }
        temp.setNext(null);
        tail = temp;
    }


    /**
     * This is interesting, indeed with C or C++
     * we must free the memory after the assignment
     */
    public void removeFirstNode(){
        //here, garbage collector will destroy the lost object
        head = head.getNext();
    }


    public void removeNodeAtIndex(int index){
        Node temp = head;
        int count = 0;
        while(temp!=null && count!=index) {
            temp = temp.getNext();
            count++;
        }
        if(temp!=null && temp.getNext()!=null) {
            temp.setValue(temp.getNext().getValue());
            temp.setNext(temp.getNext().getNext());
        }
    }


    public boolean search(int target){
        Node temp = head;
        while(temp!=null){
            if(temp.getValue() == target){
                return true;
            }else{
                temp = temp.getNext();
            }
        }
        return false;

    }


    public int searchAndReturnIndex(int target){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            if(temp.getValue()==target){
                return count;
            }else{
                temp = temp.getNext();
            }
        }
        return -1;
    }

    public void printLinkedList(){
        System.out.println();
        Node temp = head;
        while(temp!=null){
            System.out.print(" "+temp.getValue());
            temp = temp.getNext();
        }
    }


}



