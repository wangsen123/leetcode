package code;
//Maximal Rectangle My Submissions Question Solution 
//Total Accepted: 30992 Total Submissions: 140118 Difficulty: Hard
//Given a 2D binary matrix filled with 0's and 1's, find the largest rectangle containing all ones and return its area.
import java.util.Stack;

public class MaximalRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maximalRectangle(char[][] matrix) {
	    int m=matrix.length;
	    if(m==0)
	    	return 0;
	    int n=matrix[0].length;
	    if(n==0)
	    	return 0;
	    int[][] dp=new int[m][n+1];
	    for(int i=0;i<n;i++){
	    	if(matrix[0][i]=='1')
	    		dp[0][i]=1;
	    }
	    for(int j=0;j<n;++j){
	    	for(int i=1;i<m;++i){
	    		if(matrix[i][j]=='1')
	    			dp[i][j]=dp[i-1][j]+1;
	    	}
	    }
	    int maxarea=0;
	    for(int i=0;i<m;++i){
	    	int temp=largestRectangleArea(dp[i]);
	    	  if(temp > maxarea)  
	                maxarea = temp; 
	    }
	    return maxarea;
	}
	 int largestRectangleArea(int height[]) {  
	        Stack<Integer> stk=new Stack<Integer>();  
	        int i = 0;  
	        int maxArea = 0;  
	        while(i < height.length){  
	            if(stk.empty() || height[stk.peek()] <= height[i]){  
	                stk.push(i++);  
	            }else {  
	                int t = stk.peek();  
	                stk.pop();  
	                int area = height[t] * (stk.empty() ? i : i - stk.peek() - 1);  
	                maxArea = maxArea > area ? maxArea : area;  
	            }  
	        }  
	        return maxArea;  
	    }  
}
