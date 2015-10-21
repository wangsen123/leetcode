package code;
//Multiply Strings Total Accepted: 33986 Total Submissions: 161757 My Submissions Question Solution 
//Given two numbers represented as strings, return multiplication of the numbers as a string.
//
//Note: The numbers can be arbitrarily large and are non-negative.
public class MultiplyStrings {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	public String multiply(String num1, String num2) {
	    num1=new StringBuilder(num1).reverse().toString();
	    num2=new StringBuilder(num2).reverse().toString();
	    int[] d=new int[num1.length()+num2.length()];
	    for(int i=0;i<num1.length();++i)
	    	//要细心 copy时多注意
	    	for(int j=0;j<num2.length();++j){
	    		d[i+j]=d[i+j]+(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
	    	}
	    StringBuilder sbBuilder=new StringBuilder();
	    int ele;
	    int carry=0;
	    for(int i=0;i<d.length;++i){
	    	 ele=(d[i]+carry)%10;
	    	 carry=(d[i]+carry)/10;
	    	 sbBuilder.insert(0, ele);
	    	
	    }
	    //注意出现0 先判断length长度
	    while(sbBuilder.length()>0&&sbBuilder.charAt(0)=='0'){
	    	sbBuilder.deleteCharAt(0);
	    }
	    return sbBuilder.length()==0?"0":sbBuilder.toString();
	}

}
