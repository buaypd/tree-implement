public class Traversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(10);

    root.left = new TreeNode(9);
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(2);

    root.right = new TreeNode(15);
    root.right.left = new TreeNode(-3);
    root.right.right = new TreeNode(5);
    root.right.right.right = new TreeNode(22);

    preOrder(root);
    inOrder(root);
    postOrder(root);
  }

  public static void preOrder(TreeNode current) {
    if (current == null) return;
    System.out.println(current.data);

    preOrder(current.left);
    preOrder(current.right);
    return;
  }
  public static void inOrder(TreeNode current) {
    if (current == null) return;
    inOrder(current.left);


    System.out.println(current.data);
    inOrder(current.right);
    return;
  }

  public static void postOrder(TreeNode current) {
    if (current == null) return;
    postOrder(current.left);
    postOrder(current.right);

    System.out.println(current.data);
    return;
  }
}
