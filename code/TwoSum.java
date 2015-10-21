package code;

import java.util.Arrays;
import java.util.Comparator;

//Given an array of integers, find two numbers such that they add up to a specific target number.
//
//The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
//
//You may assume that each input would have exactly one solution.
//
//Input: numbers={2, 7, 11, 15}, target=9
//Output: index1=1, index2=2
class ArrayNode{
	int index;
	int val;
}
public class TwoSum {

	public static void main(String[] args) {
		int a[]=new int[]{
				3,2,4
		};
		// TODO 自动生成的方法存根
		twoSum(a, 6);
	}
	 public static int[] twoSum(int[] numbers, int target) {
		 int[] result=new int[2];
		 int count=numbers.length;
		 if(count<2)
			 return result;
		 int i=0;
		 int j=count-1;
		 ArrayNode []b=new ArrayNode[count];
		 for (int k = 0; k < count; k++) {
			 b[k]=new ArrayNode();
			 b[k].index=k;
			 b[k].val=numbers[k];
			
		}
		 Arrays.sort(b,new Comparator<ArrayNode>() {

			@Override
			public int compare(ArrayNode o1, ArrayNode o2) {
				// TODO 自动生成的方法存根
				return o1.val-o2.val;
			}
		});
		 while(i<j){
			 int sum=b[i].val+b[j].val;
			 if(sum==target)
				 break;
			 if(sum>target)
				 j--;
			 if(sum<target)
				
				 i++;
		 }
		 
		 result[0]=(b[i].index>b[j].index)?b[j].index:b[i].index+1;
			
		 result[1]=(b[i].index>b[j].index)?b[i].index:b[j].index+1;
		 return result;
	 }

}
