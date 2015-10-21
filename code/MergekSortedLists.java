package code;
//Merge k Sorted Lists Total Accepted: 38333 Total Submissions: 181458 My Submissions Question Solution 
//Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import javax.xml.soap.Node;

//Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class MergekSortedLists {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ListNode node11=new ListNode(2);
		ListNode node12=new ListNode(4);
		ListNode node21=new ListNode(1);
		ListNode node22=new ListNode(7);
		ListNode node31=new ListNode(3);
		ListNode node32=new ListNode(5);
		ListNode node33=new ListNode(6);
		node11.next=node12;
		node21.next=node22;
		node31.next=node32;
		node32.next=node33;
		ArrayList<ListNode> list=new ArrayList<>();
		list.add(node11);
		list.add(node21);
		list.add(node31);
		ListNode headListNode=mergeKLists(list);
		ListNode p=headListNode;
		while(p!=null){
			System.out.print(p.val+" ");
			p=p.next;
		}
	}
	public static ListNode mergeKLists(List<ListNode> lists) {
		if(lists==null)
			return null;
        PriorityQueue<ListNode> pq=new PriorityQueue<ListNode>(lists.size(),new Comparator<ListNode>(){
        	//有正负就行
			@Override
			public int compare(ListNode o1, ListNode o2) {
				// TODO 自动生成的方法存根
				return o1.val-o2.val;
			}
        });

        //遍历每一个
        for(ListNode list:lists)
        	//有可能有空，空的不能加进去
        	if(list!=null)
        		pq.add(list);
        ListNode head=new ListNode(0);
        ListNode p=head;
        while(!pq.isEmpty()){
        	ListNode cur=pq.poll();
        	p.next=cur;
        	if(cur.next!=null)
        		pq.add(cur.next);
        	p=cur;
        }
        return head.next;
    }
}
