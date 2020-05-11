package linkedlist;

public class LinkedListImpl {

    private Node head = null;
    private Node tail = null;

    /*
            * Adds node at the end of the current list
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

    /*
     * Adds node at the start of the current list
     */
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

    /*
     * Adds node at the certain index.
     */
    public void addNodeAtCertainIndex(int val, int index){
        Node temp = head;
        int count = 0;
        while(temp!=null && ++count!=index)
            temp = temp.getNext();
        Node node  = new Node(val);
        node.setNext(temp.getNext());
        temp.setNext(node);
    }

    /*
     * Removes the last node in the given list and updates tail node
     */
    public void removeNode(){
        Node temp = head;
        while(temp.getNext()!=null && temp.getNext().getNext()!=null){
            temp = temp.getNext();
        }
        temp.setNext(null);
        tail = temp;
    }

    /*
     * Removes the first node in the given list and updates head node
     *
     */
    public void removeNodeAtStart(){
        //The first node would become zombie and should be garbage collected after the below operation
        head = head.getNext();
    }

    /*
     * Removes the node at the given index in the given list and updates head node
     *
     */
    public void removeNodeAtCertainIndex(int index){
        Node temp = head;
        int count = 0;
        while(temp!=null && ++count!=index)
            temp = temp.getNext();
        temp.setValue(temp.getNext().getValue());
        temp.setNext(temp.getNext().getNext());
    }

    /*
     * Checks if a node with the given value exist in the list, returns true or false.
     * Alternatively you can return the index too.
     */
    public boolean search(int target){
        Node temp = head;
        while(temp!=null){
            if(temp.getValue() == target)
                return true;
        }
        return false;

    }

    /*
     * Checks if a node with the given value exist in the list, returns the index of the given value in the list.
     */
    public int searchAndReturnIndex(int target){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            if(temp.getValue()==target) return count;
        }
        return -1;
    }

    /*
     * Prints the current list
     */

    public void printLinkedList(){
        System.out.println();
        Node temp = head;
        while(temp!=null){
            System.out.print(" "+temp.getValue());
            temp = temp.getNext();
        }
    }


}



