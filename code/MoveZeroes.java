package code;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void moveZeroes(int[] nums) {
		int end=0;
		int count=nums.length;
		for(int i=0;i<count;i++){
			if(nums[i]!=0){
				nums[end]=nums[i];
				end++;
			}
		}
		for(int i=end;i<count;i++){
			//Ñ­»·ÀïÓÃi
			nums[i]=0;
		}
	}

}
