package code;
//Given a string S and a string T, count the number of distinct subsequences of T in S.
//
//A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ACE" is a subsequence of "ABCDE" while "AEC" is not).
//
//Here is an example:
//S = "rabbbit", T = "rabbit"
//
//Return 3.
public class DistinctSubsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int numDistinct(String s, String t) {
	    if(s==null||t==null){    
	    	return 0;
	    }
	    if(s.length()<t.length())
	    	return 0;
	    int slength=s.length();
	    int tlength=t.length();
	    int[][] dp=new int[slength+1][tlength+1];
	    for(int i=0;i<=slength;i++){
	    	dp[i][0]=1;
	    }
	    for(int i=1;i<=slength;i++)
	    	for(int j=1;j<=tlength;j++){
	    		if(s.charAt(i-1)==t.charAt(j-1))
	    			dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
	    		else
	    			dp[i][j]=dp[i-1][j];
	    	}
	    return dp[slength][tlength];
	}
}
