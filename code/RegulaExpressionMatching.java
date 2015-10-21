package code;
//Implement regular expression matching with support for '.' and '*'.
//
//'.' Matches any single character.
//'*' Matches zero or more of the preceding element.
//
//The matching should cover the entire input string (not partial).
//
//The function prototype should be:
//bool isMatch(const char *s, const char *p)
//
//Some examples:
//isMatch("aa","a") → false
//isMatch("aa","aa") → true
//isMatch("aaa","aa") → false
//isMatch("aa", "a*") → true
//isMatch("aa", ".*") → true
//isMatch("ab", ".*") → true
//isMatch("aab", "c*a*b") → true
public class RegulaExpressionMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isMatch("aaa", "ab*a*c*a");
	}
	  public static boolean isMatch(String s, String p) {
//	    int i=0;
//	    int j=0;
//	    char before = '\0';
//	    //两个都要判断
//	    while(i<s.length()&&j<p.length()){
//	    	if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='.'){
//	    		//直接取值 取p的值
//	    		before=p.charAt(j);
//	    		i++;
//	    		j++;
//	    		
//	    	}else{
//	    		//判断前一个是.
//	    		if(p.charAt(j)=='*'&&(s.charAt(i)==before||before=='.')){
//	    			i++;
//	    			
//	    		}else if(p.charAt(j)=='*'){
//	    			j++;
//	    			//出现"aaa", "a*a" 注意j<p.length() 先保存前一个的值
//	    			while(j<p.length()&&p.charAt(j)==before){
//	    			    before=p.charAt(j);
//	    				j++;
//	    				
//	    			}
//	    			before='\0';
//	    		}else if(j+1<p.length()&&p.charAt(j+1)=='*'){
//	    			j=j+2;
//	    		}else {
//					return false;
//				}
//	    		
//	    		
//	    	}
//	    
//	    }
//	    //每次用j注意判断
//	    
//	    
//		
//		
//	    
//	    
//	    //每种都做判断
//	    if(i<s.length()&&j>=p.length())
//	    	return false;
//	    if(i>=s.length()&&j>=p.length())
//	    	return true;
//	    if(p.charAt(j)=='*')
//	    	j++;
//	    //出现"aaa", "a*a" 注意j<p.length()
//	    while(j<p.length()&&p.charAt(j)==before){
//		    before=p.charAt(j);
//			j++;
//	    }
//	    while(j<p.length()){
//	    	if(p.charAt(j)!='*'&&j+1<p.length()&&p.charAt(j+1)=='*')
//	    		j=j+2;
//	    	else
//	    		return false;
//	    }
//	    return true;
//改的醉了。。。
		  //ac的代码
		  if(p.length() == 0)
	            return s.length() == 0;
	 
	        //p's length 1 is special case    
	        if(p.length() == 1 || p.charAt(1) != '*'){
	            if(s.length() < 1 || (p.charAt(0) != '.' && s.charAt(0) != p.charAt(0)))
	                return false;
	            return isMatch(s.substring(1), p.substring(1));    
	 
	        }else{
	            int len = s.length();
	 
	            int i = -1; 
	            while(i<len && (i < 0 || p.charAt(0) == '.' || p.charAt(0) == s.charAt(i))){
	                if(isMatch(s.substring(i+1), p.substring(2)))
	                    return true;
	                i++;
	            }
	        }
	            return false;
	  }
}
