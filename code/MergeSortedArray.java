package code;
//Given two sorted integer arrays A and B, merge B into A as one sorted array.
//
//Note:
//You may assume that A has enough space (size that is greater or equal to m + n) to hold additional elements from B. The number of elements initialized in A and B are m and n respectively.
public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		int[] q=new int[3];
//		System.out.print(q[2]); 0
		
	}
	 public void merge(int A[], int m, int B[], int n) {
		
		 int[] result=new int[m+n];
		 int i=0;
		 int j=0;
		 int k=0;
		 if(m==0&&n==0)
			 return;
		 while(i<m&&j<n){
			 if(A[i]>=B[j]){
				 result[k]=B[j];
				 j++;
				 k++;
			 }
			 else {
				 result[k]=A[i];
				 i++;
				 k++;
			}
		 }
		 
		 if(i<m){
			for(;i<m;++i){
				result[k]=A[i];
				 
				 k++;
			}
		 }
		 else {
			 //细细检查代码
				for(;j<n;++j){
					result[k]=B[j];
					
					k++;
				}
		}
		 
		for(int r=0;r<m+n;++r){
			A[r]=result[r];
		}
	 }
}
