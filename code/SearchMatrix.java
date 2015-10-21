package code;
//Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
//
//Integers in each row are sorted from left to right.
//The first integer of each row is greater than the last integer of the previous row.
//For example,
//
//Consider the following matrix:
//
//[
//  [1,   3,  5,  7],
//  [10, 11, 16, 20],
//  [23, 30, 34, 50]
//]
//Given target = 3, return true.
public class SearchMatrix {
	public static void main(String []args){
		
	}
	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix.length==0)
			return false;
		int row=matrix.length;
		int column=matrix[0].length;
		if(column==0)
			return false;
        boolean result=false;
        for(int i=0;i<row&&matrix[i][0]<=target;++i){
        	for (int j = 0; j <column&&matrix[i][j]<=target ; j++) {
				if(matrix[i][j]==target)
					return true;
				
			}
        }
        return false;
    }
}
