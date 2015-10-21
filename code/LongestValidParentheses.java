package code;
//Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.
//
//For "(()", the longest valid parentheses substring is "()", which has length = 2.
//
//Another example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4.
import java.util.Stack;

public class LongestValidParentheses {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	public int longestValidParentheses(String s) {
//        if(s==null||s.length()==0)
//        	return 0;
//        int start=0;
//        Stack<Integer> stack =new Stack();
//        int max=0;
//        int cur=0;
//        for(int i=0;i<s.length();i++){
//        	if(s.charAt(i)=='('){
//        		stack.add(i);
//        	}else {
//				if(!stack.isEmpty()){
//					int midstart=stack.peek();
//					stack.pop();
//					if(!stack.isEmpty()){
//						max=Math.max(max, i-midstart+1);
//					}
//				}
//				else {
//					cur=i-start;
//					max=Math.max(cur, max);
//					start=i+1;
//				}
//			}
//        }
//        if(stack.isEmpty()){
//        	cur=s.length()-start;
//        	max=Math.max(cur, max);
//        }
//        return max;
    if(s==null||s.length()==0)
    	return 0;
    int start=0;
    Stack<Integer> stack =new Stack();
    int max=0;
    
    for(int i=0;i<s.length();i++){
    	if(s.charAt(i)=='('){
    		stack.push(i);
    	}else {
			if(stack.isEmpty()){
				start=i+1;
			}
			else {
				stack.pop();
				if(stack.isEmpty()){
					max=Math.max(i-start+1, max);
				}else {
					//在中间遇到(()() 4-0
					max=Math.max(i-stack.peek(), max);
				}
				
			}
		}
    }
    return max;
}
}
