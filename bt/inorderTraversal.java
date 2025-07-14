import java.util.*;
class TreeNode { //tree defined here
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
    }
}

public class inorderTraversal {

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        if (root == null) return arr;

        arr.addAll(inorderTraversal(root.left));
        arr.add(root.val);
        arr.addAll(inorderTraversal(root.right));

        return arr;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<Integer> result = inorderTraversal(root);
        System.out.println("inorder Traversal: " + result);
    }
}
