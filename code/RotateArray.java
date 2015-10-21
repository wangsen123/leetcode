package code;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void rotate(int[] nums, int k) {
	    int length=nums.length;
	    if(length<=1)
	    	return;
	    k=k%length;
	    if(k==0)
	    	return;
	    reval(nums,0,length-1-k);
	    reval(nums,length-k,length-1);
	    reval(nums,0,length-1);
	    
	}
	private void reval(int[] nums, int start, int end) {
		// TODO Auto-generated method stub
		int i=start;
		int j=end;
		while(i<j){
			int swap=nums[i];
			nums[i]=nums[j];
			nums[j]=swap;
			i++;
			j--;
		}
	}
}
