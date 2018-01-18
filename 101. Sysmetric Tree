
public class sysmetricTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public boolean isSymmetric(TreeNode root) {
		if(root==null) return true;
		boolean b = isSym(root.left,root.right);
		return b;
	 }
	private boolean isSym(TreeNode left, TreeNode right){
		if(left==null && right ==null) return true;
		if(left==null || right ==null) return false;
		boolean v;
		if(left.val==right.val) v=true;
		else v = false;
		
		boolean a = isSym(left.left,right.right);
		boolean b = isSym(left.right, right.left);
		return v&&a&&b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
