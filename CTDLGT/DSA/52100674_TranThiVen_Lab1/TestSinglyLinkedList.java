public class TestSinglyLinkedList{
    public static void main(String[] args){
        ListInterface<Integer> myList = new SinglyLinkedList<Integer>();
        IntegerLinkedList list = new IntegerLinkedList();
        myList.addFirst(10);
        myList.addFirst(6);
        myList.addFirst(4);
        myList.addFirst(9);
        myList.addFirst(2);
        myList.addLast(5);
        myList.selection();
        System.out.println(myList);
    }
}