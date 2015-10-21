package code;

public class SetMatrixZeroes {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	public void setZeroes(int[][] matrix) {
        if(matrix.length==0){
        	return;
        }
        if(matrix[0].length==0)
        	return;
        int row=matrix.length;
        int column=matrix[0].length;
        int i;
        int j;
        boolean rowzero=false;
        boolean columnzero=false;
        for(i=0;i<column;++i){
        	if(matrix[0][i]==0){
        		rowzero=true;
        		break;
        	}
        }
        for(i=0;i<row;++i){
        	if(matrix[i][0]==0){
        		columnzero=true;
        		break;
        	}
        }
        for(i=1;i<row;++i)
        	for(j=1;j<column;++j){
        		if(matrix[i][j]==0){
        			matrix[0][j]=0;
        			matrix[i][0]=0;
        		}
        	}
        for(i=1;i<row;++i)
        	for(j=1;j<column;++j){
        		if(matrix[i][0]==0||matrix[0][j]==0){
        			matrix[i][j]=0;
        		}
        	}
        if(rowzero){
        	for(i=0;i<column;++i){
        		matrix[0][i]=0;
        	}
        }
        if(columnzero){
        	for(i=0;i<row;++i){
        		matrix[i][0]=0;
        	}
        }
    }
}
