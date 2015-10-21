package code;

import java.util.ArrayList;
import java.util.Iterator;

//Given a 2D board and a word, find if the word exists in the grid.
//
//The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
//
//For example,
//Given board =
//
//[
//  ["ABCE"],
//  ["SFCS"],
//  ["ADEE"]
//]
//word = "ABCCED", -> returns true,
//word = "SEE", -> returns true,
//word = "ABCB", -> returns false.
public class WordSearch {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		char[][] a=new char[][]{
				 {'A','B','C','E'},
				 {'S','F','E','S'},
				 {'A','D','E','E'}
		};
		String string="ABCESEEEFS";
		System.out.print(exist(a,string));
	}
	 public static boolean exist(char[][] board, String word) {
	    	if(word==null||word.length()==0){
	    		return true;
	    	}
	    	
	    	int wordlength=word.length();
//	    	
//	    	boolean dp[]=new boolean[wordlength+1];
//	    	dp[0]=true;
//	    	for (int i = 1; i <=wordlength; i++) {
//				if(dp[i-1]){
//					
//				}
//				
//			}
//			return dp[wordlength];
	    	boolean bool=false;
	    	
	    	
	    	for (int j = 0; j < board.length; j++) 
				for(int k=0;k<board[0].length;k++){
					if(board[j][k]==word.charAt(0)){
						boolean[][] b=new boolean[board.length][board[0].length];
						b[j][k]=true;	
						bool=bool||search(1, b,j,k,word,board);
					}
				}

			return bool;
	    	
	    
	    }
	    public static boolean search(int i,boolean[][] b,int j,int k,String word,char[][] board){
	    	if(i<word.length()){
	    		 
	    	     if(j<board.length-1&&board[j+1][k]==word.charAt(i)&&b[j+1][k]==false){
	    	    	 b[j+1][k]=true;
	    	    	 if(search(i+1, b, j+1, k, word, board))
	    	    	     return true;
	    	    	 b[j+1][k]=false;
 
	    	     }
	    	     if(k<board[0].length-1&&board[j][k+1]==word.charAt(i)&&b[j][k+1]==false){
	    	    	 b[j][k+1]=true;
	    	    	 if(search(i+1, b, j, k+1, word, board))
	    	    		 return true;
	    	    	 b[j][k+1]=false;
	    	     }	
	    	     if(j>=1&&board[j-1][k]==word.charAt(i)&&b[j-1][k]==false){
	    	    	 b[j-1][k]=true;
	    	    	 if(search(i+1, b, j-1, k, word, board))
	    	    		 return true;
	    	    	 b[j-1][k]=false;
	    	     }
	    	     if(k>=1&&board[j][k-1]==word.charAt(i)&&b[j][k-1]==false){
	    	    	 b[j][k-1]=true;
	    	    	 if(search(i+1, b, j, k-1, word, board))
	    	    		 return true;
	    	    	 b[j][k-1]=false;
	    	     }
	    	     return false;
	    	}
			return true;
	    	
	    }
}
