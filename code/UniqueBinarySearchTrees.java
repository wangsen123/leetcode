package code;
//Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
//
//For example,
//Given n = 3, there are a total of 5 unique BST's.
//
//   1         3     3      2      1
//    \       /     /      / \      \
//     3     2     1      1   3      2
//    /     /       \                 \
//   2     1         2                 3
public class UniqueBinarySearchTrees {
    public int numTrees(int n) {
       if(1==n)
    	   return 1;
       if(2==n)
    	   return 2;
       int num[]=new int[n+1];
       num[0]=1;
       num[1]=1;
       num[2]=2;
       for(int i=3;i<=n;++i){
    	   int temp=0;
    	   for(int j=0;j<i;++j)
    		   temp+=num[j]*num[i-j-1];
    	   num[i]=temp;
       }
       return num[n];
    }
}
