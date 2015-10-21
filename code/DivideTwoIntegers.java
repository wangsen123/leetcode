package code;
//Divide Two Integers Total Accepted: 34192 Total Submissions: 223949 My Submissions Question Solution 
//Divide two integers without using multiplication, division and mod operator.
//
//If it is overflow, return MAX_INT.
public class DivideTwoIntegers {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print(divide(-2147483648, -1));
//		long n=2147483648L;
//		System.out.print((int)n);

	}
	 public static int divide(int dividend, int divisor) {
		 	if(divisor==0||dividend==0)
		 		return 0;
		 	
	        boolean positive=true;
	        if((dividend>0&&divisor<0)||(dividend<0&&divisor>0))
	        	positive=false;
	        long did=dividend>0?(long)dividend:-(long)dividend;
	        long dir=divisor>0?(long)(divisor):-(long)divisor;
	        long quotients=positiveDivide(did,dir);
	        //-2147483648, -1
	        if(positive&&quotients>Integer.MAX_VALUE)
	        	return Integer.MAX_VALUE;
	        return positive?(int)quotients:-(int)quotients;
	 }
	 private static long positiveDivide(long did, long dir) {
		// TODO 自动生成的方法存根
		long []array=new long[32];
		long sum=0;
		int i=1;
		long quotients=0;
		//-2147483648, 1
		if(dir==1)
			return did;
		for(array[0]=dir;array[i-1]<=did;i++)
			array[i]=array[i-1]<<1;
		for(i=i-2;i>=0;i--){
			if(sum<=did-array[i]){
				sum+=array[i];
				quotients+=1<<i;
			}
		}
		return quotients;
	}

}
