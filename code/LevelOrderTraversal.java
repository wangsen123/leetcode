package code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.prefs.NodeChangeEvent;
//Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
//
//For example:
//Given binary tree {3,9,20,#,#,15,7},
//    3
//   / \
//  9  20
//    /  \
//   15   7
//return its level order traversal as:
//[
//  [3],
//  [9,20],
//  [15,7]
//]




public class LevelOrderTraversal {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TreeNode root=new TreeNode(1);
		TreeNode root1=new TreeNode(2);
		TreeNode root2=new TreeNode(3);
		TreeNode root3=new TreeNode(4);
		TreeNode root4=new TreeNode(5);
		root.left=root1;
		root1.left=root2;
		root2.left=root3;
		root3.left=root4;
		root4.left=root4;
		ArrayList<List<Integer>> mq=new ArrayList<List<Integer>>();
		mq=(ArrayList<List<Integer>>) levelOrder(root);
		
		System.out.print(mq);
	}
	 public static  List<List<Integer>> levelOrder(TreeNode root) {
			ArrayList<List<Integer>> m=new ArrayList<List<Integer>>();
			ArrayList<List<TreeNode>> f=new ArrayList<List<TreeNode>>();
		    if(root==null)
		    	return m;
		    int i=0;
		    TreeNode qNode1=root;
		    Queue<TreeNode> n=new LinkedList<TreeNode>();
			Queue<TreeNode> queues=new LinkedList<TreeNode>();
			TreeNode tempNode=root;
			TreeNode newNode;
			queues.offer(root);
			while(!queues.isEmpty()){
				tempNode=queues.poll();
				n.offer(tempNode);
				if(tempNode.left!=null){
					queues.offer(tempNode.left);
				}
				if(tempNode.right!=null){
					queues.offer(tempNode.right);
				}	
			}
			int w=0;
			int k=0;
			int z=0;
			List<TreeNode> list=new ArrayList<TreeNode>();
			List<Integer> list1=new ArrayList<Integer>();
				List<TreeNode> list2=new ArrayList<TreeNode>();
			List<Integer> list3=new ArrayList<Integer>();
			list.add(root);
			list1.add(root.val);
			f.add(list);
			m.add(list1);
			int s=n.size();
			k++;
			n.poll();
			if(s==1){
			    return m;
			}
			for (int j = 1; j <s; j++) {
			
				newNode=n.poll();
				for(w=0;w<f.get(k-1).size();w++){
					if(newNode.equals(f.get(k-1).get(w).left)|| newNode.equals(f.get(k-1).get(w).right)){
						list2.add(newNode);
						list3.add(newNode.val);
						break;
					}
					
					}
				   if(w>=f.get(k-1).size()){
					   
				    f.add(list2);
					m.add(list3);
					k++;
					 list2=new ArrayList<TreeNode>();
					 list3=new ArrayList<Integer>();
					list2.add(newNode);
					list3.add(newNode.val);
				   }
			}
		
			f.add(list2);
			m.add(list3);
		
		     return m;   
		   }
}
