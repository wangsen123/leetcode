package code;

import java.util.ArrayList;

public class ReorderList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void reorderList(ListNode head) {
	   ListNode cur=head;
	   ArrayList<ListNode> list=new ArrayList<>();
	   while(cur!=null){
		   list.add(cur);
		   cur=cur.next;
	   }
	   ListNode prehead=new ListNode(0);
	   cur=prehead;
	   int length=list.size();
	   int i;
	   for(i=0;i<length/2;i++){
		   cur.next=list.get(i);
		   cur=cur.next;
		   cur.next=list.get(length-1-i);
		   cur=cur.next;
	   }
	   if(length%2==1){
		   cur.next=list.get(i);
		   cur=cur.next;
	   }
	   cur.next=null;
	   
	}
}
