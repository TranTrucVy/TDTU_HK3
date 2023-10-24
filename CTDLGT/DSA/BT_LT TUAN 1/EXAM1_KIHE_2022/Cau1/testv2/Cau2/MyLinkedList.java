public class MyLinkedList<E> {
    private Node<E> head;

    public MyLinkedList(){
        this.head = null;
    }

    public Node<E> getHead(){
        return this.head;
    }

    public void addFirst(E data){
        head = new Node<E>(data, head);
    }

    public String toString() {
        String result = "[";
        if (head != null) {
            Node<E> tmp = head;
            result += tmp.getData();
            tmp = tmp.getNext();
            while (tmp != null) {
                result += ", " + tmp.getData();
                tmp = tmp.getNext();
            }
        }
        return result += "]";
    } 
}
