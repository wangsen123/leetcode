package code;
//Length of Last Word Total Accepted: 56458 Total Submissions: 204354 My Submissions Question Solution 
//Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
//
//If the last word does not exist, return 0.
//
//Note: A word is defined as a character sequence consists of non-space characters only.
//
//For example, 
//Given s = "Hello World",
//return 5.
public class LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int lengthOfLastWord(String s) {
		if(s==null||s.length()==0)
			return 0;
		//去掉多于空格
		s=s.trim();
		int i;
		for(i=s.length()-1;i>=0;i--){
			if(s.charAt(i)==' '){
				break;
			}
		}
		return s.length()-1-i;
    }
}
