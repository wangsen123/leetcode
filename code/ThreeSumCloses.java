package code;
//3Sum Closest Total Accepted: 33841 Total Submissions: 125526 My Submissions Question Solution 
//Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
//
//    For example, given array S = {-1 2 1 -4}, and target = 1.
//
//    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumCloses {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	public int threeSumClosest(int[] num, int target) {
	    
	     
	     Arrays.sort(num);
	     int min=Math.abs(num[0]+num[1]+num[2]-target);
	     int sum = num[0]+num[1]+num[2];
	     for (int i = 0; i != num.length; i++) {
             if(i>0&&num[i]==num[i-1])
            	 continue;
             int j,k;
             j=i+1;
             k=num.length-1;
             while(j<k){
            	 if(j>i+1&&num[j]==num[j-1]){
            		 j+=1;
            		 continue;
   
            	 }
            	 if(k<num.length-1&&num[k]==num[k+1]){
            		 k--;
            		 continue;
            	 }
            	 int sub=num[i]+num[j]+num[k]-target;
            	 if(sub>0){
            		 if(sub<min){
            			 min=sub;
            			 sum=num[i]+num[j]+num[k];
            		 }
            		 k--;
            	 }
            	 else if(sub<0){
            		 if(Math.abs(sub)<min){
            			 min=Math.abs(sub);
            			 sum=num[i]+num[j]+num[k];
            		 }
            		 j++;
            	 }else{
            		return target;
            	 }
             }
		
	    	 
	     }
	     return sum;
	}

}
