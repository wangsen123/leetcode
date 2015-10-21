package code;
//Given a string S, find the longest palindromic substring in S. You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.
public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("dfsa".substring(1,2));
		System.out.print(longestPalindrome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
	}
	//穷举法
//	 public static String longestPalindrome(String s) {
//	      if(s==null)
//	    	  return null;
//	      int max=0;
//	      String longString="";
//	      for(int i=0;i<s.length();++i){
//	    	  String eString = null;
//	    	  for(int j=s.length();j>i;j--){
//	    		  eString=s.substring(i, j);
//	    		  if(isPalindromic(eString))
//	    			  break;
//	    	  }
//	    	  if(eString.length()>max){
//	    		  max=eString.length();
//	    		  longString=eString;
//	    	  }
//	      }
//	      return longString;
//	    		  
//	    	  
//	 }
//	private static boolean isPalindromic(String s) {
//		if(s.length()==0)
//			return true;
//		int i=0;
//		int j=s.length()-1;
//		while(i<j){
//			if(s.charAt(i)!=s.charAt(j))
//				return false;
//			i++;
//			j--;
//		}
//		return true;
//		
//	}
	//Dp
	  public static String longestPalindrome(String s) {
		  
		if(s==null&&s.length()==0) 
			return "";
		int len=s.length();
		if(len==1)
			return s;
		int start=0;
		int end=0;
		int max=0;
		
		
		boolean[][] flag=new boolean[len][len];
		
		for(int i=0;i<len;++i)
			for(int j=0;j<len;++j)
			{
				if(i>=j)
					flag[i][j]=true;
				
			}
		for(int j=1;j<len;++j)
			for(int i=0;i<j;++i){
				if(s.charAt(i)==s.charAt(j)&&flag[i+1][j-1]){
					flag[i][j]=true;
					
						int subcount=j-i+1;
						if(max<subcount){
							max=subcount;
							start=i;
							end=j;
					}
						
				}
				else {
					flag[i][j]=false;
				}
			}
    	 return s.substring(start, end+1);
	  }
	  
}



