import java.util.*;

public class zigzagLevelOrderTree {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root==null) return res;
        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        boolean or = true;
        while(!q.isEmpty()){
        	List<Integer> l = new LinkedList<Integer>();
        	int size = q.size();
        	
        	if(or){
        		for(int i=0; i<size;i++){
            		TreeNode n = q.remove(0);
                	l.add(n.val);
                	if(n.left !=null) q.add(n.left);
                	if(n.right !=null) q.add(n.right);
            	}
        	}
        	else{
        		for(int i=0; i<size;i++){
            		TreeNode n = q.remove(q.size()-1);
                	l.add(n.val);
                	if(n.right !=null) q.add(0, n.right);
                	if(n.left !=null) q.add(0, n.left);
            	}
        	}
        	res.add(l);
        	or=!or;
        }
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a = new TreeNode(1);
		a.left = new TreeNode(2);
		a.right = new TreeNode(3);
		a.left.left = new TreeNode(4);
		a.left.right = new TreeNode(5);
		a.right.left = new TreeNode(6);
		a.right.right = new TreeNode(7);
		a.left.left.left = new TreeNode(8);
		a.left.left.right = new TreeNode(9);
		a.left.right.left = new TreeNode(10);
		a.left.right.right = new TreeNode(11);
		a.right.left.left = new TreeNode(12);
		a.right.left.right = new TreeNode(13);
		a.right.right.left = new TreeNode(14);
		a.right.right.right = new TreeNode(15);
		System.out.println(zigzagLevelOrder(a));
	}

}
