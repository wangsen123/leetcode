package code;

public class UniquePaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int uniquePaths(int m, int n) {
//        int[][] pathcount=new int[m][n];
//        for(int i = 0; i < n; i++)
//             pathcount[0][i] = 1;
//        for(int i = 0; i < m; i++)
//        	 pathcount[i][0] = 1;
//        for(int i = 1; i < m; i++)
//        	for(int j = 1; j < n; j++)
//        	 pathcount[i][j] = pathcount[i-1][j] + pathcount[i][j-1];      
//        return pathcount[m-1][n-1];
        //使用滚动数组，节省空间：
		int[] v=new int[n]; 
      for(int i = 0; i < n; i++)
    	  	v[i] = 1;
	        for(int i=1; i<m; ++i){  
	            for(int j=1; j<n; ++j){  
	                v[j]+=v[j-1];  
	            }  
	        }  
	        return v[n-1];
    }

}
