
public class validBTree {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public boolean isValidBST(TreeNode root) {
		 if(root==null) return true;
		 boolean b= dfs(root,null,null);
		 return b;
		 
	}
	private boolean dfs(TreeNode n, Integer max, Integer min){ //用Integer因为 n.val是object
		if(n==null) return true;
		if((min!=null && n.val>=min)||(max!=null && n.val<=max)){
			return false;
		}
		
		boolean l =dfs(n.left,max,n.val);
		boolean r =dfs(n.right,n.val,min);
		return l&&r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
