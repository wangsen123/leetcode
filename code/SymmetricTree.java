package code;
//Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
//
//For example, this binary tree is symmetric:
//
//    1
//   / \
//  2   2
// / \ / \
//3  4 4  3
//But the following is not:
//    1
//   / \
//  2   2
//   \   \
//   3    3
public class SymmetricTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isSymmetric(TreeNode root) {
        if(root==null)
        	return true;
        return isSym(root.left,root.right);
    }
	private boolean isSym(TreeNode left, TreeNode right) {
		// TODO Auto-generated method stub
		if(left==null&&right==null)
			return true;
		if(left==null||right==null){
			return false;
		}
		if(left.val!=right.val)
			return false;
		return isSym(left.left, right.right)&&isSym(left.right,right.left);
	}

}
