package code;
//Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
//
//Do not allocate extra space for another array, you must do this in place with constant memory.
//
//For example,
//Given input array A = [1,1,2],
//
//Your function should return length = 2, and A is now [1,2].
public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	public int removeDuplicates(int[] A) {
		if(A.length==0||A.length==1)
			return A.length;
		int i=1;
		int pre=A[0];
		int j=1;
        for(;i<A.length;i++){
        	if(pre!=A[i]){
        		pre=A[i];
        		A[j]=pre;
        		j++;
        	}
        	
        }
        return j;
    }
	

}
