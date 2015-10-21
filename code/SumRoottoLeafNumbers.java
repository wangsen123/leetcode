package code;

import java.util.LinkedList;
import java.util.Queue;

public class SumRoottoLeafNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int sumNumbers(TreeNode root) {
        if(root==null)
        	return 0;
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        Queue<Integer> intqueue=new LinkedList<>();
        intqueue.offer(root.val);
        queue.offer(root);
        int sum=0;
        while(!queue.isEmpty()){
        	TreeNode node=queue.poll();
        	Integer curint=intqueue.poll();
        	if(node.left==null&&node.right==null)
        		sum+=curint;
        	if(node.left!=null){
                intqueue.offer(curint*10+node.left.val);
                queue.offer(node.left);
        	}
        	if(node.right!=null){
        		//加入的是当前节点
                intqueue.offer(curint*10+node.right.val);
                queue.offer(node.right);
        	}
        }
        return sum;
    }
}
