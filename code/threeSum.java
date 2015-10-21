package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
	public static void main(String[] arg){
		int[] a=new int[]{0,0,0};
		System.out.print(threeSumSolution(a));
	}
	public static List<List<Integer>> threeSumSolution(int[] num) {
		List<List<Integer>> temp = new ArrayList<List<Integer>>();
		temp.clear();
		Arrays.sort(num);
		for (int i = 0; i != num.length; i++) {
             if(i>0&&num[i]==num[i-1])
            	 continue;
             
             int j,k;
             j=i+1;
             k=num.length-1;
             while(j<k){
            	 if(j>i+1&&num[j]==num[j-1]){
            		 j++;
            		 continue;
   
            	 }
            	 if(k<num.length-1&&num[k]==num[k+1]){
            		 k--;
            		 continue;
            	 }
            	 int sum=num[i]+num[j]+num[k];
            	 if(sum>0){
            		 k--;
            	 }
            	 else if(sum<0){
            		 j++;
            	 }else{
            		 List<Integer> subtemp=new ArrayList<Integer>();
            		 subtemp.add(num[i]);
            		 subtemp.add(num[j]);
            		 subtemp.add(num[k]);
            		 temp.add(subtemp);
            		 j++;
            	 }
             }
		}

		return temp;
	}
}
