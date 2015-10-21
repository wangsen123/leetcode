package code;
//Given a string, find the length of the longest substring without repeating characters. For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	public int lengthOfLongestSubstring(String s) {
		if(s==null)
			return 0;
			int max=0;
			        for(int i=0;i<s.length();++i){
			        int j=i;
			        
			        int index=s.charAt(j)-' ';
			        boolean exist[]=new boolean[100];
			        while(!exist[index]){
			        exist[index]=true;
			        ++j;
			        if(j>=s.length())
			        break;
			        index=s.charAt(j)-' ';
			        }
			        int len=j-i;
			        max=(max>len)?max:len;
			        
			        }
			        return max;
    }
}
