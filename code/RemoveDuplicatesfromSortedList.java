package code;
//Remove Duplicates from Sorted List My Submissions Question Solution 
//Total Accepted: 74313 Total Submissions: 214827 Difficulty: Easy
//Given a sorted linked list, delete all duplicates such that each element appear only once.
//
//For example,
//Given 1->1->2, return 1->2.
//Given 1->1->2->3->3, return 1->2->3.
public class RemoveDuplicatesfromSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode deleteDuplicates(ListNode head) {
	  	ListNode prehead=new ListNode(0);
	  	ListNode p=head;
	  	ListNode q=prehead;
	  	while(p!=null){
	  		if(q==prehead){
	  			q.next=p;
	  			q=q.next;
	  		}else{
	  			if(q.val!=p.val){
	  				q.next=p;
	  				q=q.next;
	  			}
	  		}
	  		p=p.next;
	  	}
	  	//最后的处理，q后面为空
	  	q.next=null;
	  	return prehead.next;
    }	

}
