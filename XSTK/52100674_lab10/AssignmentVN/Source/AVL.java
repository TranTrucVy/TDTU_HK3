import java.util.ArrayList;

public class AVL {
  protected Node root;

  public AVL() {
    root = null;
  }

  public Node getRoot() {
    return this.root;
  }

  public void setRoot(Node root) {
    this.root = root;
  }

  public void insert(Student key) {
    this.root = insert(this.root, key);
  }

  private Node insert(Node node, Student key) {
    if (node == null) {
      node = new Node(key);
    } else {
      if (node.getData().compareTo(key) > 0) {
        if (node.getLeft() != null) {
          node.setLeft(insert(node.getLeft(), key));
        } else {
          node.setLeft(new Node(key));
        }
      } else if (node.getData().compareTo(key) < 0) {
        if (node.getRight() != null) {
          node.setRight(insert(node.getRight(), key));
        } else {
          node.setRight(new Node(key));
        }
      }
    }
    node.setHeight(
      Math.max(height(node.getLeft()), height(node.getRight())) + 1
    );
    return node = balance(node);
  }

  public Node search(int key) {
    return search(root, key);
  }

  private Node search(Node node, int key) {
    while (node != null) {
      if (node.getData().getId() == key) return node; else if (
        node.getData().getId() > key
      ) node = node.getLeft(); else node = node.getRight();
    }
    return null;
  }

  public void delete(Student key) {
    root = delete(root, key);
  }

  private Node delete(Node x, Student key) {
    if (x == null) {
      return x;
    } else if (x.getData().compareTo(key) > 0) {
      x.setLeft(delete(x.getLeft(), key));
    } else if (x.getData().compareTo(key) < 0) {
      x.setRight(delete(x.getRight(), key));
    } else {
      if (x.getLeft() == null && x.getRight() == null) return (
        x = null
      ); else if (x.getLeft() == null || x.getRight() == null) {
        x = (x.getLeft() == null) ? x.getRight() : x.getLeft();
      } else {
        Node temp = findMin(x.getRight());
        x.setData(temp.getData());
        x.setRight(delete(x.getRight(), temp.getData()));
      }
    }
    
    x.setHeight(Math.max(height(x.getLeft()), height(x.getRight())) + 1);
    if (x != null) x = balance(x);
    return x;
  }

  // ------------------Supported methods------------------
  public int height() {
    return height(root);
  }

  protected int height(Node node) {
    if (node == null) return -1;
    return node.getHeight();
  }

  private Node rotateLeft(Node x) {
    Node y = x.getRight();
    x.setRight(y.getLeft());
    y.setLeft(x);
    x.setHeight(1 + Math.max(height(x.getLeft()), height(x.getRight())));
    y.setHeight(1 + Math.max(height(y.getLeft()), height(y.getRight())));
    return y;
  }

  private Node rotateRight(Node x) {
    Node y = x.getLeft();
    x.setLeft(y.getRight());
    y.setRight(x);
    x.setHeight(1 + Math.max(height(x.getLeft()), height(x.getRight())));
    y.setHeight(1 + Math.max(height(y.getLeft()), height(y.getRight())));
    return y;
  }

  private int checkBalance(Node x) {
    return height(x.getLeft()) - height(x.getRight());
  }

  protected Node balance(Node x) {
    if (checkBalance(x) < -1) {
      if (checkBalance(x.getRight()) > 0) {
        x.setRight(rotateRight(x.getRight()));
      }
      x = rotateLeft(x);
    } else if (checkBalance(x) > 1) {
      if (checkBalance(x.getLeft()) < 0) {
        x.setLeft(rotateLeft(x.getLeft()));
      }
      x = rotateRight(x);
    }
    return x;
  }

  public ArrayList<Node> NLR() {
    ArrayList<Node> result = new ArrayList<Node>();
    NLR(this.root, result);
    return result;
  }

  private void NLR(Node node, ArrayList<Node> result) {
    if (node != null) {
      result.add(node);
      NLR(node.getLeft(), result);
      NLR(node.getRight(), result);
    }
  }

  private Node deleteMin(Node x) {
    if (x.getLeft() == null) return x.getRight();
    x.setLeft(deleteMin(x.getLeft()));
    return x;
  }

  private Node findMin(Node x) {
    if (x.getLeft() == null) return x; else return findMin(x.getLeft());
  }

  public boolean contain(int id) {
    return search(root, id) == null ? false : true;
  }
}
