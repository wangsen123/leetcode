package code;
//Single Number II Total Accepted: 45470 Total Submissions: 131046 My Submissions Question Solution 
//Given an array of integers, every element appears three times except for one. Find that single one.
//
//Note:
//Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
public class SingleNumberTwo {
	  public int singleNumber(int[] A) {
	        int one=0,two=0,three=0;
	        for(int i=0;i<A.length;++i){
	        	two|=one&A[i];
	        	one^=A[i];
	        	three=one&two;
	        	one=one&~three;
	        	two=two&~three;
	        }
	        return one;
	    }
}
