package code;
//
//Climbing Stairs Total Accepted: 66034 Total Submissions: 191740 My Submissions Question Solution 
//You are climbing a stair case. It takes n steps to reach to the top.
//
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
public class ClimbStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int climbStairs(int n) {
    	 if(n<=1)
		 return 1;
	 int a=1;
	 int b=1;
	 int c=0;
	 for(int i=1;i<n;i++){
		 c=a+b;
		 a=b;
		 b=c;
	 }
	 return c;	 
 
}

}
