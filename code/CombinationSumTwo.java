package code;
//Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
//
//Each number in C may only be used once in the combination.
//
//Note:
//All numbers (including target) will be positive integers.
//Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
//The solution set must not contain duplicate combinations.
//For example, given candidate set 10,1,2,7,6,1,5 and target 8, 
//A solution set is: 
//[1, 7] 
//[1, 2, 5] 
//[2, 6] 
//[1, 1, 6] 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumTwo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        return subCombine(candidates,0,target,true);
    }
	private List<List<Integer>> subCombine(int[] candidates, int start, int target,
			boolean repeat) {
		// TODO 自动生成的方法存根
		ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
		if(target==0)
			return result;
		if(start>=candidates.length)
			return result;
		if(target<candidates[start]){
			return result;
		}
		if(!repeat&&candidates[start]==candidates[start-1]){
			return subCombine(candidates, start+1, target, repeat);
		}
		if(candidates[start]==target){
			ArrayList<Integer> tmp=new ArrayList();
			tmp.add(candidates[start]);
			result.add(tmp);
		}
		List<List<Integer>> subRes=subCombine(candidates, start+1, target, false);
		result.addAll(subRes);
		if(subRes!=null){
			subRes = subCombine(candidates, start + 1, target- candidates[start], true);
		}
		if (subRes != null) {
			for (List<Integer> item : subRes) {
				ArrayList<Integer> tmp = new ArrayList<Integer>();
				tmp.add(candidates[start]);
				tmp.addAll(item);
				result.add(tmp);
			}
		}

		return result;
	}
}
