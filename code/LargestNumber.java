package code;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public String largestNumber(int[] nums) {
    	if(nums==null||nums.length==0)
    		return "0";
    	int length=nums.length;
        String[] numbers=new String[length];
        for(int i=0;i<length;i++){
        	numbers[i]=nums[i]+"";
        }
        Arrays.sort(numbers, new Comparator<String>(){  
        	   
            @Override  
            public int compare(String s1, String s2) {  
                String ab=s1+s2;
                String ba=s2+s1;
                //现在两个数字都可以比较大了，只用整数是不行的了
                return ab.compareTo(ba);
            }  
        });
        StringBuilder sb=new StringBuilder();
        //是递减
        for(int i=length-1;i>=0;i--){
        	sb.append(numbers[i]);
        }
        String result=sb.toString();
        
        int i;
        for(i=0;i<result.length();i++){
        	if(result.charAt(i)!='0')
        		break;
        }
        result=result.substring(i,result.length());
        if(result.length()==0)
        	return "0";
        return result;
    }

}
