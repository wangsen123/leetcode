package code;
//Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
//
//If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
//
//The replacement must be in-place, do not allocate extra memory.
//
//Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
//1,2,3 → 1,3,2
//3,2,1 → 1,2,3
//1,1,5 → 1,5,1
public class NextPermutation {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	public void nextPermutation(int[] num) {
		if(num.length==0||num.length==1){
			return;
		}
		
		int i=num.length-2;
		//=要注意
		while(i>=0&&num[i]>=num[i+1])
    		i--;
		int k=num.length-1;
        if(i>=0){
        	int min=i+1;
        	for(int j=i+2;j<num.length;j++){
        		//要后面的
        		if(num[j]>num[i]&&num[min]>=num[j]){
        			min=j;
        		}
        	}
        	int temp=num[i];
        	num[i]=num[min];
        	num[min]=temp;
        	
        	for(i=i+1;i<k;i++,k--){
        		int temp1=num[k];
        		num[k]=num[i];
        		num[i]=temp1;
        	}
        	return;
        }
        //换位置
        for(i=0;i<k;i++,k--){
    		int temp1=num[k];
    		num[k]=num[i];
    		num[i]=temp1;
    	}
        return;
        
        
        	
    }

	}

