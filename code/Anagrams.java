package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Given an array of strings, return all groups of strings that are anagrams.
//
//Note: All inputs will be in lower-case.
public class Anagrams {
	public static void main(String[] args) {
//		Map<String, Integer> map=new HashMap();
//		map.put("", 1);
//		System.out.print(map.containsKey(""));
		System.out.print(anagrams(new String[]{
				"",""
		}));
	}
	public static List<String> anagrams(String[] strs) {
		List<String> result=new ArrayList();
		Map<String, Integer> map=new HashMap();
		int count=strs.length;
		if(count<2)
			return result;
		for(int i=0;i<count;++i){
			char[] a=new char[strs[i].length()];
			a=strs[i].toCharArray();
			Arrays.sort(a);
			String b=String.valueOf(a);//char数组转化为String 使用String.valueOf，不能使用 a.toString()。
			if(!map.containsKey(b))
				 map.put(b,i);
			else {
				int index=map.get(b);
				if(index>=0){
					result.add(strs[index]);
					//	1.7无法用map.replace(b, index, -1);
					map.remove(b);
					map.put(b,-1);
					result.add(strs[i]);
				}
				else{
					result.add(strs[i]);
				}
			}
	
		}
		return result;
    }
}
