package code;
//Reverse Nodes in k-Group Total Accepted: 29152 Total Submissions: 115092 My Submissions Question Solution 
//Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
//
//If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
//
//You may not alter the values in the nodes, only nodes itself may be changed.
//
//Only constant memory is allowed.
//
//For example,
//Given this linked list: 1->2->3->4->5
//
//For k = 2, you should return: 2->1->4->3->5
//
//For k = 3, you should return: 3->2->1->4->5
public class ReverseNodesinkGroup {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	 public ListNode reverseKGroup(ListNode head, int k) {
		 //k<=1
	       if(k<=1)
				return head;
		    ListNode prehead=new ListNode(0);
		    ListNode realp=prehead;
		    ListNode preverse=prehead;
		    ListNode p=head;
		    //give head initial value
		    prehead.next=head;
		    while(p!=null){
		    	ListNode first=p;
		    	int count=0;
		    	while(count<k){
		    	//count ++  count and p is same	
		    		if(p==null)
		    			break;
		    		count++;
		    		p=p.next;
		    		
		    	}
		    	// find break real condition
		    	if(count<k)
		    		break;
		    	preverse=reverse(first,p);
		    	realp.next=preverse;
		    	realp=first;
		    	realp.next=p;
		    }
		    return prehead.next;
		    
		}
		private ListNode reverse(ListNode first, ListNode p) {
			// TODO 自动生成的方法存根
			ListNode prehead2=new ListNode(0);
			ListNode newp=null;
			ListNode postp=null;
			ListNode rep=first;
		
			while(rep!=p){
				prehead2.next=rep;
				newp=rep;
				rep=rep.next;
				newp.next=postp;
				postp=newp;
			}
			return prehead2.next;
		}

}
