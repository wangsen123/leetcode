package code;

import java.util.ArrayList;
import java.util.List;

//Given an index k, return the kth row of the Pascal's triangle.
//
//For example, given k = 3,
//Return [1,3,3,1].
//
//Note:
//Could you optimize your algorithm to use only O(k) extra space?
public class PascalTriangleTwo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	  public List<Integer> getRow(int rowIndex) {
	       
			if(rowIndex<0){
				return null;
			}
			ArrayList<Integer> subtemp=new ArrayList<Integer>();
			ArrayList<Integer> pretemp;
			
			subtemp.add(1);
			if(rowIndex==0)
			    return subtemp;
			pretemp=subtemp;
			for(int i=1;i<=rowIndex;i++){
				subtemp=new ArrayList<Integer>();
				subtemp.add(1);
				
				for(int j=1;j<i;j++){
					subtemp.add(pretemp.get(j-1)+pretemp.get(j));
				}
				subtemp.add(1);
				
				pretemp=subtemp;
			}
			return subtemp;
			
	    }
}
