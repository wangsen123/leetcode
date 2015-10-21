package code;
//Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
//
//The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
//
//
//A partially filled sudoku which is valid.
//
//Note:
//A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
public class IsValidSudoku {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		isValidSudoku(new char[][]{
				{'d'},{'h'}
		});
	}
	public static boolean isValidSudoku(char[][] board) {
		 for( int i=0; i<9; i++){
	        	boolean[] usedLine = new boolean[9];
	        	for( int j=0; j<9; j++){
	        		if(board[i][j] != '.' && usedLine[ board[i][j]-'1' ] == false)
	        			usedLine[ board[i][j]-'1' ] = true; 
	        		else if( board[i][j] != '.' && usedLine[ board[i][j]-'1'] == true )
	        			return false;
	        	}
	        }
	        for( int i=0; i<9; i++){
	        	boolean[] usedRow = new boolean[9];
	        	for( int j=0; j<9; j++){
	        		if( board[j][i] != '.' && usedRow[ board[j][i] -'1'] == false)
	        			usedRow[ board[j][i] -'1'] = true;
	        		else if( board[j][i] != '.' && usedRow[ board[j][i]-'1' ] == true)
	        			return false;
	        	}
	        }
	        
	        for( int lineStart =0; lineStart <9; lineStart += 3){
	        	for( int rowStart =0; rowStart <9; rowStart +=3){
	        		boolean[] usedSquare = new boolean[9];
	        		for( int i=lineStart; i<lineStart +3; i ++ ){
	        			for( int j= rowStart; j<rowStart +3; j ++){
	        				if( board[i][j] != '.' && usedSquare[ board[i][j] -'1'] == false)
	        					usedSquare[ board[i][j] -'1'] = true;
	        				else if(board[i][j] != '.' && usedSquare[ board[i][j] -'1'] == true )
	        					return false;
	        			}
	        		}
	        	}//lineStart
	        }//rowStart
	    	return true;
    }

}
