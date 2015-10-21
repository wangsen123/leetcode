package code;
//Given a sorted array of integers, find the starting and ending position of a given target value.
//
//Your algorithm's runtime complexity must be in the order of O(log n).
//
//If the target is not found in the array, return [-1, -1].
//
//For example,
//Given [5, 7, 7, 8, 8, 10] and target value 8,
//return [3, 4].
public class SearchforaRange {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	  public int[]  searchRange(int[] nums, int target) {
		  int [] resultIndex={
				  -1,-1
		  };
		  if(nums.length==0)
				 return resultIndex;
		  if(nums[0]>target||nums[nums.length-1]<target)
			  return resultIndex;
		  int left=0;
		  int right=nums.length-1;
		  int mid;
		  while(left<=right){
			  mid=(left+right)/2;
			  if(nums[mid]==target){
				  int m=mid;
				  while(m>=0&&nums[m]==target)
					  m--;
				  resultIndex[0]=m+1;
				  int n=mid;
				  while(n<nums.length&&nums[n]==target)
					  n++;
				  resultIndex[1]=n-1;
				  break;
			  }
			  else if(nums[mid]>target){
				  right=mid-1;
			  }
			  else {
				left=mid+1;
			}
		  }
		  return resultIndex;
			 
	  }
}
