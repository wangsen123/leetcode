package code;
//Permutations Total Accepted: 58093 Total Submissions: 182136 My Submissions Question Solution 
//Given a collection of numbers, return all possible permutations.
//
//For example,
//[1,2,3] have the following permutations:
//[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
import java.util.ArrayList;
import java.util.List;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public List<List<Integer>> permute(int[] nums) {
	    List<List<Integer>> totalseq=new ArrayList<List<Integer>>();
	    if(nums==null&&nums.length==0){
	    	ArrayList<Integer> tmp=new ArrayList<Integer>();
	    	totalseq.add(tmp);
	    	return totalseq;
	    }
	    dfs(0,nums,totalseq);
	    return totalseq;
	 }
	private void dfs(int index, int[] nums, List<List<Integer>> totalseq) {
		// TODO Auto-generated method stub
		if(index==nums.length){
			ArrayList<Integer> tmp=new ArrayList<>();
			for(int i=0;i<nums.length;i++){
				
				tmp.add(nums[i]);
			}
			totalseq.add(tmp);
		}
		else{
			int temp=0;
			for(int j=index;j<nums.length;j++){
				temp=nums[index];
				nums[index]=nums[j];
				nums[j]=temp;
				dfs(index+1, nums, totalseq);
				temp=nums[index];
				nums[index]=nums[j];
				nums[j]=temp;
			}
		}
		
	}
}
