package code;
//Implement strStr() Total Accepted: 46286 Total Submissions: 209890 My Submissions Question Solution 
//Implement strStr().
//
//Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
public class ImplementstrStr {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print(strStr("mississippi", "pi"));
	}
	 public static int strStr(String haystack, String needle) {
		 // know length
		 int len=needle.length();
		  if(haystack.length()<needle.length())
			  return -1;
		  if(haystack.length()==len)
			  return haystack.equals(needle)?0:-1;
	      
	      int i;
	      //=
	      for(i=0;i<=haystack.length()-len;i++){
	    	  boolean a=needle.equals(haystack.substring(i, i+len));
	    	  if(a)
	    	  	break;
	      }
	      if(i<=haystack.length()-len)
	    	  return i;
	      return -1;
	      
	 }
}
