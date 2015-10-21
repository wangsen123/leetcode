package code;
//Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
//
//For example,
//"A man, a plan, a canal: Panama" is a palindrome.
//"race a car" is not a palindrome.
//
//Note:
//Have you consider that the string might be empty? This is a good question to ask during an interview.
//
//For the purpose of this problem, we define empty string as valid palindrome.
public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isPalindrome(String s) {
	   if(s==null||s.length()==0){
		   return true;
	   }
	   int i=0;
	   int j=s.length()-1;
	   while(i<=j){
		   while(i<=j&&!isAlaNum(s.charAt(i)))
			   i++;
		   
		   while(i<=j&&!isAlaNum(s.charAt(j)))
			   j--;
		   if(i>j)
			   break;
		   if(toLow(s.charAt(i))!=toLow(s.charAt(j)))
				   return false;
		   i++;
		   j--;
	   }
	   return true;
	}
	private char toLow(char c) {
		// TODO Auto-generated method stub
		if(c>='A'&&c<='Z')
			return (char) (c+'a'-'A');
		return c;
	}
	private boolean isAlaNum(char c) {
		// TODO Auto-generated method stub
		if(c>='a'&&c<='z')
			return true;
		if(c>='A'&&c<='Z')
			return true;
		if(c>='0'&&c<='9')
			return true;
		return false;
	}

}
