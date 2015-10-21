package code;
//You are given a string, S, and a list of words, L, that are all of the same length. Find all starting indices of substring(s) in S that is a concatenation of each word in L exactly once and without any intervening characters.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringwithConcatenationofAllWords {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList<String> list=new ArrayList<>();
		list.add("");
		System.out.print(findSubstring("sffsa",list ));

	}
	public static List<Integer> findSubstring(String S, List<String> L) {
        ArrayList<Integer> list=new ArrayList<>();
		if(L.size()<1)
			return list;
		int len=L.get(0).length();
		Map<String, Integer> map=new HashMap<String, Integer>();
		for(String s:L){
			if(!map.containsKey(s)){
				map.put(s, 1);
			}
			else{
				map.put(s,map.get(s)+1);
			}
		}
		boolean flag;
		for(int i=0;i<=S.length()-L.size()*len;i++){
			int start=i;
			Map<String, Integer> temp=new HashMap<String,Integer>(map);
			//针对空的
			flag=false;
			//确保量是充足的
			while(start-i<L.size()*len){
				flag=true;
				String string=S.substring(start,start+len);
				if(temp.containsKey(string)&&temp.get(string)>0)
					temp.put(string,temp.get(string)-1);
				else{
					flag=false;
					break;
					
				}
				start+=len;
				
					
			}
			if(flag){
				list.add(i);
			}
		}
        return list;
    }

}
