package code;

import java.util.ArrayList;

//Given a binary tree, flatten it to a linked list in-place.
//
//For example,
//Given
//
//         1
//        / \
//       2   5
//      / \   \
//     3   4   6
//The flattened tree should look like:
//   1
//    \
//     2
//      \
//       3
//        \
//         4
//          \
//           5
//            \
//             6

public class FlattenBinaryTreetoLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public void flatten(TreeNode root) {
		 ArrayList<TreeNode> nodes=new ArrayList<>();
		 tr(root,nodes);
		 TreeNode prehead=new TreeNode(0);
		 TreeNode cur=prehead;
	     for(int i=0;i<nodes.size();i++){
	    	 cur.right=nodes.get(i);
	    	 cur=nodes.get(i);
	    	 cur.left=null;
	     }
	     
	 }

	private void tr(TreeNode root, ArrayList<TreeNode> nodes) {
		// TODO Auto-generated method stub
		
	     if(root!=null){   
	    	 
	    	 nodes.add(root);
	    	 tr(root.left,nodes);
	    	 tr(root.right,nodes);
	     }
	}
}
