package code;
//Say you have an array for which the ith element is the price of a given stock on day i.
//
//Design an algorithm to find the maximum profit. You may complete at most two transactions.
public class BestTimetoBuyandSellStockIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxProfit(int[] prices) {
	      if(prices.length==0){  
	    	  return 0;
	      }
	      int n=prices.length;
	      int[] opt1=new int[n];
	      opt1[0]=0;
	      int low=prices[0];
	      int curVal=0;
	      for(int i=1;i<n;i++){
	    	  if(prices[i]<low) 
	    		  low=prices[i];
	    	  else if(prices[i]-low>curVal)
	    		  curVal=prices[i]-low;
	    	  opt1[i] = curVal;
	    		  
	      }
	      int opt2[] = new int[n];
	      opt2[n-1]=0;
	      int high=prices[n-1];
	      curVal=0;
	      for(int i=n-2;i>=0;i--){
	    	  if(prices[i]>high)
	    		  high=prices[i];
	    	  else{
	    		  if(high-prices[i]>curVal)
	    			  curVal=high-prices[i];
	    		  
	    	  }
	    	  opt2[i]=curVal;
	      }
	      int result=0;
	      for(int i=0;i<n;i++){
	    	  int temp=opt1[i]+opt2[i];
	    	  if(temp>result)
	    		  result=temp;
	      }
	      return result;
	}
}
