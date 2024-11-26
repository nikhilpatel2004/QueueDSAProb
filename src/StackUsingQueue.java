import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    static class Stack {


        static Queue<Integer> q1 = new LinkedList<Integer>();
        static Queue<Integer> q2 = new LinkedList<Integer>();


        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }
        public static void push(int data) {
            if(!q1.isEmpty()){
                q2.add(data);
            }else{
                q2.add(data);
            }
        }
        public static int pop() {
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int top =-1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top=q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }

                }else{
                while(!q2.isEmpty()){
                    top=q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }

            }
            return top;
        }
        public static int peek() {
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int top =-1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top=q1.remove();

                    q2.add(top);
                }

            }else{
                while(!q2.isEmpty()){
                    top=q2.remove();

                    q1.add(top);
                }

            }
            return top;

        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }


    }
}
