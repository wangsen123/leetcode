package code;
//Reverse Linked List II My Submissions Question Solution 
//Total Accepted: 50939 Total Submissions: 195918 Difficulty: Medium
//Reverse a linked list from position m to n. Do it in-place and in one-pass.
//
//For example:
//Given 1->2->3->4->5->NULL, m = 2 and n = 4,
//
//return 1->4->3->2->5->NULL.
//
//Note:
//Given m, n satisfy the following condition:
//1 ≤ m ≤ n ≤ length of list.
public class ReverseLinkedListII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode reverseBetween(ListNode head, int m, int n) {
       if(m>=n)
    	   return head;
       ListNode prehead=new ListNode(0);
       prehead.next=head;
       //p对应i 得到前一个
       ListNode p=prehead;
       int i;
       for(i=0;i<m-1&&p!=null;i++){
    	   p=p.next;
       }
       if(p==null){
    	   return head;
       }
       //p表示前一个
       ListNode first=p.next;
       ListNode s=p.next;
       	//保存当前要插入的值
       ListNode pres;
       for(;i<n&&s!=null;i++){
    	   pres=s;
    	   s=s.next;
    	   pres.next=p.next;
    	   p.next=pres;
   
       }
       first.next=s;
       return prehead.next;
    }
}
