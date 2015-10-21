package code;
//Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
//
//For example,
//Given n = 3,
//
//You should return the following matrix:
//[
// [ 1, 2, 3 ],
// [ 8, 9, 4 ],
// [ 7, 6, 5 ]
//]
public class SpiralMatrixTwo {
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		int a[][]=new int[0][0]; 可以的
		
//		int a[][]=new int[1][1];
//		a[0][0]=1;
//		System.out.print(a); [[I@7852e922
		generateMatrix(2);
		
	}
	public static int[][] generateMatrix(int n) {
		if(n<0)
			return null;
        int [][]result=new int[n][n];
        int k=1;
        int a=0;
        int b=-1;//第一个会马上加到0的
        int j;
        int times=2*(n-1)+1;
        
        for(int i=0;i<times;++i){
        		switch (i%4) {
				case 0:
					++b;
					j=n-(i+1)/2;//计算马上要走的个数
		        	for(int m=0;m<j;++m){
		        		result[a][b]=k;
		        		++k;
		        		++b;
		        	}	
		        	--b;//要回退
					break;
				case 1:
					j=n-(i+1)/2;
					++a;
		        	for(int m=0;m<j;++m){
		        		result[a][b]=k;
		        		++k;
		        		++a;
		        	}	
		        	--a;
					break;
				case 2:
					j=n-(i+1)/2;
					--b;
		        	for(int m=0;m<j;++m){
		        		result[a][b]=k;
		        		++k;
		        		--b;
		        	}	
		        	++b;
					break;
				default:
					j=n-(i+1)/2;
					--a;
		        	for(int m=0;m<j;++m){
		        		result[a][b]=k;
		        		++k;
		        		--a;
		        	}	
		        	++a;
					break;
				}
        	
        }
        return result;
        
    }
}
