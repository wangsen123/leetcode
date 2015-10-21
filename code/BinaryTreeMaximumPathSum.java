package code;
//Given a binary tree, find the maximum path sum.
//
//For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The path does not need to go through the root.
//
//For example:
//Given the below binary tree,
//
//       1
//      / \
//     2   3
//Return 6.
public class BinaryTreeMaximumPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int maxPathLength=Integer.MIN_VALUE;
	public int maxPathSum(TreeNode root) {
		
        if(root==null)
        	return 0;
        int a=getOneMaxSum(root);
        return maxPathLength;
    }
	private int getOneMaxSum(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)
			return 0;
		//左边单路长度
		int left_OneSum=getOneMaxSum(root.left);
		//右边单路长度
		int right_OneSum=getOneMaxSum(root.right);
		int sum=root.val;
		if(left_OneSum>0)
			sum+=left_OneSum;
		if(right_OneSum>0)
			sum+=right_OneSum;
		//总的最大长度
		maxPathLength=Math.max(maxPathLength, sum);
		return (Math.max(left_OneSum, right_OneSum)<=0)?root.val:(root.val+Math.max(left_OneSum, right_OneSum));
	}

}
