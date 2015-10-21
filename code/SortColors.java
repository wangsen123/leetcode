package code;
//Sort Colors Total Accepted: 65124 Total Submissions: 199819 My Submissions Question Solution 
//Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
//
//Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
//
//Note:
//You are not suppose to use the library's sort function for this problem.
public class SortColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void sortColors(int[] nums) {
        int midindex=quickSort(nums, 0, 0, nums.length-1);
	     quickSort(nums, 1, midindex+1, nums.length-1);
  }
   public int quickSort(int[] nums,int middata,int start,int end){
		 int i=start;
		 
		 for(;i<=end;i++){
			 if(nums[i]==middata)
				 break;
		 }
		 if(i>end){
			 return start-1;
		 }
		 int temp=nums[i];
		 nums[i]=nums[start];
		 i=start;
		 int j=end;
		 while(i<j){
			while(i<j&&nums[j]>temp)
				j--;
			
			nums[i]=nums[j];
			
			while(i<j&&nums[i]<=temp)
				i++;
			
			nums[j]=nums[i];
			
			
		 }
		 nums[i]=temp;
		 return i;
	 }
}
