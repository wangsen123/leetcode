package code;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a[]={
				1,3
		};
		System.out.print(searchInsert(a,2));
	}
    public static int searchInsert(int[] nums, int target) {
    	if(nums.length==0)
    		return 0;
	    int left=0;
	    int right=nums.length-1;
	    
	    while(right>=left){
	    	int mid=(left+right)/2;
	    	if(nums[mid]==target)
		    	return mid;
		    else if(nums[mid]>target){
		    	right=mid-1;
		    	
		    }else{
		    	left=mid+1;
			}
	    }
	    return left;
	    
	}

}
