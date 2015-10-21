package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



//Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.
//
//Note:
//Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ≤ b ≤ c ≤ d)
//The solution set must not contain duplicate quadruplets.
//    For example, given array S = {1 0 -1 0 -2 2}, and target = 0.
//
//    A solution set is:
//    (-1,  0, 0, 1)
//    (-2, -1, 1, 2)
//    (-2,  0, 0, 2)
public class FourSum {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] a=new int[]{3,1,4,2,5,-4,2,4,-5};
		System.out.print(fourSum(a,-12));
	}
	public static List<List<Integer>> fourSum(int[] num, int target) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        Arrays.sort(num);
        for(int i=0;i<num.length;i++){
        	if(i>0&&num[i]==num[i-1])
        		continue;
        	for(int j=i+1;j<num.length;j++){
        		if(j>i+1&&num[j]==num[j-1])
            		continue;
        		int k=j+1;
        		int m=num.length-1;
        		
        		while(k<m){
        			//k-1
        			if(k>j+1&&num[k]==num[k-1]){
        				k++;
        				continue;
        			}
        			//m--
        			if(m<num.length-1&&num[m]==num[m+1]){
        				m--;
        				continue;
        			}
        			int sum=num[i]+num[j]+num[k]+num[m]-target;
        			if(sum<0){
        				k++;
        			}else if(sum>0){
        				m--;
        			}else{
        				List<Integer> element =new ArrayList<Integer>();
        				element.add(num[i]);
        				element.add(num[j]);
        				element.add(num[k]);
        				element.add(num[m]);
        				result.add(element);
        				k++;
        			}
        		}
        	}
        }
        return result;
        
    }

}
