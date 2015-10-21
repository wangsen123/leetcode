package code;
//Given preorder and inorder traversal of a tree, construct the binary tree.
public class ConstructBinaryTreefromPreorderandInorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public TreeNode buildTree(int[] preorder, int[] inorder) {
		 	if(preorder.length==0)
		 		return null;
		 	TreeNode root=new TreeNode(preorder[0]);
		 	int i;
		 	int count=inorder.length;
		 	for(i=0;i<count;i++){
		 		if(inorder[i]==preorder[0])
		 			break;
		 	}
		 	TreeNode left=create(preorder,1,i,inorder,0,i-1);
		 	TreeNode right=create(preorder,i+1,count-1,inorder,i+1,count-1);
		 	root.left=left;
		 	root.right=right;
		 	return root;
	 }
	private TreeNode create(int[] preorder, int s, int e, int[] inorder, int si, int ei) {
		// TODO Auto-generated method stub
		//没有元素了
		if(s>e)
			return null;
		TreeNode root=new TreeNode(preorder[s]);
	 	int i;
	 	for(i=si;i<=ei;i++){
	 		if(inorder[i]==preorder[s])
	 			break;
	 	}
	 	TreeNode left=create(preorder,s+1,s+1+i-1-si,inorder,si,i-1);
	 	TreeNode right=create(preorder,e-ei+i+1,e,inorder,i+1,ei);
	 	root.left=left;
	 	root.right=right;
	 	return root;
	}

}
