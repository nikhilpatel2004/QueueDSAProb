import java.util.*;
import java.util.LinkedList;

public class DequeueQueue {
    static class Queue {
        Deque<Integer> deque = new LinkedList<Integer>();

        public void push(int data) {
            deque.addLast(data);
        }

        public int pop() {
            return deque.removeFirst();
        }

        public int peek() {
            return deque.getFirst();

        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(1);
        q.push(2);
        q.push(3);

        System.out.println("peek = "+q.peek());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());

    }
}
