package code;

import java.util.ArrayList;
import java.util.List;
//Triangle My Submissions Question Solution 
//Total Accepted: 51440 Total Submissions: 184601 Difficulty: Medium
//Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.
//
//For example, given the following triangle
//[
//     [2],
//    [3,4],
//   [6,5,7],
//  [4,1,8,3]
//]
//The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int minimumTotal(List<List<Integer>> triangle) {
        int length=triangle.size();
        if(length==0)
        	return 0;
        ArrayList<Integer> premin;
        ArrayList<Integer> minval=new ArrayList<>();
        minval.add(triangle.get(0).get(0));
        for(int i=1;i<length;i++){
        	premin=minval;
        	minval=new ArrayList<>();
        	minval.add(premin.get(0)+triangle.get(i).get(0));
        	int prelength=premin.size();
        	for(int j=1;j<prelength;j++){
        		minval.add(Math.min(premin.get(j-1), premin.get(j))+triangle.get(i).get(j));
        	}
        	minval.add(premin.get(prelength-1)+triangle.get(i).get(prelength));
        }
        int sum=minval.get(0);
        for(int i=1;i<minval.size();i++){
        	sum=Math.min(sum, minval.get(i));
        }
        return sum;
    }

}
