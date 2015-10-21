package code;
//Given a digit string, return all possible letter combinations that the number could represent.
//
//A mapping of digit to letters (just like on the telephone buttons) is given below.
//
//
//
//Input:Digit string "23"
//Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import experience.ListSet;

public class LetterCombinationsofaPhoneNumber {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print(letterCombinations("23"));
	}
	 public static List<String> letterCombinations(String digits) {
		 if(digits==null||digits.length()==0)
			 return Collections.EMPTY_LIST;
		 List<String> result=new ArrayList<String>();
		 Map<Character, Character[]> map=new HashMap<Character, Character[]>();
		 Character[] two=new Character[]{
				 'a','b','c'
		 };
		 map.put('2', two);
		 two=new Character[]{
				 'd','e','f'
		 };
		 map.put('3', two);
		 two=new Character[]{
				 'g','h','i'
		 };
		 map.put('4', two);
		 two=new Character[]{
				 'j','k','l'
		 };
		 map.put('5', two);
		 two=new Character[]{
				 'm','n','o'
		 };
		 map.put('6', two);
		 two=new Character[]{
				 'p','q','r','s'
		 };
		 map.put('7', two);
		 two=new Character[]{
				 't','u','v'
		 };
		 map.put('8', two);
		 two=new Character[]{
				 'w','x','y','z'
		 };
		 map.put('9', two);
		 StringBuilder sb=new StringBuilder();
		 dfs(digits,result,map,sb,0);
		 return result;
		 
	 }
	private static void dfs(String digits, List<String> result,
			Map<Character, Character[]> map,StringBuilder sb,int i) {
		// TODO 自动生成的方法存根
		if(i==digits.length()){
			result.add(sb.toString());
			return;
		}
		
		Character[] chars=map.get(digits.charAt(i));
		for(int j=0;j<chars.length;++j){
			sb.append(chars[j]);
			dfs(digits, result, map, sb, i+1);
			sb.replace(i, i+1, "");
		}
	}
}
