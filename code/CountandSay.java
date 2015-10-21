package code;
//The count-and-say sequence is the sequence of integers beginning as follows:
//1, 11, 21, 1211, 111221, ...
//
//1 is read off as "one 1" or 11.
//11 is read off as "two 1s" or 21.
//21 is read off as "one 2, then one 1" or 1211.
//Given an integer n, generate the nth sequence.
//
//Note: The sequence of integers will be represented as a string.
public class CountandSay {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print(countAndSay(2));
	}
	public static String countAndSay(int n) {
		String input="1";
		for(int i=1;i<n;i++){
			input=countAndSayForOneString(input);
		}
		return input;
	}
	private  static String countAndSayForOneString(String input) {
		// TODO 自动生成的方法存根
		char lastChar=input.charAt(0);
		int count=1;
		StringBuilder sBuilder=new StringBuilder();
		for(int i=1;i<input.length();i++){
			if(input.charAt(i)==lastChar){
				count++;
			}else {
				sBuilder.append(Integer.toString(count)+lastChar);
				count=1;
				lastChar=input.charAt(i);
			}
		}
		sBuilder.append(""+count+lastChar);
		return sBuilder.toString();
	}
}
