import java.util.*;

public class StudentManagement {
  private AVL tree;
  private Stack<Node> undoState;
  private Stack<Node> redoState;

  public StudentManagement() {
    this.tree = new AVL();
    this.undoState = new Stack<Node>();
    this.redoState = new Stack<Node>();
  }

  public AVL getTree() {
    return this.tree;
  }

  public Node copy(Node root) {
    if (root == null) return root;
    Node root_copy = new Node(root.getData());
    root_copy.setLeft(copy(root.getLeft()));
    root_copy.setRight(copy(root.getRight()));
    return root_copy;
  }
  
  // Requirement 1
  public boolean addStudent(Student st) {
    // code here
    if (!this.tree.contain(st.getId())) {
      Node a = copy(this.getTree().getRoot());
      undoState.push(a);
      this.getTree().insert(st);
    }
    return true;
  }

  // Requirement 2
  public Student searchStudentById(int id) {
    Node node = this.tree.search(id);
    if (node == null) return null; else return node.getData();
  }

  // Requirement 3
  public boolean removeStudent(int id) {
    // code here
    this.redoState.clear();
    if (this.tree.contain(id)) {
      Node a = copy(this.getTree().getRoot());
      undoState.push(a);
      this.getTree().delete(searchStudentById(id));
    }
    return true;
  }

  // Requirement 4
  public void undo() {
    Node a = copy(this.getTree().getRoot());
    this.redoState.push(a);
    if (!undoState.isEmpty()) {
      this.tree.setRoot(undoState.peek());
      undoState.pop();
    }
  }

  // Requirement 5
  public void redo() {
    if (!redoState.isEmpty()) {
      Node redoNode = redoState.peek();
      this.tree.setRoot(redoNode);
      redoState.pop();
    }
  }

  // Requirement 6
  public ScoreAVL scoreTree(AVL tree) {
    // code here
    ScoreAVL temp = new ScoreAVL();
    Node root = tree.root;
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);
    while (!q.isEmpty()) {
      Node curr = q.poll();
      if (curr == null) {
        if (!q.isEmpty()) {
          q.add(null);
        }
      } else {
        if (curr.getLeft() != null) q.add(curr.getLeft());
        if (curr.getRight() != null) q.add(curr.getRight());
        temp.insert(curr.getData());
      }
    }
    return temp;
  }
}
