public class Test {
    public static void main(String[] args){
        
        SortedLinkedList list = new SortedLinkedList();
        
        list.add(5);
        list.add(6);
        list.add(9);
        list.add(8);
        list.add(15);
        list.add(7);
        list.print();
        System.out.println("");
        list.remove(6);
        list.print();
    }
}
