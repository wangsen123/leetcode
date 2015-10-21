package code;
//Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
//
//For example, 
//Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
import java.util.ArrayList;

import javax.security.auth.kerberos.KerberosKey;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}
	public int trap(int[] height) {
		if(height==null||height.length<=2)
			return 0;
		//�����Сֵ����
		int[] leftHeightValue=new int[height.length];
		int heightValue=0;
		for(int i=0;i<height.length;i++){
			if(height[i]>heightValue)
				heightValue=height[i];
			
			leftHeightValue[i]=heightValue;
		}
		//�ұ���Сֵ����
		int[] rightHeightValue=new int[height.length];
		heightValue=0;
		for(int i=height.length-1;i>=0;i--){
			if(height[i]>heightValue)
				heightValue=height[i];
			rightHeightValue[i]=heightValue;
		}
		int sum=0;
		for(int i=0;i<height.length;i++){
			sum=sum+Math.min(leftHeightValue[i], rightHeightValue[i])-height[i];
		}
		return sum;
	}

}
 