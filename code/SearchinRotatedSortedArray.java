package code;
//Suppose a sorted array is rotated at some pivot unknown to you beforehand.
//
//(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
//
//You are given a target value to search. If found in the array return its index, otherwise return -1.
//
//You may assume no duplicate exists in the array.
public class SearchinRotatedSortedArray {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	 public int search(int[] nums, int target) {
		 if(nums.length==0)
			 return -1;
		 if(nums[0]==target)
			 return 0;
		 int  left=0;
		 int right=nums.length-1;
		 if(nums[right]==target)
			 return right;
		 int mid;
		 while(left+1<right){
			 mid=(left+right)/2;
			 if(nums[mid]==target)
				 return mid;
			 if(nums[left]<=nums[mid]){
				 if(target>=nums[left]&&target<nums[mid])
					 right=mid;
				 else {
					left=mid;
				}
			 }
			 else{
				 if(target>nums[mid]&&target<=nums[right])
					 left=mid;
				 else {
					right=mid;
				}
			 }
		
		 }
		
		 return -1;
	 }

}
