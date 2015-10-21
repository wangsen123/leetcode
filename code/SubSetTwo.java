package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Subsets II My Submissions Question Solution 
//Total Accepted: 47526 Total Submissions: 169953 Difficulty: Medium
//Given a collection of integers that might contain duplicates, nums, return all possible subsets.
//
//Note:
//Elements in a subset must be in non-descending order.
//The solution set must not contain duplicate subsets.
//For example,
//If nums = [1,2,2], a solution is:
//
//[
//  [2],
//  [1],
//  [1,2,2],
//  [2,2],
//  [1,2],
//  []
//]
public class SubSetTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> subsetsWithDup(int[] nums) {
		// ��������
		Arrays.sort(nums);
		List<List<Integer>> preresult = new ArrayList<>();
		List<List<Integer>> equalresult = new ArrayList<>();
		int count = nums.length;
		preresult.add(new ArrayList<Integer>());
		// ��ÿ��Ԫ�ؼӽ���
		List<List<Integer>> preequalresult= new ArrayList<>();
		for (int i = 0; i < count; i++) {
		//�����������ȣ�����ȣ���һ�Σ��Ժ󣩡�
			if (i == 0 || nums[i] != nums[i - 1]) {
				preresult.addAll(equalresult);
				equalresult.removeAll(equalresult);
				int length = preresult.size();
				for (int j = 0; j < length; j++) {
					ArrayList<Integer> temp = new ArrayList<>(preresult.get(j));
					// �±���i
					temp.add(nums[i]);
					equalresult.add(temp);
				}
			} else {
				if (i <= 1 || nums[i] != nums[i - 2]) {
					//ֻ��Ҫ������ǰһ���ڵ�Ԫ�أ���ʼ��preequalresult
					preequalresult= new ArrayList<>();
					int length = equalresult.size();
					for (int j = 0; j < length; j++) {
						ArrayList<Integer> temp = new ArrayList<>(equalresult.get(j));
						temp.add(nums[i]);
						equalresult.add(temp);
						preequalresult.add(temp);
					}
				}else{
					//ֻ��������ǰһ���ڵ�Ԫ��
					int length = preequalresult.size();
					List<List<Integer>> tempequalresult= new ArrayList<>();
					for (int j = 0; j < length; j++) {
						List<Integer> temp = new ArrayList<>(preequalresult.get(j));
						temp.add(nums[i]);
						equalresult.add(temp);
						tempequalresult.add(temp);
					}
					//����preequalresult
					preequalresult=tempequalresult;
				}
			}

		}

		preresult.addAll(equalresult);
		return preresult;
	}

}
