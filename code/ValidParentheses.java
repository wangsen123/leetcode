package code;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
public class ValidParentheses {
	  public boolean isValid(String s) {
		  if(s==null||s.length()==0)
			  return true;
	       Map<Character, Character> map=new HashMap<Character, Character>();
		   map.put('{', '}');
		   map.put('[', ']');
		   map.put('(', ')');
		   Stack<Character> stack=new Stack();
		   for(int i=0;i<s.length();i++){
			   char cur=s.charAt(i);
			   if(map.keySet().contains(cur))
				   stack.add(s.charAt(i));
			   else if(map.values().contains(cur)){
				   if(!stack.empty()&&cur==map.get(stack.peek())){
					   stack.pop();
				   }
				   else {
					return false;
				}
				   
			   }
		   }
		   //注意stack空了才能是对的
		   return stack.empty();
		  
	       
	  }
}
