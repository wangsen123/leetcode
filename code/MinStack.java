package code;
class Node{
	int val;
	int min;
	Node next;
	Node(int val) {
		// TODO Auto-generated constructor stub
		this.val=val;
	}
}
public class MinStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//首先是个栈，大小不固定，采用链表，并且我们使用一个值记录当前最小值
	
	    Node prehead=new Node(0);
	 	public void push(int x) {
	 		Node node=new Node(x);
	 		if(prehead.next==null){
	 			node.min=x;
	 		}else{
	 			node.min=Math.min(prehead.next.min,x);
	 		}
	 		node.next=prehead.next;
	 		prehead.next=node;
	 			
	    }

	    public void pop() {
	    	if(prehead.next!=null){
	    		prehead.next=prehead.next.next;
	    	}
	    }

	    public int top() {
	    	if(prehead.next!=null){
	    		return prehead.next.val;
	    	}else{
	    		return 0;
	    	}
	    		
	    }

	    public int getMin() {
	    	if(prehead.next!=null){
	    		return prehead.next.min;
	    	}else{
	    		return 0;
	    	}
	    }

}
