package code;
//Given inorder and postorder traversal of a tree, construct the binary tree.
//
//Note:
//You may assume that duplicates do not exist in the tree.
public class ConstructBinaryTreefromInorderandPostorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		if(postorder.length==0)
	 		return null;
		int count=inorder.length;
	 	TreeNode root=new TreeNode(postorder[count-1]);
	 	int i;
	 	
	 	for(i=0;i<count;i++){
	 		if(inorder[i]==postorder[count-1])
	 			break;
	 	}
	 	TreeNode left=create(postorder,0,i-1,inorder,0,i-1);
	 	TreeNode right=create(postorder,i,count-2,inorder,i+1,count-1);
	 	root.left=left;
	 	root.right=right;
	 	return root;
    }
	private TreeNode create(int[] postorder, int s, int e, int[] inorder, int si, int ei) {
		// TODO Auto-generated method stub
		//没有元素了
		if(s>e)
			return null;
		TreeNode root=new TreeNode(postorder[e]);
	 	int i;
	 	for(i=si;i<=ei;i++){
	 		if(inorder[i]==postorder[e])
	 			break;
	 	}
	 	TreeNode left=create(postorder,s,s+i-1-si,inorder,si,i-1);
	 	TreeNode right=create(postorder,s+i-si,e-1,inorder,i+1,ei);
	 	root.left=left;
	 	root.right=right;
	 	return root;
	}

}
