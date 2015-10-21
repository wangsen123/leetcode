package code;
//String to Integer (atoi) Total Accepted: 58433 Total Submissions: 453312 My Submissions Question Solution 
//Implement atoi to convert a string to an integer.
//
//Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.
//
//Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.
//
//Update (2015-02-10):
//The signature of the C++ function had been updated. If you still see your function signature accepts a const char * argument, please click the reload button  to reset your code definition.
//
//spoilers alert... click to show requirements for atoi.
public class StringtoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public int myAtoi(String str) {
		  //注意空和空格
		     if(str==null)
		     {
		         return 0;
		     }
		     str = str.trim();
		     if(str.length()==0)
		         return 0;
		     //注意+，-
		     boolean isNeg = false;
		     int i = 0;
		     if(str.charAt(0)=='-' || str.charAt(0)=='+')
		     {
		         i++;
		         if(str.charAt(0)=='-')
		             isNeg = true;
		     }
		     int res = 0;
		     while(i<str.length()){
		    	 //判断是数字吗
		         if(str.charAt(i)<'0'||str.charAt(i)>'9')
		             break;
		         int digit = (int)(str.charAt(i)-'0');
		         //判断越界
		         if(isNeg && res>-((Integer.MIN_VALUE+digit)/10))
		             return Integer.MIN_VALUE;
		         else if(!isNeg && res>(Integer.MAX_VALUE-digit)/10)
		             return Integer.MAX_VALUE;
		         res = res*10+digit;
		         i++;
		     }
		     return isNeg?-res:res;
	    }

}
