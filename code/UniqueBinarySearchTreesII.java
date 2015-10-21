package code;
//Unique Binary Search Trees II My Submissions Question Solution 
//Total Accepted: 39624 Total Submissions: 139751 Difficulty: Medium
//Given n, generate all structurally unique BST's (binary search trees) that store values 1...n.
//
//For example,
//Given n = 3, your program should return all 5 unique BST's shown below.
//
//   1         3     3      2      1
//    \       /     /      / \      \
//     3     2     1      1   3      2
//    /     /       \                 \
//   2     1         2                 3
//confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
import java.util.ArrayList;
import java.util.List;

public class UniqueBinarySearchTreesII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		List<TreeNode> list=generateTrees(3);
		System.out.println(	list.size());
	
		for(int i=0;i<list.size();i++)
		System.out.println(list.get(i).val);
	}
	public static List<TreeNode> generateTrees(int n) {
	    return generate(1,n);    
	}
	private static List<TreeNode> generate(int start, int end) {
		// TODO Auto-generated method stub
		List<TreeNode> result =new ArrayList<>();
		if(start>end){
			result.add(null);
			return result;
		}
		for(int i=start;i<=end;i++){
			List<TreeNode> left=generate(start, i-1);
			List<TreeNode> right=generate(i+1, end);
			for(int j=0;j<left.size();j++){
				for(int k=0;k<right.size();k++){
					TreeNode node=new TreeNode(i);
					result.add(node);
					node.left=left.get(j);
					node.right=right.get(k);
				}
			}
		}
		return result;
	}

}
