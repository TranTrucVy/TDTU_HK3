import java.util.*;
public class Test {
    public static void main(String[] args) {
      CharLinkedList list = new CharLinkedList();
      list.addFirst('A');
      list.addFirst('b');
      list.addFirst('c');
      list.addFirst('D');
      list.addFirst('e');
      list.addFirst('E');

      list.print(list.getHead());
      System.out.println();
      System.out.println(list.addAfterFirstKey('E', 'b'));
      list.print(list.getHead());
      System.out.println();
      System.out.println(list.largestCharPostition());
    }
  }