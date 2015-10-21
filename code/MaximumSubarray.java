package code;
//Maximum Subarray Total Accepted: 63692 Total Submissions: 184929 My Submissions Question Solution 
//Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
//
//For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
//the contiguous subarray [4,−1,2,1] has the largest sum = 6.
public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxSubArray(int[] nums) {
        if(nums==null&&nums.length==0){
        	return 0;
        }
        int to_cur_max=nums[0];
        int max_value=nums[0];
        for(int i=1;i<nums.length;++i){
        	if(to_cur_max<0){
        		to_cur_max=nums[i];
        	}
        	else{
        		//to_cur_max=+nums[i]; 是错的
        		to_cur_max=to_cur_max+nums[i];
        	}
        	max_value=Math.max(max_value,to_cur_max);
        }
        return max_value;
    }

}
