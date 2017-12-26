import java.util.LinkedList;

public class nextRightPointer {
	public static class TreeLinkNode {
		int val;
		TreeLinkNode left, right, next;
		TreeLinkNode(int x) { val = x; }
	}
	public static void connect(TreeLinkNode root) {
       if(root==null) return;
       LinkedList<TreeLinkNode> list = new LinkedList<TreeLinkNode>();
       root.next = null;
       list.offer(root);
       while(!list.isEmpty()){
    	   int size = list.size();
    	   for(int i=0; i<size;i++){
    		   TreeLinkNode curr = list.pop();
    		   if(curr!=null){
        		   if(curr.left!=null){
        			   curr.left.next = curr.right;
        		   }
        		   if(curr.right!=null) curr.right.next=null;
        		   list.offer(curr.left);
        		   list.offer(curr.right);
    		   }
    			   
    	   }
       }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeLinkNode root = new TreeLinkNode(0);
		root.left = new TreeLinkNode(1);
		root.right = new TreeLinkNode(2);
		root.left.left = new TreeLinkNode(3);
		
		connect(root);
		System.out.println(root.left.next);
	}

}
