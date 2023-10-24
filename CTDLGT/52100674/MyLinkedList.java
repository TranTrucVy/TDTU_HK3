import java.util.NoSuchElementException;
public class MyLinkedList <E> implements ListInterface <E> {
    private Node <E> head;
    private int numNode;
    public MyLinkedList(){
        head = null;
        numNode = 0;
}
    
    @Override
    public void addFirst(E item){
        head = new Node<E>(item, head);
        numNode++;
}
    @Override
    public void addAfter(Node<E> curr, E item){
        if(curr == null){
            addFirst(item);
        }
        else{
            Node<E> newNode = new Node<E>(item, curr.getNext());
            curr.setNext(newNode);
            numNode++;
        }
}
    @Override
    public void addLast(E item){
        if(head == null){
            head = new Node<E>(item,head);
            numNode++;
        }
        else{
        Node<E> tmp = head;
        while(tmp.getNext() != null){
            tmp = tmp.getNext();
        }
        Node<E> newNode = new Node<E>(item,null);
        tmp.setNext(newNode);
        numNode++;
    }
    }

    @Override
    public E removeFirst() throws NoSuchElementException{
        if(head==null){
            throw new NoSuchElementException("Empty node");
        }
        else{
            Node<E> tmp = head;
            head = head.getNext();
            numNode--;
            return tmp.getData();
        }
}
    @Override
    public E removeAfter(Node<E> curr) throws NoSuchElementException{
        if(curr == null){
            throw new NoSuchElementException("Empty node");
        }
        else{
            Node<E> delNode = curr.getNext();
            if(delNode != null){
                curr.setNext(delNode.getNext());
                numNode--;
                return delNode.getData();
            }
            else{
                throw new NoSuchElementException("Empty node");
            }
        }
}
    @Override
    public E removeLast() throws NoSuchElementException{
        if(head == null){
            throw new NoSuchElementException("Empty node");
        }
        else{
            Node<E> preNode = null;
            Node<E> delNode = head;
            if(delNode.getNext() == null){
                removeFirst();
            }
            while(delNode.getNext() != null){
                preNode = delNode;
                delNode = delNode.getNext();
            }
            preNode.setNext(delNode.getNext());
            numNode--;
            return delNode.getData();
        }     
}
    @Override
    public void print(){
        if(head != null){
            Node<E> tmp = head;
            System.out.print("List: " + tmp.getData());
            tmp = tmp.getNext();
            while(tmp != null)
{
            System.out.print(" -> " + tmp.getData());
            tmp = tmp.getNext();
}
            System.out.println();
}
        else{
            System.out.println("List is empty!");
}
}
    @Override
    public boolean isEmpty(){
       if(numNode == 0) return true;
       return false;
}
    @Override
    public E getFirst() throws NoSuchElementException{
        if(head== null){
            throw new NoSuchElementException("");
        }
        else{
            return head.getData();
        }
}
    @Override
    public Node<E> getHead(){
        return head;
}
    public E getLast() throws NoSuchElementException{
        if(head == null){
            throw new NoSuchElementException("Empty list");
        }
        else{
            Node<E> tmp =head;
            while(tmp.getNext() != null){
                tmp = tmp.getNext();
            }
            return tmp.getData();
        }
    }
    @Override
    public Node<E> getHead(){
        return head;
    }

    @Override
    public E getFirst()throws RuntimeException{
        if (isEmpty()) throw new RuntimeException();
        return head.getData();
    }

    @Override
    public Node<E> getLast()throws RuntimeException{
        if (isEmpty()) throw new RuntimeException();
        Node<E> tmp = head;
        while (tmp.getNext() != null){
            if (tmp.getNext() == null){
                return tmp;
            }
        }
        return null;
    }

    @Override
    public Node<E> getNodeByIndexOf(int index){
        if (index > size) throw new IllegalArgumentException("Your input is out of range of linked list");
        int i = 0;
        if (index > 0 || index < size){
            Node<E> newNode = head;
            while (newNode != null){
                if (i == index){
                    return newNode;
                }
                newNode = newNode.getNext();
                i++;
            }
        }
        return null;
    }

    @Override
    public boolean contains(E item) throws NoSuchElementException,IllegalArgumentException{
        if (isEmpty()){
            throw new NoSuchElementException("Empty linked list");
        }
        else if (item == null){
            throw new IllegalArgumentException();
        }
        else if(head.getData() == item){
            return true;
        }
        else if(head.getData() != item){
            Node<E> newNode = head;
            while (newNode != null){
                if (newNode.getData().equals(item)){
                    return true;
                }
                newNode = newNode.getNext();
            }
        }
        return false;
    }

