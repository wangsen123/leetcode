package code;

public class ConvertSortedListtoBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode first = new ListNode(3);
		ListNode second = new ListNode(5);
		ListNode third = new ListNode(8);
		first.next=second;
		second.next=third;
		TreeNode a=sortedListToBST(first);
	    System.out.println(a);
	}
	public static TreeNode sortedListToBST(ListNode head) {
		   int len = 0;  
	       ListNode  node = head;  
	       while (node != null)  
	       {  
	           node = node.next;  
	           len++;  
	       }  
	       //node Çå0
	       node = head;
	       int[] nums=new int[len];
	       for(int i=0;node != null;node = node.next,i++){
	    	   nums[i]=node.val;
	       }
	       
	       return ConvertSortedArraytoBinarySearchTree.sortedArrayToBST(nums);     
	}

}
