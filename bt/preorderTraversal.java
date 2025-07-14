import java.util.*;
class TreeNode { //tree defined here
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
    }
}

public class preorderTraversal {

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        if (root == null) return arr;

        arr.add(root.val);
        arr.addAll(preorderTraversal(root.left));
        arr.addAll(preorderTraversal(root.right));

        return arr;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<Integer> result = preorderTraversal(root);
        System.out.println("Preorder Traversal: " + result);
    }
}
