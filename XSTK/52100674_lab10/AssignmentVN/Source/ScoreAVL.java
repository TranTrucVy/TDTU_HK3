public class ScoreAVL extends AVL {

  public ScoreAVL() {
    super();
  }

  public void insert(Student key) {
    this.root = insert(this.root, key);
  }

  private Node insert(Node node, Student key) {
    if (node == null) {
      node = new Node(key);
    } else {
      if (node.getData().compareToByScore(key) > 0) {
        if (node.getLeft() != null) {
          node.setLeft(insert(node.getLeft(), key));
        } else {
          node.setLeft(new Node(key));
        }
      } else if (node.getData().compareToByScore(key) < 0) {
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
}
