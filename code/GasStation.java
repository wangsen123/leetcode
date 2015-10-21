package code;

public class GasStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[]{
				4
		};
		int b[]=new int[]{
				5
		};
		canCompleteCircuit(a, b);		
	}
	public static int canCompleteCircuit(int[] gas, int[] cost) {
		if(gas==null||cost==null||gas.length==0||cost.length==0)
			return -1;
		int length=gas.length;
		boolean flag=false;
		for(int i=0;i<length;){
			int sum=0;
			int j=i;
			int diff=gas[j]-cost[j];
			sum+=diff;
			if(j+1==length)
				flag=true;
			j=(j+1)%length;
			while(sum>=0&&j!=i){
				diff=gas[j]-cost[j];
				sum+=diff;
				if(j+1==length)
					flag=true;
				j=(j+1)%length;
				
			}
			if(j==i)
				//相等的时候，看看是否能达到>=0;
				return (sum>=0)?i:-1;
			if(flag)
				break;
			else
				i=j;
		}
		return -1;
	}

}
