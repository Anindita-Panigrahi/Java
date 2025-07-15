import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left,right;

    TreeNode(int x){
        val=x;
    }
}
public class postorderTraversal {
    public static List<Integer> postOrderTraverse(TreeNode root){
        List <Integer> arr = new ArrayList<>();
        postorder(root,arr);
        return arr;
    }
    public static void postorder(TreeNode root, List<Integer> arr){
        if(root==null){
            return;
        }
        postorder(root.left, arr);
        postorder(root.right, arr);
        arr.add(root.val);
        
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<Integer> result = postOrderTraverse(root);
        System.out.println("Postorder Traversal: " + result);
    }
}
