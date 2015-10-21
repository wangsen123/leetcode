package code;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int result=0;
        
        while(i<j){
        	int area=(j-i)*(height[i]>height[j]?height[j]:height[i]);
        	result=(result>=area)?result:area;
        	if(height[i]>height[j])
        		j--;
        	else {
				i++;
			}
        }
        return result;
    }
}
