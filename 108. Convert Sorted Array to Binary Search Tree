
public class sortedArrayToBST {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public TreeNode sortedArrayToBST(int[] nums) {
		if(nums == null) return null;
		TreeNode root = helper(nums,0,nums.length-1);
		return root;
	    }
	private TreeNode helper(int[] nums, int low, int high) {
		if(low>high) return null;
		int mid = low+(high-low)/2;
		TreeNode n = new TreeNode(nums[mid]);
		n.left = helper(nums,low,mid-1);
		n.right = helper(nums,mid+1, high);
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
