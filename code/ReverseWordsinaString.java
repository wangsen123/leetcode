package code;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseWordsinaString {
	public static void main(String []arg){
		System.out.print(reverseWords("a"));
	}
	public static String reverseWords(String s) {
//		if(s==null){
//			return null;
//		}
		if(s.length()==0){
			return "";
		}
		Stack<String> stack=new Stack<String>(); 
		int last=0;
		int i;
		for(i=0;i<s.length();){
			if(s.substring(i, i+1).equals(" ")){
				stack.add(s.substring(last, i));
				int j;
				for(j=i+1;j<s.length()&&s.substring(j, j+1).equals(" ");j++){//在循环中又在遍历这个数组等 把原始条件加上
					
				}
				last=j;
				i=last;
				continue;
			}
			i++;
		}
		stack.add(s.substring(last, i));//注意最后把剩下的做处理
		String string="";
		String temp;
		//以下注意空串
		while(!stack.isEmpty()){
			temp=stack.pop();
			if(!temp.equals(""))//空串就不加进来了
			string=string+temp+" ";
		}
		if(!string.equals(""))//如果是空串的话
		string=string.substring(0, string.length()-1);
		return string;
    }	
}
