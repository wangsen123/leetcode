package code;
//Remove Nth Node From End of List Total Accepted: 46481 Total Submissions: 167543 My Submissions Question Solution 
//Given a linked list, remove the nth node from the end of list and return its head.
//
//For example,
//
//   Given linked list: 1->2->3->4->5, and n = 2.
//
//   After removing the second node from the end, the linked list becomes 1->2->3->5.
//Note:
//Given n will always be valid.
//Try to do this in one pass.
public class RemoveNthNodeFromEndofList {
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	       	ListNode result=new ListNode(0);
	        result.next=head;
	        ListNode node=head;
	        ListNode post=head;
	        for(int i=0;i<n;i++){
	        	post=post.next;
	        }
	        if(post==null)
	        	return result.next.next;
	        while(post.next!=null){
	        	post=post.next;
	        	node=node.next;
	        }
	        node.next=node.next.next;
	        return result.next;
	        
	 }
}
