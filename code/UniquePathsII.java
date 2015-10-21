package code;
//Unique Paths II Total Accepted: 40909 Total Submissions: 146251 My Submissions Question Solution 
//Follow up for "Unique Paths":
//
//Now consider if some obstacles are added to the grids. How many unique paths would there be?
//
//An obstacle and empty space is marked as 1 and 0 respectively in the grid.
//
//For example,
//There is one obstacle in the middle of a 3x3 grid as illustrated below.
//
//[
//  [0,0,0],
//  [0,1,0],
//  [0,0,0]
//]
//The total number of unique paths is 2.
//
//Note: m and n will be at most 100.
public class UniquePathsII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
	  if(obstacleGrid.length==0||obstacleGrid[0].length==0)
		  return 0;
	  int m=obstacleGrid.length;
	  int n=obstacleGrid[0].length;
      int[][] pathcount=new int[m][n];
      for(int i = 0; i < n; i++){
    	   if(obstacleGrid[0][i]==1)
    		   break;
           pathcount[0][i] = 1;
      }
      for(int i = 0; i < m; i++){
    	  if(obstacleGrid[i][0]==1)
   		   	   break;
          pathcount[i][0] = 1;
      }
      	 
      for(int i = 1; i < m; i++)
    	  //使用滚动数组 在这里给第一个元素的赋给第一列的初始值，需要O（m+n）的空间，不断对一行操作
      	for(int j = 1; j < n; j++){
      		//判断obstacleGrid[i][j] 
      		if(obstacleGrid[i][j]==1){
      			pathcount[i][j] = 0;
      		}else{
      			pathcount[i][j] = pathcount[i-1][j] + pathcount[i][j-1];
      		}
      	}
      	       
      return pathcount[m-1][n-1];  
	}

}
