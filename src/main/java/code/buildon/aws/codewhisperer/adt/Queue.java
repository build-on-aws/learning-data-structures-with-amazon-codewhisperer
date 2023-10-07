package code.buildon.aws.codewhisperer.adt;

public class Queue {

    // Implement a queue data structure using the code.buildon.aws.codewhisperer.adt.LinkedList.

    // private int[] queue;
    // private int front;
    // private int rear;
    // private int capacity;

    private LinkedList queue;

    public Queue() {
        queue = new LinkedList();
    }

    // public Queue(int capacity) {
    //     this.capacity = capacity;
    //     this.queue = new int[capacity];
    // }

    public void enqueue(int data) {
        // if (rear == capacity) {
        //     System.out.println("Queue is full");
        //     return;
        // }
        // queue[rear] = data;
        // rear++;
        queue.add(data);
    }

    public int dequeue() {
        // if (front == rear) {
        //     System.out.println("Queue is empty");
        //     return -1;
        // }
        // int data = queue[front];
        // front++;
        // return data;
        return queue.removeFirst();
    }

    public int peek() {
        // if (front == rear) {
        //     System.out.println("Queue is empty");
        //     return -1;
        // }
        // return queue[front];
        return queue.getFirst();
    }

    public void printQueue() {
        // for (int i = front; i < rear; i++) {
        //     System.out.print(queue[i] + " ");
        // }
        // System.out.println();
        queue.print();
    }

    public int size() {
        // return rear - front;
        return queue.size();
    }

    public boolean isEmpty() {
        // return front == rear;
        return queue.size() == 0;
    }

    // Create a method to find the max element in the list.
    public int findMax() {
        return queue.findMax();
    }

    // Main method.
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("------------");
        System.out.println("Max element: " + queue.findMax());
        System.out.println("------------");
        queue.printQueue();
        queue.enqueue(4);
        queue.printQueue();
        queue.dequeue();
        queue.dequeue();
        queue.printQueue();
        System.out.println(queue.peek());
        
    }

}
