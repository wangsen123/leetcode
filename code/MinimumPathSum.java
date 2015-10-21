package code;
//Minimum Path Sum Total Accepted: 44225 Total Submissions: 136918 My Submissions Question Solution 
//Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.
//
//Note: You can only move either down or right at any point in time.
public class MinimumPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//�ݹ��ֳ�ʱ��
//	public int minPathSum(int[][] grid) {
//		if(grid==null||grid.length==0||grid[0].length==0)
//			return 0;
//		return findMinValue(grid,0,0);
//	}
//	private int findMinValue(int[][] grid, int i, int j) {
//		// TODO Auto-generated method stub
//		if(i==grid.length-1&&j==grid[0].length-1)
//			return grid[i][j];
//		int down=Integer.MAX_VALUE;
//		int right=Integer.MAX_VALUE;
//		//����������
//		if(i<grid.length-1)
//			down=grid[i][j]+findMinValue(grid,i+1,j);
//     //�ұߵ�
//		if(j<grid[0].length-1)
//			right=grid[i][j]+findMinValue(grid,i,j+1);
//		return Math.min(down, right);
//	}
	public int minPathSum(int[][] grid) {
		//�ѽ�������浽�����о��У���ʡʱ��
		if(grid==null||grid.length==0||grid[0].length==0)
			return 0;
		int m=grid.length;
		int n=grid[0].length;
		int sum[][]=new int[m][n];
		sum[m-1][n-1]=grid[m-1][n-1];
		//����-д��+
		for(int i=m-2;i>=0;i--){
			sum[i][n-1]=sum[i+1][n-1]+grid[i][n-1];
		}
		for(int j=n-2;j>=0;j--){
			sum[m-1][j]=sum[m-1][j+1]+grid[m-1][j];
		}
		for(int i=m-2;i>=0;i--)
			for(int j=n-2;j>=0;j--){
				sum[i][j]=Math.min(sum[i+1][j],sum[i][j+1])+grid[i][j];
			}
		return sum[0][0];
	}
}
