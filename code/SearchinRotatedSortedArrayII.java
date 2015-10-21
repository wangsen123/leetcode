package code;

public class SearchinRotatedSortedArrayII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public boolean search(int[] nums, int target) {
		 int left = 0, right = nums.length - 1;
         while( left <= right){
             int mid = (left + right)/2;
             if(nums[mid] == target) return true;
             if(nums[left] < nums[mid]){
                 if(target <nums[mid] && target >= nums[left])
                     right = mid - 1;
                 else left = mid + 1;
             } else if (nums[left] > nums[mid]){
                 if(target >= nums[left] || target < nums[mid])
                     right = mid -1;
                 else left = mid + 1;
             }
             //当相等的情况下，left和target不等 直接去掉
             else left ++;
         }
         return false;  
	 }

}
