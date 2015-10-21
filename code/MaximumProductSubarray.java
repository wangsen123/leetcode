package code;
//Find the contiguous subarray within an array (containing at least one number) which has the largest product.
//
//For example, given the array [2,3,-2,4],
//the contiguous subarray [2,3] has the largest product = 6.
public class MaximumProductSubarray {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
//	而对于Product Subarray，要考虑到一种特殊情况，即负数和负数相乘：如果前面得到一个较小的负数，和后面一个较大的负数相乘，得到的反而是一个较大的数，如{2，-3，-7}，所以，我们在处理乘法的时候，除了需要维护一个局部最大值，同时还要维护一个局部最小值，由此，可以写出如下的转移方程式：
//
//	max_copy[i] = max_local[i]
//	max_local[i + 1] = Max(Max(max_local[i] * A[i], A[i]),  min_local * A[i])
//
//	min_local[i + 1] = Min(Min(max_copy[i] * A[i], A[i]),  min_local * A[i])
	public int maxProduct(int[] A) {
		if(A.length==0){
			return 0;
		}
		int local_min=A[0];
		int local_max=A[0];
        int global=A[0];
        for(int i=1;i<A.length;i++){
        	int local_copy=local_max;
        	local_max=Math.max(Math.max(local_max*A[i],A[i]), local_min*A[i]);
        	local_min=Math.min(Math.min(local_copy*A[i],A[i]), local_min*A[i]);
        	global=Math.max(global,local_max);
        }
        return global;
    }
	
}
