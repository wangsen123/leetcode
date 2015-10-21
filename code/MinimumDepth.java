package code;
//Given a binary tree, find its minimum depth.
//
//The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
public class MinimumDepth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int minDepth(TreeNode root) {
		if(root == null) return 0;  
        int left = minDepth(root.left);  
        int right = minDepth(root.right);  
        if(left == 0 && right ==0) return 1; 
        //����е���Ϊ�յĻ��Ͱ�����ȸ�ֵΪ���
        if(left == 0) left = Integer.MAX_VALUE;  
        //����е���Ϊ�յĻ��Ͱ�����ȸ�ֵΪ���
        if(right == 0) right = Integer.MAX_VALUE;  
        return Math.min(left, right)+1;       
	}
}
