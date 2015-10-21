package code;
//Remove Element Total Accepted: 50575 Total Submissions: 155945 My Submissions Question Solution 
//Given an array and a value, remove all instances of that value in place and return the new length.
//
//The order of elements can be changed. It doesn't matter what you leave beyond the new length.
public class RemoveElement {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	 public int removeElement(int[] A, int elem) {
	        if(A.length==0)
				return 0;
			
			int j=0;
	        for(int i=0;i<A.length;i++){
	        	if(elem!=A[i]){
	        		A[j]=A[i];
	        		j++;
	        	}
	        	
	        }
	        return j;
	    }

}
