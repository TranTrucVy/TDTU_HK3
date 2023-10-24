import java.util.*;
public class CharLinkedList implements ListInterface {
    private Node head;
  
    public CharLinkedList() {
      this.head = null;
    }
  
    @Override
    public Node getHead() {
      return this.head;
    }
  
    @Override
    public void addFirst(char data) {
        head = new Node (data, head);
    }
  
    @Override
    public boolean addAfterFirstKey(char data, char key) {
        if (head == null){
            return false;
        }
        Node curr = head;
        while(curr!=null){
            if (curr.getData() == key){
                Node newNode = new Node(data, curr.getNext());
                curr.setNext(newNode);
                return true;
            }
            curr = curr.getNext();
        }
        return false;
    }
  
    @Override
    public int largestCharPostition() {
      int index = -1, i = 0;
      int max = Integer.MIN_VALUE;
      Node temp = head;
      while (temp != null) {
        if ((int) temp.getData() > max) {
          max = (int) temp.getData();
          index = i;
        }
        i++;
        temp = temp.getNext();
      }
      return index;
    }
  
    public void print(Node curr) {
      if (curr == null)
        return;
      System.out.print(curr.getData() + " ");
      print(curr.getNext());
    }

  }