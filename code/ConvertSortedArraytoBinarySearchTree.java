package code;
//Convert Sorted Array to Binary Search Tree
//Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
public class ConvertSortedArraytoBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static TreeNode sortedArrayToBST(int[] nums) {
	     int count=nums.length;
	     if(count==0){
	    	 return null;
	     }
	     int mid=(0+count-1)/2;
	 	 TreeNode root=new TreeNode(nums[mid]);
	 	 TreeNode left=createT(nums,0,mid-1);
	 	 TreeNode right=createT(nums,mid+1,count-1);
	 	 root.left=left;
	 	 root.right=right;
	 	 return root;
	 }
	private static TreeNode createT(int[] nums, int i, int j) {
		// TODO Auto-generated method stub
		if(i>j)
			return null;
		int mid=(i+j)/2;
		TreeNode root=new TreeNode(nums[mid]);
	 	TreeNode left=createT(nums,i,mid-1);
	 	TreeNode right=createT(nums,mid+1,j);
	 	root.left=left;
	 	root.right=right;
		return root;
	}

}
