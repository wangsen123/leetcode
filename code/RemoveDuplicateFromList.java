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
	           
	        // ��dummyHead������һ�������ͷ��Ч�ؼ����˹���������  
	        ListNode dummyHead = new ListNode(Integer.MIN_VALUE);  
	        dummyHead.next = head;  
	        ListNode pre = dummyHead;  
	        ListNode cur = pre.next;  
	        ListNode next = cur.next;  
	        boolean dup = false;        // �ж��Ƿ����ظ�  
	           
	        while(true){  
	            if(next == null){  
	                break;  
	            }  
	            if(cur.val != next.val){  
	                if(dup){        // ������ظ��ģ�������  
	                    pre.next = next;  
	                    dup = false;        // �ָ�dup  
	                }else{      // ����ͬ������pre  
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
	           
	        // ɨβ���������������{1,1}�������������ж�һ��  
	        if(dup){  
	            pre.next = next;  
	        }  
	        return dummyHead.next;      }
	}
}
