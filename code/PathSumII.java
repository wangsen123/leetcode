package code;
//Total Accepted: 57311 Total Submissions: 214881 Difficulty: Medium
//Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
//
//For example:
//Given the below binary tree and sum = 22,
//              5
//             / \
//            4   8
//           /   / \
//          11  13  4
//         /  \    / \
//        7    2  5   1
//return
//[
//   [5,4,11,2],
//   [5,8,4,5]
//]
import java.util.ArrayList;
import java.util.List;

public class PathSumII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		 List<List<Integer>> result=new ArrayList<>();
		 List<Integer> ele=new ArrayList<>();
		 getpathSum(root,sum,result,ele);
		 return result;
    }
	private void getpathSum(TreeNode root, int sum, List<List<Integer>> result, List<Integer> ele) {
		// TODO Auto-generated method stub
		if(root==null){
			return;
		}
		if(root.val==sum&&root.left==null&&root.right==null){
			ele.add(root.val);
			result.add(ele);
			return;
		}
		ele.add(root.val);
		List<Integer> eList=new ArrayList<Integer>(ele);
		getpathSum(root.left,sum-root.val,result,ele);
		getpathSum(root.right,sum-root.val,result,eList);
	}

}
