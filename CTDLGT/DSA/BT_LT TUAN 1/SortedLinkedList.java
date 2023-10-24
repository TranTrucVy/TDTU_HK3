public class SortedLinkedList {
    private Node head;
    private int size;
  
    public SortedLinkedList() {
      this.head = null;
      this.size = 0;
    }
  
    public int getSize() {
      return this.size;
    }
  
    public void add(Integer item) {
      Node newNode = new Node(item);
      if (head == null) {
          head = newNode;
          return;
      }
      Node currentNode = head;
      Node previousNode = null;
      while (currentNode != null && currentNode.getX() < item) {
        previousNode = currentNode;
        currentNode = currentNode.getNext();
      }
      if (previousNode == null) {
        newNode.setNext(currentNode);
        head = newNode;
        return;
      }
      previousNode.setNext(newNode);
      newNode.setNext(currentNode);
      size++;
    }
  
    public void remove(int item) {
      if (head == null) {
        return;
      }
      Node currentNode = head;
      Node previousNode = null;
      while (currentNode != null && currentNode.getX() != item) {
        previousNode = currentNode;
        currentNode = currentNode.getNext();
      }
      if (previousNode == null) {
        head = currentNode.getNext();
        currentNode.setNext(null);
        return;
      }
      if (currentNode == null) {
        return;
      }
      previousNode.setNext(currentNode.getNext());
      currentNode.setNext(null);
      size--;
    }
  
    public void print() {
      Node tmp = head;
      if (tmp == null) {
        System.out.println("Not item");
      } 
      while(tmp != null){
        System.out.print(tmp.getX() + " ");
        tmp = tmp.getNext();
      }
    }
}