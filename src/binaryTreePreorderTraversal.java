import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class binaryTreePreorderTraversal<> {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        helper(res, root);
        return res;
    }

    private void helper(List<Integer> res, TreeNode root) {
        if (root == null)  return;
        res.add(root.val);
        helper(res, root.left);
        helper(res, root.right);
    }

}
