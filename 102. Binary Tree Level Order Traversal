import java.util.*;

public class levelOrderOfTree {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root==null) return res;
        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        while(!q.isEmpty()){
        	int size = q.size();
        	List<Integer> l = new ArrayList<Integer>();
        	for(int i=0; i<size;i++){
        		TreeNode n = q.pop();
            	l.add(n.val);
            	if(n.left !=null) q.offer(n.left);
            	if(n.right !=null) q.offer(n.right);
        	}
        	res.add(l);
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a = new TreeNode(1);
		a.left = new TreeNode(2);
		a.right = new TreeNode(3);
		System.out.println(levelOrder(a));
	}

}
