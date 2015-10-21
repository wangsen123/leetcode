package code;
//You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8
public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode n1=l1;
		ListNode n2=l2;
		
        if(l1==null)
        	return l2;
        if(l2==null)
        	return l1;
        int val=l1.val+l2.val;
        int pro=0;
        if(val>=10){
        	val=val%10;
        	pro=1;
        }
        else{
        	pro=0;
        }
        ListNode addl=new ListNode(val);
        
        n1=n1.next;
        n2=n2.next;
        ListNode n3=addl;
        while(n1!=null&&n2!=null){
        	val=n1.val+n2.val+pro;
        	if(val>=10){
            	val=val%10;
            	pro=1;
            }
            else{
            	pro=0;
            }
        	ListNode node=new ListNode(val);
        	n3.next=node;
        	n3=n3.next;
        	n1=n1.next;
            n2=n2.next;
        }
        while(n2!=null){
        	val=n2.val+pro;
        	if(val>=10){
            	val=val%10;
            	pro=1;
            }
            else{
            	pro=0;
            }
        	ListNode node=new ListNode(val);
        	n3.next=node;
        	n3=n3.next;
        	
            n2=n2.next;
        }
        while(n1!=null){
        	val=n1.val+pro;
        	if(val>=10){
            	val=val%10;
            	pro=1;
            }
            else{
            	pro=0;
            }
        	ListNode node=new ListNode(val);
        	n3.next=node;
        	n3=n3.next;
        	
            n1=n1.next;
        }
        if(pro==1){
        	ListNode node=new ListNode(1);
        	n3.next=node;
        	n3=n3.next;
        }
        	
        return addl;
        
    }

}
