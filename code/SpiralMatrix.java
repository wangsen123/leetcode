package code;

import java.awt.Dialog.ModalExclusionType;
import java.util.ArrayList;
import java.util.List;

//Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
//
//For example,
//Given the following matrix:
//
//[
// [ 1, 2, 3 ],
// [ 4, 5, 6 ],
// [ 7, 8, 9 ]
//]
//You should return [1,2,3,6,9,8,7,4,5].
public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a[][]={
				{1,2,3}
		};
		List<Integer> arrayList=spiralOrder(a);
		System.out.print(arrayList);
		

	}
	public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result=new ArrayList<Integer>();
        if(matrix.length==0){
        	return result;
        }
        int row=matrix.length;
        if(matrix[0].length==0){
        	return result;
        }
        int column=matrix[0].length;
        int times=2*(Math.min(row, column)-1)+1;
        int [][]flag=new int[row][column];
        int m=0,n=0;
       
        //行数多的话多遍历一次
        if(row>column)
        	times++;
      
        //先加到集合中在管下一个
        result.add(matrix[0][0]);
        //加到集合中要标记用过了
        flag[m][n]=1;
        for(int i=0;i<times;++i){
        	switch (i%4) {    
			case 0:
				n++;
				while(n<column&&flag[m][n]==0){
					result.add(matrix[m][n]);
					flag[m][n]=1;
					n++;
				}
				n--;
				break;
			case 1:
				m++;
				while(m<row&&flag[m][n]==0){
					result.add(matrix[m][n]);
					flag[m][n]=1;
					m++;
				}
				m--;
				break;
			case 2:
				n--;
				while(n>=0&&flag[m][n]==0){
					result.add(matrix[m][n]);
					flag[m][n]=1;
					n--;
				}
				n++;
				break;
			default:
				m--;
				while(m>=0&&flag[m][n]==0){
					result.add(matrix[m][n]);
					flag[m][n]=1;
					m--;
				}
				m++;
				break;
			}
        }
        return result;
        
    }
}
