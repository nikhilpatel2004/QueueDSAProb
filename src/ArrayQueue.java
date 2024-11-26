public class ArrayQueue {
    static class Queue {
        private int[] arr; // Array to hold queue elements
        private int size;  // Maximum size of the queue
        private int rear;  // Index of the last element
        private int front;
        // Constructor to initialize the queue
        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }


        // Check if the queue is empty
        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }
        public boolean isFull() {
            return (rear+1)%size == front;
        }

        // Add an element to the queue
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Remove an element from the queue
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            // Shift elements to the left
front = (front + 1) % size;
if(rear == front) {
    rear =  front=-1;
}else{
    front = (front + 1) % size;
}
            return  result;
        }

        // Peek at the front element of the queue
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3); // Create a queue of size 5
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        // Display and remove elements from the queue
        while (!q.isEmpty()) {
            System.out.println("Front element: " + q.peek());
            q.remove();
        }
    }
}