    @Override
    public void addFirst(E item){
        head = new Node<>(head,item);
        size++;
    }

    @Override
    public void addLast(E item) throws NoSuchElementException {
        if(isEmpty()) {addFirst(item);}
        Node<E> runNode = head;
        while (runNode.getNext() != null){
            runNode = runNode.getNext();
        }
        Node<E> newNode = new Node<E>(runNode.getNext(),item);
        runNode.setNext(newNode);
        size++;
    }

    @Override
    public void addAfter(Node<E> current, E item)throws NoSuchElementException{
        if (isEmpty()) throw new NoSuchElementException("Empty linked list");
        Node<E> newNode = new Node<E>(current.getNext(),item);
        current.setNext(newNode);
        size++;
    }

    @Override
    public Node<E> removeFirst()throws RuntimeException{
        if(isEmpty()) throw new RuntimeException("Empty Linked List");
        else{
            Node<E> headNode = head;
            head = head.getNext();
            size--;
            return headNode;
        }
    }

    @Override
    public Node<E> removeAfter(Node<E> current) throws NoSuchElementException{
        if (isEmpty()) throw new NoSuchElementException("Empty Linked List");
        Node<E> currentNode = head;
        Node<E> preNode = null;
        if(current == head){
            return removeFirst();
        }
        while (currentNode.getNext() != null){
            if (currentNode == current){
                preNode.setNext(currentNode.getNext());
                size--;
            }
            preNode = currentNode;
            currentNode = currentNode.getNext();
        }
        return null;
    }

    @Override
    public Node<E> removeLast() throws NoSuchElementException{
        if (isEmpty()) throw new NoSuchElementException("Empty Linked List");
        Node<E> currentNode = head;
        Node<E> preNode = null;
        if (currentNode.getNext() == null){
            removeFirst();
        }
        while (currentNode.getNext() != null){
            preNode = currentNode;
            currentNode = currentNode.getNext();
        }
        preNode.setNext(currentNode.getNext());
        size--;
        return currentNode;
    }

    @Override
    public Node<E> removeCurr(Node<E> curr) throws NoSuchElementException,IllegalArgumentException {
        if (isEmpty()) throw new NoSuchElementException("Empty Linked List");
        if (curr == null) throw new IllegalArgumentException();
        if (curr.equals(head)){
            return removeFirst();
        }
        Node<E> currentNode = head;
        while(currentNode.getNext() != null){
            if (currentNode.getNext() == curr){
                currentNode.setNext(curr.getNext());
                size--;
                return curr;
            }
            currentNode = currentNode.getNext();
        }
        return null;
    }

    @Override
    public String toString() {
        if (isEmpty())
            return "[]";
        else {
            StringBuilder sb = new StringBuilder(size);
            sb.append("[");
            Node<E> currentNode = head;
            while (currentNode != null) {
                sb.append(currentNode.getData());
                if (currentNode.getNext() != null) {
                    sb.append(",");
                }
                currentNode = currentNode.getNext();
            }
            sb.append("]");
            return sb.toString();
        }

    }

