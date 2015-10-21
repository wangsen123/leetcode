package code;
//Given a binary tree (any binary tree is ok)
//
//struct TreeLinkNode {
//  TreeLinkNode *left;
//  TreeLinkNode *right;
//  TreeLinkNode *next;
//}
//Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
//
//Initially, all next pointers are set to NULL.
//
//Note:
//
//You may only use constant extra space.
//You may assume that it is a perfect binary tree (ie, all leaves are at the same level, and every parent has two children).
//For example,
//Given the following perfect binary tree,
//     1
//   /  \
//  2    3
// / \  / \
//4  5  6  7
//After calling your function, the tree should look like:
//     1 -> NULL
//   /  \
//  2 -> 3 -> NULL
// / \  / \
//4->5->6->7 -> NULL


class TreeLinkNode {
     int val;
     TreeLinkNode left, right, next;
    TreeLinkNode(int x) { val = x; }
 }
public class PopulatingNextRightPointersinEachNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void connect(TreeLinkNode root) {
		//广度优先遍历不行的
		
//	    if(root==null)
//	    	return;
//	    Queue<TreeLinkNode> queue=new LinkedList<>();
//	    while(!queue.isEmpty()){
//	    	ArrayList<TreeLinkNode> arr=new ArrayList<>();
//	    	while(!queue.isEmpty()){
//	    		arr.add(queue.poll());
//	    	}
//	    	int length=arr.size();
//	    	for(int i=0;i<length-1;i++){
//	    		arr.get(i).next=arr.get(i+1);
//	    	}
//	    	for(int i=0;i<length;i++){
//	    		if(arr.get(i).left!=null){
//	    			queue.offer(arr.get(i).left);
//	    		}
//	    		if(arr.get(i).right!=null){
//	    			queue.offer(arr.get(i).right);
//	    		}
//	    	}
//	    }
	    if(root==null)
	    	return;
	    TreeLinkNode curp=root;
	    while(curp!=null){
	    	TreeLinkNode prefirst=new TreeLinkNode(0);
	    	TreeLinkNode pp=prefirst;
	    	while(curp!=null){
	    		if(curp.left!=null){
	    			//是对应的孩子节点。。。
	    			pp.next=curp.left;
	    			pp=pp.next;
	    		}
	    		if(curp.right!=null){
	    			//是对应的孩子节点。。。
	    			pp.next=curp.right;
	    			pp=pp.next;
	    		}
	    		curp=curp.next;
	    	}
	    	curp=prefirst.next;
	    }
	}
}
