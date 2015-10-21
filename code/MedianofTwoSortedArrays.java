package code;

public class MedianofTwoSortedArrays {
	//没考虑数组都是0的情况
	public static void main(String[] args){
		int A[]=new int[]{
				
		};
		int B[]=new int[]{
				62
		};
		findMedianSortedArrays(A, B);
	}
	public static double  findMedianSortedArrays(int A[], int B[]) {
        int m=A.length;
        int n=B.length;
        int total=m+n;
        if((total&1)==1)
        	return findKth(A,0,m,B,0,n,total/2+1);
        else {
			return (findKth(A,0,m,B,0,n,total/2)+findKth(A,0,m,B,0,n,total/2+1))/2.0;
		}
    }

	private static int findKth(int[] a, int i, int m, int[] b, int j, int n, int k) {
		// TODO 自动生成的方法存根
		if(m>n)
			return findKth(b, j, n,a, i, m, k);
		if(m==0)
			return b[j+k-1];
		if(k==1)
			return min(a[i], b[j]);
		int pa=min(k/2, m),pb=k-pa;
		if(a[i+pa-1]<b[j+pb-1])
			return findKth(a, i+pa, m-pa, b, j, n, k-pa);
		else
		{
			if(a[i+pa-1]>b[j+pb-1])
				return findKth(a, i, m, b, j+pb, n-pb, k-pb);
			else {
				return a[i+pa-1];
			}
		}
	}
	private static int min(int a, int b){  
        return a > b ? b : a;  
    }  
}
