package code;
//Implement int sqrt(int x).
//
//Compute and return the square root of x.
public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int mySqrt(int x) {
//	        return (int) Math.sqrt(x);
		 
		 //Å£¶Ùµü´ú·¨
		   if (x ==0)  
	            return 0;  
	        double pre;  
	        double cur = 1;  
	        do  
	        {  
	            pre = cur;  
	            cur = x / (2 * pre) + pre / 2.0;  
	        } while (Math.abs(cur - pre) > 0.00001);  
	        return (int) (cur);  
	    }
}
