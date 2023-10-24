public class Main {
    public static void main (String[] args){
        AVL avl = new AVL();
        avl.add(20);
        avl.add(7);
        avl.add(15);
        avl.add(36);
        avl.add(8);
        avl.add(22);
        avl.add(4);
        avl.add(47);
        avl.remove(50);
        avl.preOrder();
    }
}