    @Override
    public void reverse() throws NoSuchElementException {
        if (isEmpty()) throw new NoSuchElementException("Empty Linked List");
        Node<E> current = head;
        Node<E> prev = null;
        Node<E> next = null;
        while(current != null){
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        head = prev;
    }

    public Node<E> getMiddleNode (Node<E> head)throws NoSuchElementException{
        if (isEmpty()) throw new NoSuchElementException("Empty Linked List1");
        Node<E> slow = head;
        Node<E> fast = head.getNext();
        while (fast != null){
            fast = fast.getNext();
            if (fast != null) {
                slow = slow.getNext();
                fast = fast.getNext();
            }
        }
        return slow;
    }

    public Node<E> sortedMerge(Node<E> left, Node<E> right){
        Node<E> result = null;
        if (left == null) return right;
        if (right == null) return left;
        if (left.getData().compareTo(right.getData()) <= 0){
            result = left;
            result.setNext(sortedMerge(left.getNext(), right));
        }
        else{
            result = right;
            result.setNext(sortedMerge(left,right.getNext()));
        }
        return result;
    }

    public Node<E> mergeSort (Node<E> node){
        if (node == null || node.getNext() == null) return node;
        Node<E> mid = getMiddleNode(node);
        Node<E> nextMid = mid.getNext();
        mid.setNext(null);
        Node<E> left = mergeSort(node);
        Node<E> right = mergeSort(nextMid);
        Node<E> sortedList = sortedMerge (left,right);
        return sortedList;
    }

    public void selection (){
        Node<E> currentNode = head;
        while (currentNode != null) {
            Node<E> min = currentNode;
            Node<E> r = currentNode.getNext();

            while (r != null){
                if (min.getData().compareTo(r.getData()) > 0){
                    min = r;
                }
                r = r.getNext();
            }
            E x = currentNode.getData();
            currentNode.setData(min.getData());
            min.setData(x);
            currentNode = currentNode.getNext();
        }
    }

    public void printList(Node<E> node)
    {
        while (isEmpty()) {
            System.out.print(head.getData() + " ");
            node = node.getNext();
        }
    }

}

//     @Override
//     public int sumEven(){
//         int sum = 0;
//         if(head == null){
//             return 0;
//         }else{
//         while(head != null){
//             if((head.getData())%2==0){
//                 sum += head.getData();
//             }
//             head = head.getNext();
//         }
//     }
//         return sum;
// }
    @Override
    public int size(){
        return numNode;
}
    @Override
    public boolean contains(E item){
        Node<E> tmp = head;
        while( tmp != null){
            if(tmp.getData().equals(item))
                return true;
            tmp = tmp.getNext();
            }
            return false;
        }
}
//INT LINKED LIST
// import java.util.NoSuchElementException;

// public class IntLinkedList implements ListInterface{
//     private Node head;
//     private int size = 0;

//     public IntLinkedList() {
//         head = null;
//     }

//     @Override
//     public boolean isEmpty() {
//         return head == null;
//     }

//     @Override
//     public int size (){
//          return size;
//     }


//     @Override
//     public void addFirst(int data) {
//         head = new Node(data, head);
//         size++;
//     }

//     @Override
//     public void addLast(int data) {
//         if (isEmpty()) addFirst(data);
//         else{
//             Node currentNode = head;
//             while (currentNode.getNext() != null) {
//                 currentNode = currentNode.getNext();
//             }
//             currentNode.setNext(new Node(data, null));
//             size++;
//         }

//     }

//     @Override
//     public boolean removeAt(int position) {
//         if (position<0 || position >= size) {
//             throw new IllegalArgumentException();
//         }
//         if (isEmpty()) {
//             return false;
//         }
//         if (position == 0) {
//             head = head.getNext();
//             size--;
//             return true;
//         }

//         int index = 0;
//         boolean flag = false;
//         Node preNode = null;
//         Node currentNode = head;
//         while (currentNode != null){
//             flag=false;
//             if (position == index){
//                 preNode.setNext(currentNode.getNext());
//                 size--;
//                 flag = true;
//             }
//             preNode = currentNode;
//             currentNode = currentNode.getNext();
//             index++;
//         }

//         return flag;
//     }

//     @Override
//     public int countOdd() {
//         if (isEmpty()) return 0;
//         else{
//             int count = 0;
//             Node current = head;
//             while (current != null){
//                 if (current.getData() % 2 != 0){
//                     count++;
//                 }
//                 current = current.getNext();
//             }
//             return count;
//         }
//     }

//     @Override
//     public int searchKey(int key) {
//         if (isEmpty()){
//             throw new NoSuchElementException("Empty linked list");
//         }
//         else if(head.getData() == key){
//             return 0;
//         }
//         else if(head.getData() != key){
//             int index = 0;
//             Node newNode = head;
//             while (newNode != null){
//                 if (newNode.getData()==(key)){
//                     return index;
//                 }
//                 newNode = newNode.getNext();
//                 index++;
//             }
//         }
//         return -1;
//     }

//     @Override
//     public boolean checkSorted()
//     {
//         if (isEmpty())
//             return true;
//         for (Node t = head; t.getNext() != null; t = t.getNext()){
//             if (t.getData() <= t.getNext().getData())
//                 return false;
//         }
//         return true;
//     }
// public void removeFifthElement() throws NoSuchElementException {
//     if (numNodes < 5) throw new NoSuchElementException();
//     else {
//         Node temp = this.head;
//         int counter = 0;
//         Node prev = null;
//         while (temp.getNext() != null && counter < 4) {
//             prev = temp;
//             temp = temp.getNext();
//             counter++;
//         }
//         prev.setNext(temp.getNext());
//     }
// }

