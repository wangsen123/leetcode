package code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		
		List<List<Integer>> list = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if (root != null) {
			queue.add(root);
		}
		boolean isDobule = true;
		while (!queue.isEmpty()) {
			List<Integer> ele = new ArrayList<>();
			List<TreeNode> postNode = new ArrayList<>();
			while (!queue.isEmpty()) {
				TreeNode node = queue.poll();
				ele.add(node.val);
				//���תȦ�Ĺ���
				if (isDobule){
					if (node.left != null) {
						postNode.add(node.left);
					}
					if (node.right != null) {
						postNode.add(node.right);
					}
				}else{
					if (node.right != null) {
						postNode.add(node.right);
					}
					if (node.left != null) {
						postNode.add(node.left);
					}
				}

			}
			list.add(ele);
			//�����ʹ����Ӧ˳��
			for (int i = postNode.size() - 1; i >= 0; i--)
				queue.offer(postNode.get(i));
			// �ı�˳��
			isDobule=!isDobule;
			

		}
		return list;
	}

}
