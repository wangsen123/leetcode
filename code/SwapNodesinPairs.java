package code;
//Swap Nodes in Pairs Total Accepted: 43260 Total Submissions: 133314 My Submissions Question Solution 
//Given a linked list, swap every two adjacent nodes and return its head.
//
//For example,
//Given 1->2->3->4, you should return the list as 2->1->4->3.
//
//Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
public class SwapNodesinPairs {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}
	 public ListNode swapPairs(ListNode head) {
		   if(head==null||head.next==null)
		    	return head;
		    ListNode prehead=new ListNode(0);
		    ListNode p=prehead;
		    ListNode one=head;
		    ListNode two=head.next;
		   
		    while(true){
		    	ListNode three=two.next;
		    	p.next=two;
		    	two.next=one;
		    	one.next=three;
		    	p=p.next.next;
		    	//������û����
		    	if(p.next==null)
		    		break;
		    	one=p.next;
		    	//��������һ��
		    	if(one.next==null)
		    		break;
		    	two=one.next;
		    	
		    }
		    //��ʹ��prehead.next
		    return prehead.next;
	 }

}