// public int lastEvenPosition() {
//     if (this.head == null) {
//         return -1;
//     }
//     else {
//         Node temp = this.head;
//         int position = -1, i =0;
        
//         while (temp != null) {
//             if (temp.getValue() % 2 == 0) {
//                 position = i;
//             }
//             i++;
//             temp = temp.getNext();
//         }
//         if (position == -1) {
//             return -1;
//         }else {
//             return position;
//         }
//     }
// }    


//     @Override
//     public String toString() {
//         if (isEmpty())
//             return "[]";
//         else {
//             StringBuilder sb = new StringBuilder(size);
//             sb.append("[");
//             Node currentNode = head;
//             while (currentNode != null) {
//                 sb.append(currentNode.getData());
//                 if (currentNode.getNext() != null) {
//                     sb.append(",");
//                 }
//                 currentNode = currentNode.getNext();
//             }
//             sb.append("]");
//             return sb.toString();
//         }

//     }


// }
// public void addFirst(int value){
//     Node newNode = new Node (value,null);
//     newNode.setNext(head);
//     head = newNode;
//     size++;
// }

// public void removeFifthElement() throws NoSuchElementException {
//     if (size < 5) {
        // System.out.println();
//         throw new NoSuchElementException();
//     }
//     else{
//         int count = 0;
//         Node current = head;
//         Node preNode = null;
//         while (current != null){
//             if (count == 4 ){
//                 preNode.setNext(current.getNext());
//                 size--;
//                 return ;
//             }
//             preNode = current;
//             current = current.getNext();
//             count++;
//         }
//     }
// }

// public int minPosition () {
//     if (head == null) {return -1;}
//     Node current = head;
//     int min_id = 0;
//     int count = 0;
//     while (current.getNext() != null){
//         if (current.getValue() <= current.getNext().getValue()){
//             min_id = count ;
//         }
//         current = current.getNext();
//         count++;
//     }
//     return min_id;

// public boolean addFirst(int value) {
//     if (head == null){
//         head = new Node(value,null);
//         numNode++;
//         return true;
//     }
//     Node curr = head;
//     while(curr!= null){
//         if (curr.getValue() == value){
//             return false;
//         }
//         curr = curr.getNext();
//     }
//     head = new Node(value, head);
//     numNode++;
//     return true;
// }
// @Override
// public boolean addAfterKey(int value, int key) {
//     if (head == null){
//         return false;
//     }
//     Node curr = head;
//     while(curr!=null){
//         if (curr.getValue() == key){
//             Node newNode = new Node(value, curr.getNext());
//             curr.setNext(newNode);
//             numNode++;
//             return true;
//         }
//         curr = curr.getNext();
//     }
//     return false;
// }
// @Override
// public int countElementGreaterThan(int value) {
//     Node curr = head;
//     int count = 0;
//     while(curr!=null){
//         if (curr.getValue()>value)
//             count++;
//         curr = curr.getNext();
//     }
//     return count;
// }
// public int sumEven(){
//     int sum = 0;
//     if(head == null){
//         return 0;
//     }else{
//     while(head != null){
//         if((head.getValue())%2==0){
//             sum += head.getValue();
//         }
//         head = head.getNext();
//     }
// }
//     return sum;
// }
// DOUBLE LINKEDLIST
// import java.util.NoSuchElementException;
// public class MyDoubleLinkedList {
//     private DoubleNode head;
//     private int num_nodes;
    
//     public MyDoubleLinkedList() {
//         this.head = null;
//         this.num_nodes = 0;
//     }
// public boolean addFirst(double data) {
//     if (head == null){
//         head = new DoubleNode(data,null);
//         size++;
//         return true;
//     }
//     DoubleNode curr = head;
//     while(curr!= null){
//         if (curr.getData() == data){
//             return false;
//         }
//         curr = curr.getNext();
//     }
//     head = new DoubleNode(data, head);
//     size++;
//     return true;
// }

// public void addCuoi(double data)throws NoSuchElementException {
//     if(isEmpty()) {
//         addFirst(data);
//     }
//     DoubleNode tmp = head;
//     while (tmp.getNext() != null){
//         tmp = tmp.getNext();
//     }
//     DoubleNode newNode = new DoubleNode(data,null);
//     tmp.setNext(newNode);
//     size++;
//     }
//     public boolean addLast(double data){
//         addCuoi(data);
//         return true;
//     }

