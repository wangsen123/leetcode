package code;

public class NumberofDigitOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//�ܺ͵���ǰ��λ�ĺͼ�����һλ��1���ܺͣ����������һλ��1�Ļ�����ǰ�����ĸ�����
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
