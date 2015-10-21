package code;
//Edit Distance Total Accepted: 41444 Total Submissions: 156328 My Submissions Question Solution 
//Given two words word1 and word2, find the minimum number of steps required to convert word1 to word2. (each operation is counted as 1 step.)
//
//You have the following 3 operations permitted on a word:
//
//a) Insert a character
//b) Delete a character
//c) Replace a character
public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}  
	public int minDistance(String word1, String word2) {
       int row=word1.length();
       int col=word2.length();
       int f[][]=new int[row+1][col+1];
       for(int i=0;i<=row;i++){
    	   f[i][0]=i;
    	   
       }
       for(int i=0;i<=col;i++){
    	   f[0][i]=i;
       }
       for (int i = 1; i <= row; i++){
           for (int j = 1; j <=col; j++){
        	   if (word1.charAt(i-1)== word2.charAt(j-1))
                   f[i][j] = f[i-1][j-1];
               else
                   f[i][j] = f[i-1][j-1] + 1;
               f[i][j] = Math.min(f[i][j], Math.min(f[i-1][j]+1, f[i][j-1]+1));
           }
    	}
		return f[row][col];
	}
//	public String[] removeMaxSubstring(String word1,String word2){
//		
//	}

}
