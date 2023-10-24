import java.util.EmptyStackException;

public class Stack<E> implements StackADT<E>{
      private E arr[];
      private int top;
      private int capacity;
      
      public Stack(int size) {
        arr = (E[]) new Object[size];
        capacity = size;
        top = -1;
      }
      @Override
      public boolean isEmpty() {
        return top == -1;
      }
      @Override
      // Check if the stack is full
      public boolean isFull() {
        return top == capacity - 1;
      }
      @Override
      public void push(E x) {
        System.out.println("Inserting " + x);
        arr[++top] = x;
      }
      @Override
      // Remove element from stack
      public E pop() {
        if (isEmpty()) {
          System.out.println("STACK EMPTY");
          // throw new EmptyStackException();
          System.exit(1);
        }
        return arr[top--];
      }
      
      @Override
      public E peek() {
        if (isEmpty()) {
          System.out.println("STACK EMPTY");
          System.exit(1);
        }
        return arr[top];
      }
      @Override
      public int size() {
        if (top == -1){
          return 0;
        }
        return top + 1;
      }

      @Override
      public void printStack() {
        for (int i = 0; i <= top; i++) {
          System.out.println(arr[i] + " ");
        }
      }

      @Override
      public boolean contains(E item)throws EmptyStackException,IllegalArgumentException {
        if (isEmpty()) throw new EmptyStackException();
        if (item == null) throw new IllegalArgumentException();
        for (int i = 0; i<=top; i++){
            if (arr[i].equals(item)){
              return true;
            }
        }
        return false;
      }
}

