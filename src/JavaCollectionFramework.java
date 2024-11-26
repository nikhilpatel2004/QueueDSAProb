import java.util.*;
public class JavaCollectionFramework {
    public static void main(String[] args) {
        //Queue<Integer> queue = new LinkedList<>(); // ArrayDeque
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);


        while(!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();

        }
    }
}
