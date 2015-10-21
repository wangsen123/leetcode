package code;
//Plus One Total Accepted: 56368 Total Submissions: 186154 My Submissions Question Solution 
//Given a non-negative number represented as an array of digits, plus one to the number.
//
//The digits are stored such that the most significant digit is at the head of the list.
public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		plusOne(new int[]{
				9
		});
		
	

	}
	public static int[] plusOne(int[] digits) {
	   int[] result=new int[digits.length];
	   int count=1;
	   for(int i=digits.length-1;i>=0;i--){
		   result[i]=digits[i]+count;
		   //先把值存下来再变。。。
		   count=result[i]/10;
		   result[i]=result[i]%10;
		   
	   }
	   if(count>0){
		   int[] newresult=new int[digits.length+1]; 
		   for(int i=digits.length-1;i>=0;i--){
			   newresult[i+1]=result[i];
			   
		   }
		   //最后把0加进来。
		   newresult[0]=count;
		   return newresult;
	   }
		return result;
	   
	}

}
