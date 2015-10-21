package code;

import java.util.ArrayList;
import java.util.List;

//Given numRows, generate the first numRows of Pascal's triangle.
//
//For example, given numRows = 5,
//Return
//
//[
//     [1],
//    [1,1],
//   [1,2,1],
//  [1,3,3,1],
// [1,4,6,4,1]
//]
public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print(generate(5));
	}
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> temp=new ArrayList<List<Integer>>();
		if(numRows<=0){
			return temp;
		}
		ArrayList<Integer> subtemp=new ArrayList<Integer>();
		ArrayList<Integer> pretemp;
		subtemp.add(1);
		temp.add(subtemp);
		pretemp=subtemp;
		for(int i=2;i<=numRows;i++){
			subtemp=new ArrayList<Integer>();
			subtemp.add(1);
			
			for(int j=1;j<i-1;j++){
				subtemp.add(pretemp.get(j-1)+pretemp.get(j));
			}
			subtemp.add(1);
			temp.add(subtemp);
			pretemp=subtemp;
		}
		return temp;
		
		
		
	}
}
