package code;
//Palindrome Number Total Accepted: 35430 Total Submissions: 122024 My Submissions Question Solution 
//Determine whether an integer is a palindrome. Do this without extra space.
public class PalindromeNumber {
	public boolean isPalindrome(int x) {
        if(x<0)
        	return false;
        if(x==0)
        	return true;
        long result=0;
        int m=x;
        while (m>0)
        {
               result = result*10 + m%10;//分解反相加
               m/= 10;
        }
        if(result>2147483647)
        	return false;
        if((int)result==x)
        	return true;
        else 
			return false;
		
        
    }
	public boolean isPalindrome2(int x) {
	       if (x < 0)
	             return false;
	         if (x == 0)
	              return true;
	             
	        int base = 1;
	         while(x / base >= 10)
	            base *= 10;
	             
	         while(x!=0)
	         {
	            int leftDigit = x / base;
	             int rightDigit = x % 10;
	             if (leftDigit != rightDigit)
	                 return false;
	             
	             x -= base * leftDigit;
	             base /= 100;
	             x /= 10;
	         }
	         
	         return true;
	    }
	
}
