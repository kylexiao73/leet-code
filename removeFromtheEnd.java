
public class removeFromtheEnd {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public ListNode removeNthFromEnd(ListNode head, int n) {
	        int l =0;
	        ListNode h = new ListNode(0);
	        h.next = head;
	        ListNode first = head;
	        while(first.next!=null) {
	        	l++;
	        	first = first.next;
	        }
	        first = head.next;
	        for(int i=0; i<l-n;i++) {
	        	first = first.next;
	        	if(i==l-n+2) {
	        		first = first.next.next;
	        	}
	        }
	        return h.next;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
