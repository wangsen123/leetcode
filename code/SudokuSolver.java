package code;
//Write a program to solve a Sudoku puzzle by filling the empty cells.
//
//Empty cells are indicated by the character '.'.
//
//You may assume that there will be only one unique solution.
public class SudokuSolver {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	public void solveSudoku(char[][] board) {
//        for(int i=0;i<9;i++)
//        	for(int j=0;j<9;j++                                                                                       ){
//        		if(board[i][j]=='.'){
//        			for(int k=1;k<=9;k++){
//        				board[i][j]=(char)('0'+k);
//        				if(IsValid(board,i,j)&&solveSudoku(board))
//        					return true;
//        				board[i][j]='.';
//        			}
//        		}
//        	}
//        return false;
		solve(board,0);
    }
	private boolean solve(char[][] board, int position) {
		// TODO 自动生成的方法存根
		if(position==81)
			return true;
		int row=position/9;
		int col=position%9;
		if(board[row][col]=='.'){
			for(int i=1;i<=9;i++){
				board[row][col]=(char)(i+'0');
				if(cheak(board,position))
					if(solve(board, position + 1))
						return  true;
				board[row][col]='.';
			}
		}
		else {
			if(solve(board,position+1))
				return true;
			
		}
		return false;
	}
	private boolean cheak(char[][] board, int position) {
		// TODO 自动生成的方法存根
		  	int row = position / 9;
	        int col = position % 9;
	        int gid;
	        if(row >= 0 && row <= 2)
	        {
	            if(col >= 0 && col <= 2)
	                gid = 0;
	            else if(col >= 3 && col <= 5)
	                gid = 1;
	            else
	                gid = 2;
	        }
	        else if(row >= 3 && row <= 5)
	        {
	            if(col >= 0 && col <= 2)
	                gid = 3;
	            else if(col >= 3 && col <= 5)
	                gid = 4;
	            else
	                gid = 5;
	        }
	        else
	        {
	            if(col >= 0 && col <= 2)
	                gid = 6;
	            else if(col >= 3 && col <= 5)
	                gid = 7;
	            else
	                gid = 8;
	        }

	        //check row, col, subgrid
	        for(int i = 0; i < 9; i ++)
	        {
	            //check row
	            if(i != col && board[row][i] == board[row][col])
	                return false;
	            
	            //check col
	            if(i != row && board[i][col] == board[row][col])
	                return false;
	            
	            //check subgrid
	            int r = gid/3*3+i/3;
	            int c = gid%3*3+i%3;
	            if((r != row || c != col) && board[r][c] == board[row][col])
	                return false;
	        }
	        return true;
	}

	
}
