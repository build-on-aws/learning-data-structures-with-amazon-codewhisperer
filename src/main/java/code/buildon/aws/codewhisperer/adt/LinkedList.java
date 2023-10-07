package code.buildon.aws.codewhisperer.adt;

// Implement a singly linked list.

public class LinkedList {

    private NodeElement head;
    private NodeElement tail;
    private int size;
    
    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(int data) {
        NodeElement node = new NodeElement(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
        }
        size++;
    }

    public int size() {
        return size;
    }

    // Create a method to print the list.
    public void print() {
        NodeElement current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
        System.out.println();
    }

    // Create a method to print the list in reverse order.
    public void printReverse() {
        NodeElement current = tail;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getPrev();
        }
        System.out.println();
    }

    // Create a method to insert a new element in the middle of the list.
    public void addElementToMiddle(int data) {
        NodeElement node = new NodeElement(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            NodeElement current = head;
            int i = 0;
            while (i < size / 2) {
                current = current.getNext();
                i++;
            }
            node.setNext(current.getNext());
            current.setNext(node);
            node.setPrev(current);
        }
        size++;
    }

    // Create a method that retrieves the element in the middle of the list.
    public int getMiddle() {
        NodeElement current = head;
        int i = 0;
        while (i < size / 2) {
            current = current.getNext();
            i++;
        }
        return current.getData();
    }

    // Create a method to add random values to the list, given a number of elements
    // to be provided as a parameter.
    public void addRandomValues(int numberOfElements) {
        for (int i = 0; i < numberOfElements; i++) {
            add((int) (Math.random() * 100));
        }
    }

    // Create a method to sort the list.
    public void sort() {
        NodeElement current = head;
        while (current != null) {
            NodeElement next = current.getNext();
            while (next != null) {
                if (current.getData() > next.getData()) {
                    int temp = current.getData();
                    current.setData(next.getData());
                    next.setData(temp);
                }
                next = next.getNext();
            }
            current = current.getNext();
        }
    }

    // Create a method to remove the first element of the list and
    // call this method 'removeFirst'.
    public int removeFirst() {
        int data = head.getData();
        head = head.getNext();
        head.setPrev(null);
        size--;
        return data;
    }

    // Implement a method to retrieve the first element of the list.
    public int getFirst() {
        return head.getData();
    }

    // Create a method to find the max element in the list.
    public int findMax() {
        NodeElement current = head;
        int max = current.getData();
        while (current != null) {
            if (current.getData() > max) {
                max = current.getData();
            }
            current = current.getNext();
        }
        return max;
    }

    // Main method.
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addRandomValues(10);
        list.print();
        System.out.println("------------");
        list.sort();
        list.print();
    
    }
    
}

class NodeElement {

    int data;
    NodeElement next;
    NodeElement prev;

    NodeElement() {
    }

    NodeElement(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodeElement getNext() {
        return next;
    }

    public void setNext(NodeElement next) {
        this.next = next;
    }

    public NodeElement getPrev() {
        return prev;
    }

    public void setPrev(NodeElement prev) {
        this.prev = prev;
    }

}
