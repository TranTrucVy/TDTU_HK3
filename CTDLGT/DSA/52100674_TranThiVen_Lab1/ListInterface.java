import java.util.*;
public interface ListInterface<E>{
    public boolean isEmpty();

    public int size();

    public boolean contains(E item) throws NoSuchElementException,IllegalArgumentException;

    public Node<E> getHead();
    public E getFirst()throws RuntimeException;
    public Node<E> getLast()throws RuntimeException;
    public Node<E> getNodeByIndexOf(int index);

    public void addFirst(E item);
    public void addAfter(Node<E> current, E item)throws NoSuchElementException;
    public void addLast(E item)throws NoSuchElementException;

    public Node<E> removeFirst() throws RuntimeException;
    public Node<E> removeAfter(Node<E> current)throws NoSuchElementException;
    public Node<E> removeLast()throws NoSuchElementException;
    public Node<E> removeCurr(Node<E> curr)throws NoSuchElementException,IllegalArgumentException;

    public void reverse() throws NoSuchElementException;

    public String toString();

    public void setHead(Node<E> head);
    
    public void selection ();

    public void printList (Node<E> head);
}