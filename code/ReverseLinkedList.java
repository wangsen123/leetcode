package code;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode reverseList(ListNode head) {
		ListNode prenode=new ListNode(0);
		ListNode node=head;
		while(node!=null){
			ListNode pre=node;
			node=node.next;
			pre.next=prenode.next;
			prenode.next=pre;
		}
		return prenode.next;
	}

}
