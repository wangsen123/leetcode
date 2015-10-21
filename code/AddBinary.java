package code;
//Given two binary strings, return their sum (also a binary string).
//
//For example,
//a = "11"
//b = "1"
//Return "100".
public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String addBinary(String a, String b) {
//	    if(a.length()==0)
//	    	return b;
//	    if(b.length()==0)
//	    	return a;
	    StringBuilder sb=new StringBuilder();
	    int count=0;
	    int i;
	    int j;
	    for(i=a.length()-1,j=b.length()-1;i>=0&&j>=0;i--,j--){
	    	int avalue=a.charAt(i)-'0';
	    	int bvalue=b.charAt(j)-'0';
	    	int sum=avalue+bvalue+count;
	    	sb.append(sum%2+"");
	    	count=sum/2;
	    }
	    if(i<0){
	    	while(j>=0){
	    		int sum=b.charAt(j)-'0'+count;
	    		sb.append(sum%2+"");
		    	count=sum/2;
		    	j--;
	    	}
	    }else{
	    	while(i>=0){
	    		int sum=a.charAt(i)-'0'+count;
	    		sb.append(sum%2+"");
		    	count=sum/2;
		    	i--;
	    	}
	    }
	    if(count>0)
	    	sb.append(count+"");
	    return sb.reverse().toString();
	}

}
