package code;
//Given a list, rotate the list to the right by k places, where k is non-negative.
//
//For example:
//Given 1->2->3->4->5->NULL and k = 2,
//return 4->5->1->2->3->NULL.


public class RotateList {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ListNode head=new ListNode(1);
		ListNode twoListNode=new ListNode(2);
		head.next=twoListNode;
		twoListNode.next=null;
		rotateRight(head,1);
	}
	public static ListNode rotateRight(ListNode head, int k) {
		ListNode dummyHead = new ListNode(Integer.MIN_VALUE);  
        dummyHead.next = head;  
        ListNode node=head;
        ListNode postnode=head;
        
        if(head==null)
               return null;
        int count=1;
        while(postnode.next!=null){
            postnode=postnode.next;
            count++;
        }
        //k值太大
        k=k%count;
        //恢复原值
        postnode=head;
        for(int i=0;i<k;i++){
        	    postnode=postnode.next;
        }
        
        while(postnode.next!=null){
        	postnode=postnode.next;
        	node=node.next;
        }
       
         //k值为0
         if(node.next!=null){   
         dummyHead.next=node.next;
         postnode.next=head;
         }
         else
            dummyHead.next=head;
         node.next=null;
        
        return dummyHead.next;
        
	}
}
