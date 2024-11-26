public class QueueLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null; // Only check head since tail will be null if head is null
        }

        public static void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1; // Return -1 or throw an exception
            }
            int front = head.data;
            if (tail == head) {
                tail = head = null; // Reset both head and tail if the queue becomes empty
            } else {
                head = head.next; // Move head to the next node
            }
            return front; // Add a semicolon here
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1; // Return -1 or throw an exception
            }
            return head.data; // Return the front element
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        while (!queue.isEmpty()) { // Change to while loop to continue until the queue is empty
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}