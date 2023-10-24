public class MainStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>(5);

        //Pushing elements into stack
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        //Peek element from stack
        System.out.println(stack.peek());

        System.out.println("Size of stack is " + stack.size());

        //Popping Stack
        stack.pop();
        System.out.println("\nAfter popping out");
        stack.printStack();

      }
}
