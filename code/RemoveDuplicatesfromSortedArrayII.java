package code;
//Remove Duplicates from Sorted Array II My Submissions Question Solution 
//Total Accepted: 50992 Total Submissions: 167190 Difficulty: Medium
//Follow up for "Remove Duplicates":
//What if duplicates are allowed at most twice?
//
//For example,
//Given sorted array nums = [1,1,1,2,2,3],
//
//Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.
public class RemoveDuplicatesfromSortedArrayII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int removeDuplicates(int[] nums) {
		if(nums.length==0)
			return 0;
	    int length=nums.length;
	    int j=0;
	    int count=1;
	    int i=1;
	    for(;i<length;i++){
	    	if(nums[i]==nums[i-1]){
	    		count++;
	    		
	    	}else{
	    		if(count<=2){
	    			while(count>0){
	    				nums[j]=nums[i-count];
	    				count--;
	    				j++;
	    			}
	    		}else{
	    			//个数大于2的变成2
	    			nums[j]=nums[i-count];
	    			nums[j+1]=nums[i-count+1];
	    			j=j+2;
	    		}
	    		count=1;
	    		
	    	}
	    }
	    if(count<=2){
	    	while(count>0){
				nums[j]=nums[i-count];
				count--;
				j++;
			}
	    }else{
	    	nums[j]=nums[i-count];
			nums[j+1]=nums[i-count+1];
			j=j+2;
	    }
//	    for(int k=j;k<length;k++){
//	    	nums[k]=0;
//	    }
	    return j;
	}
}
