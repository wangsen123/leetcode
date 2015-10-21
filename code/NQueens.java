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
       
    // �ݹ����8�ʺ󣬹ؼ���¼�µ�������һ����  
    public static void placeQueen(int[] queenList, int row, int n, List<List<String>> ret){  
        // Base Case, �Ѿ����������  
        if(row == n){  
            StringBuilder[] sol = new StringBuilder[n];  
               
            // ��������ÿһ������Ҫnew�������  
            for(int i=0; i<n; i++){  
                sol[i] = new StringBuilder();  
                for(int j=0; j<n; j++){  
                    sol[i].append(".");  
                }  
            }  
            // ����Ӧ�ĵط�����queen  
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
           
        // ��ʼ��һ�еĲ���  
        // ������row�е������У�������һ��λ���ǰ�ȫ��  
        for(int col=0; col<n; col++){  
            if(isSafe(queenList, row, col)){  
                queenList[row] = col;  
                placeQueen(queenList, row+1, n, ret);  
            }  
        }  
    }  
       
    // �ж��Ƿ�����(row,col)��λ���ǰ�ȫ�ģ�����У��У������Խ��ߣ�  
    // queenList�������У�������pair����queenList[row] = col  
    public static boolean isSafe(int[] queenList, int row, int col){  
        for(int preRow=0; preRow<row; preRow++){  
            int preCol = queenList[preRow];  
            if(preRow == row){      // �����ϲ��ؼ�飬��ΪpreRow������С��row��  
                return false;  
            }  
            if(preCol == col){          // ����Ƿ���ͬһ��  
                return false;  
            }  
            if(row-preRow == col-preCol){       // ���Խ���  
                return false;  
            }  
            if(preRow+preCol == row+col){       // ���Խ���  
                return false;  
            }  
        }  
        return true;  
    }  
}
