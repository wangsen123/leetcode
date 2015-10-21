package code;
//Simplify Path Total Accepted: 35464 Total Submissions: 176460 My Submissions Question Solution 
//Given an absolute path for a file (Unix-style), simplify it.
//
//For example,
//path = "/home/", => "/home"
//path = "/a/./b/../../c/", => "/c"
//click to show corner cases.
import java.util.Stack;

public class SimplifyPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	}
	 public String simplifyPath(String path) {
		 if(path.length()==0||path.charAt(0)!='/')
			 return "";
		 Stack<String> vec=new Stack<String>() ;  
	        
	        String curpath=path.substring(1);
	        int firstindex=0;
	        while(firstindex!=-1)  
	        {  
	            firstindex=curpath.indexOf("/");
	            String sub="";
	            if(firstindex==-1){
	            	sub = curpath.substring(0,curpath.length()); 
	 	            curpath=curpath.substring(firstindex+1);
	            }else{
	            	sub = curpath.substring(0,firstindex); 
	 	            curpath=curpath.substring(firstindex+1);
	            }
	           
	            if(sub.length()>0){  
	                if(sub .equals("..") ){  
	                    if(!vec.isEmpty()) vec.pop();  
	                }  
	                else if(!sub .equals("."))  
	                    vec.push(sub);  
	            }  
	           
	        }  
	     
	        if(vec.isEmpty()){
	        	return "/";
	        }
	        String res = "";
	        
	        while(!vec.isEmpty()){
	        	 res = "/"+vec.pop() + res;
	        }
	        return res;  
	    }
}
