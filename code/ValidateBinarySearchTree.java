package code;
//Validate Binary Search Tree My Submissions Question Solution 
//Total Accepted: 63004 Total Submissions: 312589 Difficulty: Medium
//Given a binary tree, determine if it is a valid binary search tree (BST).
//
//Assume a BST is defined as follows:
//
//The left subtree of a node contains only nodes with keys less than the node's key.
//The right subtree of a node contains only nodes with keys greater than the node's key.
//Both the left and right subtrees must also be binary search trees.
public class ValidateBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	TreeNode pre = null;  
	public boolean isValidBST(TreeNode root) {
		if(root==null)
	    	return true;
	   if(!isValidBST(root.left))
		   return false;
	   if(pre!=null&&pre.val>=root.val)
		   return false;
	   pre=root;
	   return isValidBST(root.right);
	   
	}
	

}
