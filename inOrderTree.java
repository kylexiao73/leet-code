import java.util.*;

public class inOrderTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null) return res;
        dfs(res,root);
        
        return res;
    }
	private void dfs(List<Integer> res, TreeNode n){
		if(n == null){
			return;
		}
		dfs(res,n.left);
		res.add(n.val);
		dfs(res,n.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
