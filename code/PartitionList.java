package code;

public class PartitionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode partition(ListNode head, int x) {
	   ListNode p=head;
       ListNode prehead=new ListNode(0);
       ListNode lastless = prehead;
       ListNode greathead=new ListNode(0);
       ListNode lastgreat= greathead;
       while(p!=null){
    	   if(p.val<x){
    			   lastless.next=p;
    			   lastless=p;
    	   }else{
    		   lastgreat.next=p;
    		   lastgreat=p;
    	   }
    	   //注意增长
    	   p=p.next;   
       }
       lastless.next=greathead.next;
       //最后置空
       lastgreat.next=null;
       return prehead.next;
    }
}
