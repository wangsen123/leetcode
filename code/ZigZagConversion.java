package code;
//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
//
//P   A   H   N
//A P L S I I G
//Y   I   R
//And then read line by line: "PAHNAPLSIIGYIR"
//Write the code that will take a string and make this conversion given a number of rows:
//
//string convert(string text, int nRows);
//convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
public class ZigZagConversion {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	 public String convert(String s, int nRows) {
		 if(s==null||s.length()<=1||nRows<=1)
			 return s;
		 int len=s.length();
		 StringBuilder sb=new StringBuilder();
		 for(int i=0;i<nRows&&i<len;i++){
			 int k=i;
			 if(k==0||k==nRows-1)
				 while(k<len){
					 sb.append(s.charAt(k));
					 k+=2*nRows-2;
				 
				 }
			 else {
				 while(k<len){
					 sb.append(s.charAt(k));
					 k+=2*(nRows-i)-2;
					 if(k>=len)
						 break;
					 sb.append(s.charAt(k));
					 k+=2*i;
				 
				 }
			}
		 }
		 return sb.toString();
		 
		 
	 }

}
