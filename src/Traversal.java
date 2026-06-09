import java.util.*;
public class Traversal {
  public static void main(String[] args) {
    TreeNode<Integer> root = new TreeNode<>(10);

    root.left = new TreeNode<>(9);
    root.left.left = new TreeNode<>(5);
    root.left.right = new TreeNode<>(2);

    root.right = new TreeNode<>(15);
    root.right.left = new TreeNode<>(-3);
    root.right.right = new TreeNode<>(5);
    root.right.right.right = new TreeNode<>(22);

    TreeNode<String> stringRoot = new TreeNode<>("hello");

    stringRoot.left = new TreeNode<>("hi");
    stringRoot.left.left = new TreeNode<>("Food");
    stringRoot.left.right = new TreeNode<>("car");

    stringRoot.right = new TreeNode<>("house");
    stringRoot.right.left = new TreeNode<>("tree");
    stringRoot.right.right = new TreeNode<>("store");
    stringRoot.right.right.right = new TreeNode<>("phone");

    preOrder(root);
    inOrder(root);
    postOrder(root);
    printGreaterThan(root, 1);
    TreeNode<Integer> megaroot = new TreeNode<Integer>(1);

    TreeNode<Integer> current = megaroot;

for (int i=0; i < 100_001; i++) {
  current.right = new TreeNode<Integer>(i);
  current = current.right;
}
// preOrder(megaroot);
preOrderIrterative(megaroot);


  }
  public static int countNodes(TreeNode<?> current) {
  if (current == null) return 0;



  int leftCount = countNodes(current.left);
  int rightCount = countNodes(current.right);

  // int total = rightCount + leftCount + 1;
  return 1 + leftCount + rightCount ;
}


public static void preOrderIrterative(TreeNode<?> root){
  Stack<TreeNode<?>> stack = new Stack<>();
  stack.push(root);
  while(!stack.isEmpty()) {
    TreeNode<?> current = stack.pop();
    if(current == null) continue;
    System.out.println(current.data);
    stack.push(current.right);
    stack.push(current.left);
  }

}
  public static <E> void preOrder(TreeNode<E> current) {
    if (current == null) return;
    System.out.println(current.data);

    preOrder(current.left);
    preOrder(current.right);
    return;
  }

  public static void printGreaterThan(TreeNode<Integer> current, int threshold) {
    if (current == null) return;
    if (current.data > threshold) {
      System.out.println(current.data);
    }
    printGreaterThan(current.left, threshold);
    printGreaterThan(current.right, threshold);
  }




  public static void inOrder(TreeNode<?> current) {
    if (current == null) return;
    inOrder(current.left);


    System.out.println(current.data);
    inOrder(current.right);
    return;
  }

  public static <E> void postOrder(TreeNode<E> current) {
    if (current == null) return;
    postOrder(current.left);
    postOrder(current.right);
    E myValue = current.data;
    System.out.println(current.data);
    return;
  }
}
