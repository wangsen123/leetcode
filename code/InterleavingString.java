package code;
//Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and s2.
//
//For example,
//Given:
//s1 = "aabcc",
//s2 = "dbbca",
//
//When s3 = "aadbbcbcac", return true.
//When s3 = "aadbbbaccc", return false.
public class InterleavingString {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
				
	}
	public boolean isInterleave(String s1, String s2, String s3) {
        int len1=s1.length();
        int len2=s2.length();
        int len3=s3.length();
        if((len1+len2)!=len3)
        	return false;
        boolean[][] canInterleave=new boolean[len1+1][len2+1];
        canInterleave[0][0]=true;
        for(int i=1;i<=len1;++i){
        	canInterleave[i][0]=canInterleave[i-1][0]&&(s1.charAt(i-1)==s3.charAt(i-1));
        }
        for(int i=1;i<=len2;++i){
        	canInterleave[0][i]=canInterleave[0][i-1]&&(s2.charAt(i-1)==s3.charAt(i-1));
        }
        for(int i=1;i<=len1;++i)
        	 for(int j=1;j<=len2;++j){
        		 canInterleave[i][j]=(canInterleave[i-1][j]&& (s1.charAt(i-1)==s3.charAt(i+j-1)))||(canInterleave[i][j-1]&&(s2.charAt(j-1)==s3.charAt(i+j-1)));
        	 }
        return canInterleave[len1][len2];
    }
}
