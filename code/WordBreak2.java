package code;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WordBreak2 {
  public List<String>  wordBreak(String s, Set<String> dict) {
	      List<String> temp=new ArrayList<String>();
	      List<String> b=new ArrayList<String>();
	      b=firstmatch(s,dict);
//	      for(int i=0;i<=)
		  return temp;
	        
	    }
  public List<String> firstmatch(String s, Set<String> dict){
	  String[] a=(String[])dict.toArray();
	  List<String> temp=new ArrayList<String>();
	  for(int i=0;i<a.length;i++){
		 if(s.substring(0, a[i].length()).equals(a[i])){
			 temp.add(a[i]);
		 }
	  }
	  return temp;
	
	  
  }
}
