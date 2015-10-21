package code;

import java.util.Arrays;

//A message containing letters from A-Z is being encoded to numbers using the following mapping:
//
//'A' -> 1
//'B' -> 2
//...
//'Z' -> 26
//Given an encoded message containing digits, determine the total number of ways to decode it.
//
//For example,
//Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).
//
//The number of ways decoding "12" is 2.
public class DecodeWays {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print(numDecodings("10"));
	}
	//递归形式
//	public static int numDecodings(String s) {
//		if(s.length()==0||(s.substring(0, 1)).equals("0"))
//			return 0;
//		return numDecodingsr(s);
//	}
//	
//	public static int numDecodingsr(String s) {
//	    
//	    if(s.length()==0)
//	    	return 1;
//	    if(s.substring(0, 1).equals("0"))
//	    	return 0;
//	    if(s.length()==1)
//	    	return 1;
//
//	    int i=Integer.parseInt(s.substring(s.length()-2,s.length()));
//	    if(i==0||i==30||i==40||i==50||i==60||i==70||i==80||i==90)
//	    	return 0;
//	    if(i==20||10==i)
//	    	return numDecodingsr(s.substring(0, s.length()-2));
//	    if((i>=11&&i<=19)||(i>=21&&i<=26))
//	    		return numDecodingsr(s.substring(0, s.length()-2))+numDecodingsr(s.substring(0, s.length()-1));
//	    return numDecodingsr(s.substring(0, s.length()-1));
//	}
	
//非递归	
	public static int numDecodings(String s) {
		if(s.length()==0){
			return 0;
		}
		int num[]=new int[2];
		Arrays.fill(num, 0);
		if(s.charAt(s.length()-1)!='0'){
			num[1]=1;
		}
		if(s.length()==1)
			return num[1];
		if(s.charAt(s.length()-2)!='0'){
			if(isLessThan26(s.charAt(s.length()-2),s.charAt(s.length()-1)))
				num[0]=num[1]+1;
			else
				num[0]=num[1];
		}
		if(s.charAt(0)=='0')
			return 0;
		for(int i=s.length()-3;i>=0;i--){
			int n=0;
			if(s.charAt(i)!='0'){
				 if (i < s.length() - 1 && s.charAt(i + 1) == '0') {  
	                    n += 0;  
	                } else {  
	                    n += num[0];  
	                }  
				 if(i<s.length()-1){
					 if(isLessThan26(s.charAt(i),s.charAt(i+1)))
						 n+=num[1];
				 }
			}
			num[1]=num[0];
			num[0]=n;
		}
		return num[0];	
	}


	private static boolean isLessThan26(char a, char b) {
		// TODO 自动生成的方法存根
		if(a=='1')
			return true;
		if(a=='2'&&b<='6')
			return true;
		return false;
	}
}
