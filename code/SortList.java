package code;
//Sort a linked list in O(n log n) time using constant space complexity.
public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)
        	return head;
        ListNode p=head, q=head, pre = null; 
        while(q!=null&&q.next!=null){
        	q=q.next.next;
        	pre=p;
        	p=p.next;
        }
        pre.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(p);
        return merge(left,right);
    }
	private ListNode merge(ListNode left, ListNode right) {
		// TODO Auto-generated method stub
		ListNode p=left;
		ListNode q=right;
		ListNode prehead=new ListNode(0);
		ListNode iter=prehead;
		while(p!=null&&q!=null){
			if(p.val>q.val){
				iter.next=q;
				q=q.next;
				iter=iter.next;
			}else{
				iter.next=p;
				p=p.next;
				iter=iter.next;
			}
				
		}
		if(p!=null){
			iter.next=p;
		}else{
			iter.next=q;
		}
		return prehead.next;
	}
}
