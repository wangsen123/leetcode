package code;
//Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
//
//The same repeated number may be chosen from C unlimited number of times.
//
//Note:
//All numbers (including target) will be positive integers.
//Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
//The solution set must not contain duplicate combinations.
//For example, given candidate set 2,3,6,7 and target 7, 
//A solution set is: 
//[7] 
//[2, 2, 3] 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			
	}
	 public List<List<Integer>> combinationSum(int[] candidates, int target) {
		 List<List<Integer>> ret=new ArrayList<List<Integer>>();
		 if(candidates==null&&candidates.length==0){
			 return ret;
		 }
		 List<Integer> path=new ArrayList<>();
		 Arrays.sort(candidates);
		 combinationSum(candidates, target,path,ret,0);
		 return ret;
	 }
	public void combinationSum(int[] candidates, int target,
			List<Integer> path, List<List<Integer>> ret, int index) {
		// TODO 自动生成的方法存根
		  if (target == 0) {
	            // add the current set into the result.
	            ret.add(new ArrayList<Integer>(path));
	            return;
	        }
	        
	        if (target < 0) {
	            return;
	        }
	        int len=candidates.length;
	        for(int i=index;i<len;++i){
	        	path.add(candidates[i]);
	        	combinationSum(candidates, target-candidates[i], path, ret, i);
	        	path.remove(path.size()-1);
	        }
	}
}
