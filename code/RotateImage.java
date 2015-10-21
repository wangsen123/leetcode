package code;
//You are given an n x n 2D matrix representing an image.

//Rotate the image by 90 degrees (clockwise).
//
//Follow up:
//Could you do this in-place?
public class RotateImage {
	 public void rotate(int[][] matrix) {
		 int row=matrix.length;
	     if(row<=0)
	    	 return;
	     int column=matrix[0].length;
	     if(column<=0)
	    	 return;
	     int i=0;
	     int j=0;
	     int temp;
	     for(i=0;i<row;++i){
	    	 for(j=0;j<=i;++j){
	    		temp=matrix[i][j];
	    		matrix[i][j]=matrix[j][i];
	    		matrix[j][i]=temp; 
	    	 }
	     }
	     for(i=0;i<row;++i){
	    	 for(j=0;j<column/2;++j){
	    		temp=matrix[i][j];
	    		matrix[i][j]=matrix[i][column-j-1];
	    		matrix[i][column-j-1]=temp; 
	    	 }
	     }
	     
	 }
}
