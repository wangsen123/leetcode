package code;
//Given an array of non-negative integers, you are initially positioned at the first index of the array.
//
//Each element in the array represents your maximum jump length at that position.
//
//Your goal is to reach the last index in the minimum number of jumps.
//
//For example:
//Given array A = [2,3,1,1,4]
//
//The minimum number of jumps to reach the last index is 2. (Jump 1 step from index 0 to 1, then 3 steps to the last index.)
public class JumpGameII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int jump(int[] nums) {
		if(nums==null||nums.length==0||nums.length==1)
			return 0;
		int jump=0;
		int laststep=0;
		for(int i=0;i<nums.length;i++){
			nums[i]=nums[i]+i;
			if(nums[i]>=nums.length-1){
				jump++;
				laststep=i;
				//找到第一个就可以停止了
				break;
			}
		}
		while(laststep>0){
			for(int j=0;j<laststep;j++){
				if(nums[j]>=laststep){
					jump++;
					laststep=j;
					break;
				}
				
			}
		}
		return jump;
	}

}
