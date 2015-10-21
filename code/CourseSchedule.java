package code;

import java.util.Stack;

public class CourseSchedule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean canFinish(int numCourses, int[][] prerequisites) {
	   
	    int [] indegree=new int[numCourses];
	    int [][] matrix=new int[numCourses][numCourses];
	    Stack<Integer> stack=new Stack<>();
	    //初始化邻接表 
	    for(int i=0;i<prerequisites.length;i++){
	    	if(matrix[prerequisites[i][1]][prerequisites[i][0]]==1)
	    		continue;
	    	indegree[prerequisites[i][0]]++;
	    	matrix[prerequisites[i][1]][prerequisites[i][0]]=1;
	    }
	    //入度为0的点进栈
	    for(int i=0;i<numCourses;i++){
	    	if(indegree[i]==0)
	    		stack.push(i);
	    }
	    //拓扑排序
	    while(!stack.isEmpty()){
	    	int cur=stack.pop();
	    	for(int j=0;j<numCourses;j++){
	    		if(matrix[cur][j]==1){
	    			indegree[j]--;
	    			matrix[cur][j]=0;
	    			if(indegree[j]==0)
		    			stack.push(j);
	    		}
	    		
	    	}
	    }
	   // 
	    for(int i=0;i<numCourses;i++){
	    	if(indegree[i]>0){
	    		return false;
	    	}
	    } 
	    return true;
	}
}
