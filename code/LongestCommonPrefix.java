package code;
//Write a function to find the longest common prefix string amongst an array of strings.
public class LongestCommonPrefix {
	 public String longestCommonPrefix(String[] strs) {
		 if(strs.length==0)
			 return "";
		 String tempString=strs[0];
	     for (int i = 1; i < strs.length; i++) {
	    	int j=0;
			while(j<tempString.length()&&j<strs[i].length()){
				if(tempString.charAt(j)!=strs[i].charAt(j))
					break;
				++j;
			}
			tempString=tempString.substring(0, j);
	     }  
	     return tempString;
	 }
}