//     public void addFirst(double item) {
//         DoubleNode newNode = new DoubleNode(item);
//         newNode.setNext(head);
//         if (head == null) {
//             head =  newNode;
//         }else {
//             head.setPrev(newNode);
//             newNode.setNext(head);
//             head = newNode;
//         }
//         num_nodes++;
//     }

//     public void addAfter(DoubleNode curr, double item) {
//         if (curr != null) {
//             DoubleNode newNode = new DoubleNode(item);
//             newNode.setNext(curr.getNext());
//             newNode.setPrev(curr);
//             curr.setNext(newNode);
//             num_nodes++;
//         }else {
//             addFirst(item);
//         }
//     }

//     public double removeFirst() throws NoSuchElementException {
//         if (head == null) throw new NoSuchElementException("can not remove an empty list");
//         else {
//             double res = head.getData();
//             head = head.getNext();
//             head.setPrev(null);
//             num_nodes--;
//             return res;
//         }
//     }

//     public double removeAfter(DoubleNode curr) throws NoSuchElementException {
//         if (curr == null) throw new NoSuchElementException("can not remove an empty list");
//         else {
//             DoubleNode delNode = curr.getNext();
//             if (delNode != null) {
//                 curr.setNext(delNode.getNext());
//                 delNode.getNext().setPrev(curr);
//                 num_nodes--;
//                 return delNode.getData();
//             }else {
//                 throw new NoSuchElementException("no next element to remove");
//             }
//         }
//     }

//     public DoubleNode find(DoubleNode item) throws NoSuchElementException{
//         if (head == null) throw new NoSuchElementException("can not find in empty list");
//         else {
//             DoubleNode temp =  head;
//             while (temp.getNext() != null) {
//                 if (temp.getData() == item.getData()) {
//                     return temp;
//                 }
//             }
//             return null;
//         }
//     }


//     public DoubleNode getHead() {
//         return this.head;
//     }

//     public int size() {
//         return this.num_nodes;
//     }

//     public boolean contains(DoubleNode item) {
//         if (head == null) { 
//             return  false;
//         }else {
//             DoubleNode temp = head;
//             while (temp.getNext() != null) {
//                 if (temp.getData() == item.getData()) {
//                     return true;
//                 }
//             } 
//             return false;
//         }
//     }
//     public void print() {
//         if (head == null) System.out.println("list is empty");
//         else {
//             DoubleNode temp = head;
//             System.out.print("list: "+ temp.getData());
//             temp = temp.getNext();
//             while (temp != null) {
//                 System.out.print(" -> " + temp.getData());
//                 temp = temp.getNext();
//             }
//             System.out.println("");
//         }
//     }

// }
// CHARLINKED LIST
// import java.util.*;
// public class CharLinkedList implements ListInterface {
//     private Node head;
  
//     public CharLinkedList() {
//       this.head = null;
//     }
  
//     @Override
//     public Node getHead() {
//       return this.head;
//     }
  
//     @Override
//     public void addFirst(char data) {
//         head = new Node (data, head);
//     }
  
//     @Override
//     public boolean addAfterFirstKey(char data, char key) {
//         if (head == null){
//             return false;
//         }
//         Node curr = head;
//         while(curr!=null){
//             if (curr.getData() == key){
//                 Node newNode = new Node(data, curr.getNext());
//                 curr.setNext(newNode);
//                 return true;
//             }
//             curr = curr.getNext();
//         }
//         return false;
//     }
  
//     @Override
//     public int largestCharPostition() {
//       int index = -1, i = 0;
//       int max = Integer.MIN_VALUE;
//       Node temp = head;
//       while (temp != null) {
//         if ((int) temp.getData() > max) {
//           max = (int) temp.getData();
//           index = i;
//         }
//         i++;
//         temp = temp.getNext();
//       }
//       return index;
//     }
  
//     public void print(Node curr) {
//       if (curr == null)
//         return;
//       System.out.print(curr.getData() + " ");
//       print(curr.getNext());
//     }

//   }

// sinhvien
// public String firstMaxGPAStudent(){
//     if(stuList.getHead() == null){
//         return "";
//     }
//     //SV code them tai day va co the thay doi gia tri return ben duoi cho phu hop
//     else{
//         Node<Student> current = stuList.getHead();
//         Node<Student> studentmax = stuList.getHead();
//         while (current != null){
//             if (current.getData().getGPA() > studentmax.getData().getGPA()){
//                 studentmax = current;
//             }
//             current =current.getNext();
//         }
//         return studentmax.getData().getName();
//     }
// }