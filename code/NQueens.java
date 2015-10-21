package code;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		solveNQueens(9);
//	}
//	 public static List<List<String>> solveNQueens(int n) {
//		 List<List<String>> result=new ArrayList<>();
//		 if(n<1){
//			 return result;
//		 }
//		 StringBuilder sb =new StringBuilder();
//		 for(int i=1;i<n;i++){
//			 sb.append(".");
//		 }
//		 
//		 List<String> items=new ArrayList<>();
//		 
//		 for(int i=0;i<n;i++){
//			 StringBuilder sblitter =new StringBuilder();
//			 String sbitem=sblitter.append(sb.toString().substring(0, i)).append('Q').append(sb.toString().substring(i, n-1)).toString();
//			 items.add(sbitem);
//		 }
////		 System.out.println(items);
////		 String a="fs";
////		 String b="ds";
////		 String temp=a;
////		 a=b;
////		 b=temp;
////		 System.out.println(a+" "+b);
////		 return null;
//		 dfs(result,items,0,n);
//		 System.out.println(result);
//		 return result;
//	 }
//	private static void dfs(List<List<String>> result, List<String> items, int i,int n) {
//		// TODO Auto-generated method stub
//		if(i==n){
//			result.add(items);
//			return;
//		}
//		for(int j=i;j<n;j++){
//			String temp=items.get(i);
//			items.set(i, items.get(j));
//			items.set(j,temp);
//			dfs(result, items, i+1, n);
//			temp=items.get(i);
//			items.set(i, items.get(j));
//			items.set(j,temp);
//		}
//		
//	}

	 
    public static List<List<String>>  solveNQueens(int n) {  
        List<List<String>> ret = new ArrayList<List<String>>();  
        int[] queenList = new int[n];  
        placeQueen(queenList, 0, n, ret);  
        return ret;  
    }  
       
    // 递归回溯8皇后，关键记录下到达了哪一行了  
    public static void placeQueen(int[] queenList, int row, int n, List<List<String>> ret){  
        // Base Case, 已经完成任务了  
        if(row == n){  
            StringBuilder[] sol = new StringBuilder[n];  
               
            // 对数组内每一个对象都要new出其对象  
            for(int i=0; i<n; i++){  
                sol[i] = new StringBuilder();  
                for(int j=0; j<n; j++){  
                    sol[i].append(".");  
                }  
            }  
            // 在相应的地方放置queen  
            for(int i=0; i<n; i++){  
                sol[i].setCharAt(queenList[i], 'Q');  
            }  
            List<String> ss = new ArrayList<String>();  
            for (int i=0; i<n; i++) {  
                ss.add(sol[i].toString());  
            }  
            ret.add(ss);  
            return;  
        }  
           
        // 开始这一行的查找  
        // 遍历第row行的所有列，测试哪一个位置是安全的  
        for(int col=0; col<n; col++){  
            if(isSafe(queenList, row, col)){  
                queenList[row] = col;  
                placeQueen(queenList, row+1, n, ret);  
            }  
        }  
    }  
       
    // 判断是否坐标(row,col)的位置是安全的（检查行，列，正反对角线）  
    // queenList里面存放行，列坐标pair，即queenList[row] = col  
    public static boolean isSafe(int[] queenList, int row, int col){  
        for(int preRow=0; preRow<row; preRow++){  
            int preCol = queenList[preRow];  
            if(preRow == row){      // 理论上不必检查，因为preRow是总是小于row的  
                return false;  
            }  
            if(preCol == col){          // 检查是否在同一列  
                return false;  
            }  
            if(row-preRow == col-preCol){       // 反对角线  
                return false;  
            }  
            if(preRow+preCol == row+col){       // 正对角线  
                return false;  
            }  
        }  
        return true;  
    }  
}
