package code;
//Given a roman numeral, convert it to an integer.
//
//Input is guaranteed to be within the range from 1 to 3999.
//最后一个用来赋初值，前面的如果大于或等于就加上去，小于就减去这个
import java.util.HashMap;
import java.util.Map;

public class RomanInteger {	
	public int romanToInt(String s) {
	  Map<String, Integer> map=new HashMap<>();
	   map.put("I",1);
	   map.put("V",5);
	   map.put("X",10);
	   map.put("L",50);
	   map.put("C",100);
	   map.put("D",500);
	   map.put("M",1000);
	   int result=0;
	   for (int i = s.length()-1; i>=0; i--) {
		if(i == s.length()-1){
			result=map.get(s.substring(i, i+1));
			continue;
		}
		if(map.get(s.substring(i, i+1))>=map.get(s.substring(i+1, i+2)))
			result+=map.get(s.substring(i, i+1));
		else 
			result-=map.get(s.substring(i, i+1));
		
	   }
	   return result;
	}
    
}
