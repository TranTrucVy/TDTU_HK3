public class Node{
    private int x;
    private Node next;

    public Node (int x){
        this.x = x;
    }

    public Node getNext(){
        return this.next;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public int getX(){
        return this.x;
    }
}