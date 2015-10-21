package code;

public class Pow {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print(pow(0.00001,2147483647));

	}
	public static double pow(double x, int n) {
		
//        int flag=n>0?1:0;
//        int c=Math.abs(n);
//        if(c==0)
//        	return 1;
//        if(c==1)
//        	return c;
//        if(flag>0)
//        	if(c%2==0){
//        	return pow(x, c/2)*pow(x, c/2);
//        	}
//        	else {
//        	 return pow(x, c/2)*pow(x, c/2)*x;	
//			}
//        else {
//        	if(c%2==0){
//            	return 1/pow(x, c/2)*pow(x, c/2);
//            	}
//            	else {
//            	 return 1/pow(x, c/2)*pow(x, c/2)*c;	
//    			}
//		}
//		consider the binary representation of n. For example, if it is "10001011", then x^n = x^(1+2+8+128) = x^1 * x^2 * x^8 * x^128. Thus, we don't want to loop n times to calculate x^n. To speed up, we loop through each bit, if the i-th bit is 1, then we add x^(1 << i) to the result. Since (1 << i) is a power of 2, x^(1<<(i+1)) = square(x^(1<<i)). The loop executes for a maximum of log(n) times.
		if(n<0)  
			if(n<0)  
	        {  
	            if(n==Integer.MIN_VALUE)  
	                return 1.0 / (pow(x,Integer.MAX_VALUE)*x);  
	            else  
	                return 1.0 / pow(x,-n);  
	        }  
	        if(n==0)  
	            return 1.0;  
	        double ans = 1.0 ;  
	        for(;n>0; x *= x, n>>=1)  
	        {  
	            if((n&1)>0)  
	                ans *= x;  
	        }  
	        return ans;     
        	}
        	
    }


