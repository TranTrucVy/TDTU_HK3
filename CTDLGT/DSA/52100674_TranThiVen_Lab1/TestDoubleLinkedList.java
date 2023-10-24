public class TestDoubleLinkedList {
    public static void main(String[] args) {
        DoubleLinkedList myList = new DoubleLinkedList();

        myList.addFirst(1.5);
        myList.addFirst(2.0);
        myList.addFirst(4.5);
        myList.addFirst(6.5);
        myList.addFirst(2.1);
        myList.addFirst(0.5);
        
        System.out.println(myList);
    }
}