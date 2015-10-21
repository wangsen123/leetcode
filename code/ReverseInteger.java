package code;

import java.awt.Dialog.ModalExclusionType;
import java.awt.image.RescaleOp;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Reverse digits of an integer.
//
//Example1: x = 123, return 321
//Example2: x = -123, return -321
public class ReverseInteger {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
          System.out.print(reverse(1534236469));
	}
public static int reverse(int x) {
//	    if(x==0)
//	    	return 0;
//	    int n=x;
//	    int m;
//	    Queue<Integer> queue=new LinkedList<Integer>();
//	    boolean flag=false;
//        if(n<0){
//        	n=Math.abs(n);
//        	flag=true;
//        }
//        while(n>0){
//        	m=n%10;
//        	queue.offer(m);
//        	n=n/10;	
//        }
//        int s=queue.size();
//        int result=queue.poll();
//        while(!queue.isEmpty()){
//        result=10*result+queue.poll();
//        }
//        if(flag)
//        	result=0-result;
//        return result;
	  int flag = x>0? 1:-1;//记录符号
      
      int m = Math.abs(x);//-2147483648是不变的
      long result = 0;//有超过了整数的值
      while (m>0)
      {
//    	  if((result*10 + m%10)>2147483647)
//    		  return 0;
//    	  else{
             result = result*10 + m%10;//分解反相加
             m/= 10;
//    	  }
      }
      if(result>2147483647)
           return 0;
      return (int) (flag * result);
  }
        
  
}
