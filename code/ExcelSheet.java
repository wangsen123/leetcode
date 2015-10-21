package code;

import org.omg.CORBA.ARG_IN;

//Given a positive integer, return its corresponding column title as appear in an Excel sheet.
//
//For example:
//
//    1 -> A
//    2 -> B
//    3 -> C
//    ...
//    26 -> Z
//    27 -> AA
//    28 -> AB 
public class ExcelSheet {
	public static void main(String []args){
		System.out.print(convertToTitle(2));
	}
	 public static String convertToTitle(int n) {
		   String string="";
	        char c;
	        int mod;
           while(n>0){
              mod=n%26;
              n=n/26;
              if(mod==0){
                  mod=26;
                  n--;
              }
              c=(char) (64+mod);
           
              string=c+string;
           }
          
	        return string;
	    }
}
