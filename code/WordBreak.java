package code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
//Given a string s and a dictionary of words dict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.
//
//For example, given
//s = "leetcode",
//dict = ["leet", "code"].
//
//Return true because "leetcode" can be segmented as "leet code".


public class WordBreak {
	public static void main(String[] args){
		
//		 boolean[] a=new boolean[2];
//		 System.out.print(a[1]);
		 Set<String>  b=new HashSet<String>();
		 b.add("b");
		 b.add("abc");
		 b.add("b");
		 b.add("cd");
		 System.out.print(wordBreak("abcd",b));
		
	}
	 public static boolean wordBreak(String s, Set<String> dict) {
		    if (s==null)
		    	return true;
		    if(dict.size()==0)
		    	return false;
	        int n =s.length();
	        boolean[] dp=new boolean[n+1];
	        dp[0]=true;
	        for(int i=1;i<=n;i++){
	        	if(dp[i-1]){
	        		int idx=i-1;
	        		for(int j=idx;j<n;j++){
	        			String cur=s.substring(idx,j+1);
	        			if(dict.contains(cur)){
	        				dp[j+1]=true;
	        			}
	        		}
	        	}
	        }
//	        System.out.print(dp[0]);
			return dp[n];
	          
	    }
}
