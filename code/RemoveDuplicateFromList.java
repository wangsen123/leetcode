package code;
//Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
//
//For example,
//Given 1->2->3->3->4->4->5, return 1->2->5.
//Given 1->1->1->2->3, return 2->3.
class ListNode {
    int val;
     ListNode next;
      ListNode(int x) {
        val = x;
        next = null;
     }
public class RemoveDuplicateFromList {
	
	 //Definition for singly-linked list.
	 
	}
	
	public class Solution {
	  public ListNode deleteDuplicates(ListNode head) {        if(head == null){  
	            return null;  
	        }  
	           
	        // 用dummyHead来增加一个虚拟表头有效地减少了工作量！！  
	        ListNode dummyHead = new ListNode(Integer.MIN_VALUE);  
	        dummyHead.next = head;  
	        ListNode pre = dummyHead;  
	        ListNode cur = pre.next;  
	        ListNode next = cur.next;  
	        boolean dup = false;        // 判断是否有重复  
	           
	        while(true){  
	            if(next == null){  
	                break;  
	            }  
	            if(cur.val != next.val){  
	                if(dup){        // 如果有重复的，就跳过  
	                    pre.next = next;  
	                    dup = false;        // 恢复dup  
	                }else{      // 否则同步更新pre  
	                    pre = cur;  
	                }  
	                cur = next;  
	                next = next.next;  
	            }  
	            else if(cur.val == next.val){  
	                dup = true;  
	                next = next.next;  
	            }  
	        }  
	           
	        // 扫尾工作，针对于例如{1,1}的情况，最后再判断一次  
	        if(dup){  
	            pre.next = next;  
	        }  
	        return dummyHead.next;      }
	}
}
