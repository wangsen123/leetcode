package code;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import code.TreeNode;

public class BinaryTreeLevelOrderTraversalTwo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
	    List<List<Integer>> result=new ArrayList<List<Integer>>();
	    if(root==null)
	    	return result;
	    List<TreeNode> preelement=new ArrayList();
	    preelement.add(root);
	    Stack<List<TreeNode>> stack=new Stack();
	    stack.push(preelement);
	    //��ÿ��ǿյ�ȡ����
	    while(true){
	    	List<TreeNode> nowelement=new ArrayList();
	    	boolean isFinish=false;
	    	for(TreeNode a : preelement){
	    		if(a.left!=null){
	    			isFinish=true;
	    			nowelement.add(a.left);
	    		}
	    		if(a.right!=null){
	    			isFinish=true;
	    			nowelement.add(a.right);
	    		}
    			

	    	}
	    	//ȫ�ǿ���
	    	if(!isFinish)
	    		break;
	    	stack.push(nowelement);
	    	preelement=nowelement;
	    	
	    }
	    while (!stack.empty()) {
	    	List<Integer> element=new ArrayList<>();
	    	List<TreeNode> nodes=stack.pop();
	    	for(TreeNode aNode:nodes)
	    		element.add(aNode.val);
			result.add(element);
		}
	    return result;	
	    
	}
}
