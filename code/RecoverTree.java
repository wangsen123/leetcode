package code;

public class RecoverTree {
	TreeNode pre;
	TreeNode mistake1;
	TreeNode mistake2;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
    public void recoverTree(TreeNode root) {
        r_traversal(root);
        if(mistake1!=null&&mistake2!=null){
        	int temp=mistake1.val;
        	mistake1.val=mistake2.val;
        	mistake2.val=temp;
        }
    }
	private void r_traversal(TreeNode root) {
		// TODO 自动生成的方法存根
		if(root==null)
			return;
		if(root.left!=null)
			r_traversal(root.left);
		if(pre!=null&&pre.val>root.val){
			if(mistake1==null){
				mistake1=pre;
				mistake2=root;
			}
			else{
				mistake2=root;
			}
		}
		pre=root;
		if(root.right!=null){
			r_traversal(root.right);
		}
	}
}
