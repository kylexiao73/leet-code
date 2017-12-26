
public class preInOrderTree {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public static TreeNode buildTree(int[] preorder, int[] inorder) {
       if(preorder.length==0 || inorder.length==0 
    		   || preorder.length!=inorder.length) return null;
       TreeNode root = helper(inorder,preorder,0,0,preorder.length-1);
       
       return root;
    }
	private static TreeNode helper(int[] in, int[] pre,int start,int instart, int inend){
		
		if(start >=in.length || instart>inend){
			return null;
		}
		TreeNode root = new TreeNode(pre[start]);
		int i =instart;
		while(i<=inend){
			if(in[i]==pre[start]) break;
			i++; //root = 1, i=7
		}
		root.left= helper(in,pre,start+1,instart,i-1);
		//for right tree, start = i + left tree size
		root.right = helper(in,pre,start+(i-instart+1),i+1,inend);
		return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in = {8,4,9,2,10,5,11,1,12,6,13,3,14,7,15};
		int[] pre = {1,2,4,8,9,5,10,11,3,6,12,13,7,14,15};
		System.out.println(buildTree(in,pre).val);
	}
}
