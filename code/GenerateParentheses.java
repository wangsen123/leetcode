package code;

import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class GenerateParentheses {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.print(generateParenthesis(3));
//		  Set set=new HashSet();
//		    set.add(new Date());    //���б����������
//
//		    set.add("apple");     //���б����������
//
//		    set.add(new Socket());    //���б����������
//
//		    int size=set.size();
//		    System.out.println("Set���ϵĴ�СΪ��" + size);
//
//		    set.clear();
//		    set.add("fas");
//		    System.out.println("ִ��clear������Set���ϵĴ�СΪ��" + set.size());
	}
	public static List<String> generateParenthesis(int n) {
//	       List<String> result=new ArrayList<String>();
//	       List<List<String>> total=new ArrayList<List<String>>();
//	       if(n<1)
//	    	   return Collections.EMPTY_LIST;
//	       result.add("()");
//	       if(n==1){
//	    	   return result;
//	       }
//	       
//	       Set<String> set=new HashSet<String>();
//	       total.add(result);
//	       for(int i=1;i<n;i++){
//	    	 
//	           for(String o:total.get(i-1))
//	           {
//	              set.add(e)
//	           }
//	          set=res;
//	          
//           
//	           }
//	       
//	      
//	       Iterator it=set.iterator();
//           while(it.hasNext())
//           {
//               Object o=it.next();
//               result.add(""+o);
//              
//           }
//           
//           return result;
		   List<String> result=new ArrayList<String>();
	       StringBuilder cur=new StringBuilder();
	       if(n<1)
	    	   return Collections.EMPTY_LIST;
	       dfs(result,cur,n,n);
	       return result;
	}
	private static void dfs(List<String> result, StringBuilder cur, int m,
			int n) {
		// TODO �Զ����ɵķ������
		if(m==0&&n==0){
			result.add(cur.toString());
			return;
		}
		StringBuilder sb=new StringBuilder(cur);
		if(m>0){
			cur.append("(");
			dfs(result,cur, m-1, n);
			
		}
		cur=sb;
		if(m<n&&n>0){
			cur.append(")");
			dfs(result, cur, m, n-1);
			
		}
			
		
	}

}
