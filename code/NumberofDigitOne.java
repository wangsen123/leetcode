package code;

public class NumberofDigitOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//总和等于前面位的和加上这一位的1的总和，还有如果这一位是1的话加上前面树的个数。
	public int countDigitOne(int n) {
       if(n<1)
    	   return 0;
       int count=0;
       int mod;
       
       int init=0;
       int add=1;
       int m=n;
       int prenum=0;
       while(m>0){
    	  mod=m%10;
     	  m/=10;
     	  
    	  if(mod==1){
    		  count+=init+1+prenum;
    	  }
    	  if(mod>=2){
    		  count+=mod*init+add;
    	  }
    	  init=init*10+add;
    	  prenum+=mod*add;
    	  add*=10;
    	  
    	  
       }
       return count;
    }

}
