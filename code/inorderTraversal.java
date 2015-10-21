package code;
//Given a binary tree, return the inorder traversal of its nodes' values.
//
//For example:
//Given binary tree {1,#,2,3},
//   1
//    \
//     2
//    /
//   3
//return [1,3,2].
//
//Note: Recursive solution is trivial, could you do it iteratively?
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;



public class inorderTraversal {
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> temp=new  ArrayList<Integer>();
        if(root!=null){
            temp.addAll(inorderTraversal(root.left));
            temp.add(root.val);
            temp.addAll(inorderTraversal(root.right));
        }
       return temp;
   }
	
	
	  public List<Integer> inorderTraversalNo(TreeNode root) {
	         List<Integer> temp=new  ArrayList<Integer>();
	         Stack<TreeNode> s=new Stack<TreeNode>();
	         TreeNode p=root;
	    while(p!=null||!s.empty())
	    {
	        while(p!=null)
	        {
	            s.push(p);
	            p=p.left;
	        }
	        if(!s.empty())
	        {
	            p=s.pop();
	            temp.add(p.val);
	            
	            p=p.right;
	        }
	    }    
	        return temp;
	    }
}
