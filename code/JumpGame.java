package code;
//Jump Game Total Accepted: 50023 Total Submissions: 185682 My Submissions Question Solution 
//Given an array of non-negative integers, you are initially positioned at the first index of the array.
//
//Each element in the array represents your maximum jump length at that position.
//
//Determine if you are able to reach the last index.
//
//For example:
//A = [2,3,1,1,4], return true.
//
//A = [3,2,1,0,4], return false.
import java.util.ArrayList;

public class JumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean canJump(int[] nums) {
		
		
		ArrayList<Integer> zeroindex=new ArrayList<>();
		//只要管最后一个前面的 length-1的数
		for(int i=0;i<nums.length-1;i++){
			if(nums[i]==0){
				zeroindex.add(i);
			}
		}
		
		for(int i=0;i<zeroindex.size();i++){
			int j;
			for(j=zeroindex.get(i)-1;j>=0;j--){
				if(nums[j]>zeroindex.get(i)-j)
					break;
			}
			if(j<0)
				return false;
		}
		return true;
	}

}
