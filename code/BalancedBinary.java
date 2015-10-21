package code;
class Change{
	int x;
	Change(int m){
		x=m;
	}
}
public class BalancedBinary {
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TreeNode root=new TreeNode(3);
//		int i=3;
		Change change=new Change(0);
		System.out.print(isBalanced(root));
	}		
	public static boolean isBalanced(TreeNode root) {
        Change change=new Change(0);
		return isBalanced(root,change);
	}
	public static  boolean isBalanced(TreeNode root,Change change) {	
		if(root==null){
			change.x=0;
			return true;
		}
//		int left,right;
			Change change1=new Change(0);
			Change change2=new Change(0);
			if(isBalanced(root.left,change1)&&isBalanced(root.right,change2)){
				int diff=change1.x-change2.x;
				if(diff<=1&&diff>=-1){
					change.x=1+(change1.x>change2.x?change1.x:change2.x);
					return true;
				}
	
			}   
	     return false;
	}
}

