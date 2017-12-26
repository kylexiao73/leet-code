
public class mergeTwoSortedArrays {
	 public static class ListNode {
		 int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode asn = dummy;
        
        while(l1!=null || l2!=null) {
        	
        	
        	if(l1 ==null || (l2!=null && l1.val>=l2.val)) {
        		asn.next = l2;
        		l2 = l2.next;
        	}
        	else if(l2 ==null || (l1!=null && l2.val>=l1.val)) {
        		System.out.println(l1.val+" ");
        		asn.next = l1;
        		l1 = l1.next;
        	}
        	asn = asn.next;
        	
        }
      return dummy.next; 
    }
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		
		ListNode l2 = new ListNode(3);
		l2.next = new ListNode(4);
		l2.next.next = new ListNode(5);
		System.out.println(mergeTwoLists(l1,l2));
		

	
	}
}
