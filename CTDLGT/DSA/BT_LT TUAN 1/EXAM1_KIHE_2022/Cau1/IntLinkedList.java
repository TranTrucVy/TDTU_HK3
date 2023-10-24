import java.util.*;
public class IntLinkedList implements LinkedListInterface{
	private Node head;
    private int size = 0;
	
	public IntLinkedList(){
		this.head = null;
	}
    public int size (){
        return size;
    }
	
	//define methods here
    public void addFirst(int value){
        Node newNode = new Node (value,null);
        newNode.setNext(head);
        head = newNode;
        size++;
    }
    
    public void removeFifthElement() throws NoSuchElementException {
        if (size < 5) {
            // System.out.println();
            throw new NoSuchElementException();
        }
        else{
            int count = 0;
            Node current = head;
            Node preNode = null;
            while (current != null){
                if (count == 4 ){
                    preNode.setNext(current.getNext());
                    size--;
                    return ;
                }
                preNode = current;
                current = current.getNext();
                count++;
            }
        }
    }
    
	public int minPosition () {
        if (head == null) {return -1;}
        Node current = head;
        int min_id = 0;
        int count = 0;
        while (current.getNext() != null){
            if (current.getValue() <= current.getNext().getValue()){
                min_id = count ;
            }
            current = current.getNext();
            count++;
        }
        return min_id;
    }
	public String toString() {
        String result = "[";
        if (head != null) {
            Node tmp = head;
            result += tmp.getValue();
            tmp = tmp.getNext();
            while (tmp != null) {
                result += ", " + tmp.getValue();
                tmp = tmp.getNext();
            }
        }
        return result += "]";
    }
}