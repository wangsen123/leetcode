package code;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

class CharIndex{
	char c;
	int index;
	CharIndex(char c,int index) {
		// TODO Auto-generated constructor stub
		this.c=c;
		this.index=index;
	}
}
public class WordPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wordPattern("deadbeef",
				"d e a d b e e f");
	}
	
    public static boolean wordPattern(String pattern, String str) {
       char[] pat=pattern.toCharArray();
       int length=pat.length;
       CharIndex[] charindex=new CharIndex[length];
       for(int i=0;i<length;i++)
    	   charindex[i]=new CharIndex(pat[i], i);
       Arrays.sort(charindex, new Comparator<CharIndex>() {

		@Override
		public int compare(CharIndex o1, CharIndex o2) {
			// TODO Auto-generated method stub
			return o1.c-o2.c;
		}
	});
       String[] strings=str.split(" ");
       //注意个数多少
       if(strings.length!=length)
    	   return false;
       Set<String> set=new HashSet<>();
       //比较对应的下标的字符串i
       set.add(strings[charindex[0].index]);
       for(int i=1;i<length;i++){
    	   if(charindex[i].c==charindex[i-1].c){
    		   //比较对应的下标的字符串i i-1
    		   if(!strings[charindex[i].index].equals(strings[charindex[i-1].index]))
    			   return false;
    	   }else{
    		   if(set.contains(strings[charindex[i].index]))
    			   return false;
    		   else {
    			   
    			   set.add(strings[charindex[i].index]);
    		   }
    	   }
    	   
       }
       return true;
    }

}
