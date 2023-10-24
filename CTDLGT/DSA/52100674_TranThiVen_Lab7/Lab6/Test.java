public class Test {
    public static TreeADT<String> createTree(String strKey) {
        TreeADT<String> tree = new BST<String>();
        String[] strKeys = strKey.split(" ");
        for (String str : strKeys) {
            tree.add(str);
        }
        return tree;
    }
    public static void main(String[] args) {
        TreeADT<Integer> tree = new BST<Integer>();
        tree.add(36);
        tree.add(50);
        tree.add(29);
        tree.add(53);
        tree.add(10);
        tree.add(32);
        tree.add(72);
        tree.add(99);
        System.out.println();
        tree.levelOrder();
        System.out.println();
        System.out.println(tree.height());
        System.out.println(tree.getLeftMostOfRight());
        tree.deleteMin();
        System.out.println();
        tree.deleteMin();
        System.out.println();
        tree.deleteMax();
        System.out.println();
        tree.deleteMax();
        System.out.println();
        Node<Integer> root =  tree.getRoot();
        System.out.println(tree.sum(root.getLeft()));
    }
}
