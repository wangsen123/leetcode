package code;


//'?' Matches any single character.
//'*' Matches any sequence of characters (including the empty sequence).
//
//The matching should cover the entire input string (not partial).
//
//The function prototype should be:
//bool isMatch(const char *s, const char *p)
//
//Some examples:
//isMatch("aa","a") → false
//isMatch("aa","aa") → true
//isMatch("aaa","aa") → false
//isMatch("aa", "*") → true
//isMatch("aa", "a*") → true
//isMatch("ab", "?*") → true
//isMatch("aab", "c*a*b") → false
public class Match {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(isMatch("aa","*"));
//		System.out.print((char)('A'+1-1));

	}
	 public static  boolean isMatch(String s, String p) {
		   int lenS=s.length();
	       int lenP=p.length();
	       int count=0;
	       int i;
	       for(i=0;i<p.length();i++){
	    	   if(p.charAt(i)!='*')
	    		   count++;
	       }
	       if(count>lenS)
	    	    return false;
	       boolean dp[][]=new boolean[500][500];
	       dp[0][0]=true;
	       if(lenS==0&&count==0){
	           return true;
	       }
	   
	       for(int j=1;j<=p.length();j++){
	    	   if(dp[0][j-1]&&p.charAt(j-1)=='*')  dp[0][j]=true;
	    	   for(i=1;i<=s.length();i++){
	    		   if(p.charAt(j-1)=='*') dp[i][j]=dp[i-1][j]||dp[i][j-1];
	    		   else if(p.charAt(j-1)=='?'||p.charAt(j-1)==s.charAt(i-1)) dp[i][j]=dp[i-1][j-1];
	    		   else dp[i][j]=false;
	    	   }
	       }
	       
	       return dp[lenS][lenP];
	    }
}
