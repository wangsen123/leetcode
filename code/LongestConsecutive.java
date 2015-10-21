package code;
//Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
//
//For example,
//Given [100, 4, 200, 1, 3, 2],
//The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
//
//Your algorithm should run in O(n) complexity.
import java.util.HashSet;

public class LongestConsecutive {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
	}
	public static int longestConsecutive(int[] num) {
		 if(num.length==0){
			 return 0;
		 }
		 int max=1;
		 HashSet<Integer> set=new HashSet<Integer>();
		 for(int e:num){
			 set.add(e);
		 }
		 
		 for(int e:num){

			 int left=e - 1;
			 int right=e + 1;
			 int count=1;
			 while(set.contains(left)){
				 count++;
				 set.remove(left);
				 left--;
			 }
			 while(set.contains(right)){
				 count++;
				 set.remove(right);
				 right++;
			
			 }
			 max=Math.max(max, count);
		 }
		 return max;
	}

}
