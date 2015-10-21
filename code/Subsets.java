package code;
//Subsets My Submissions Question Solution 
//Total Accepted: 62243 Total Submissions: 219925 Difficulty: Medium
//Given a set of distinct integers, nums, return all possible subsets.
//
//Note:
//Elements in a subset must be in non-descending order.
//The solution set must not contain duplicate subsets.
//For example,
//If nums = [1,2,3], a solution is:
//
//[
//  [3],
//  [1],
//  [2],
//  [1,2,3],
//  [1,3],
//  [2,3],
//  [1,2],
//  []
//]
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<List<Integer>> subsets(int[] nums) {
		//��������
		Arrays.sort(nums);
		ArrayList<List<Integer>> result=new ArrayList<>();
		int count=nums.length;
		result.add(new ArrayList<Integer>());
		//��ÿ��Ԫ�ؼӽ���
		for(int i=0;i<count;i++){
			int length=result.size();
			//����ʹ�õ������ķ�ʽ���ʣ����ֲ����޸��쳣��ʹ���±귽ʽ����
			for(int j=0;j<length;j++){
				ArrayList<Integer> other=new ArrayList<>(result.get(j));
				other.add(nums[i]);
				result.add(other);
			}
		}
        return result;
    }
}
