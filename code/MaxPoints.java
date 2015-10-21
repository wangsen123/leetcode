package code;
//Given n points on a 2D plane, find the maximum number of points that lie on the same straight line.
class Point {
	     int x;
	     int y;
	     Point() { x = 0; y = 0; }
	     Point(int a, int b) { x = a; y = b; }
	  }
public class MaxPoints {
	public static void main(String[] arg){	
		Point a=new Point(1,1);
		Point b=new Point(1,1);
		Point c=new Point(2,2);
		Point d=new Point(2,2);
	    Point[] points=new Point[4];
	    points[0]=a;
	    points[1]=b;
	    points[2]=c;
	    points[3]=d;
		System.out.print(maxPoints(points));
	}
	 public static int maxPoints(Point[] points) {
		 if(points.length<=2){
			 return points.length;
		 }
		 int i,j,k;
		 int maxnumber=0;	 
	     for(i=0;i<points.length;i++){
	    	 for(j=i+1;j<points.length;j++){
	    		 int count=0;
	    		 if(points[i].x-points[j].x==0){
	    			
	    		     for(k=0;k<points.length;k++)
	    		    if(k!=i&&k!=j)
	    			 if(points[i].x-points[k].x==0)
	    				 count++;
	    		    
	    			
	    		 }
	    		 else{
	    			 for(k=0;k<points.length;k++){
	    				if(k!=i&&k!=j){
	    				 if(((points[i].x-points[k].x)*(points[i].y-points[j].y))==((points[i].x-points[j].x)*(points[i].y-points[k].y)))
	    					 count++;
	    				}
	    			
	    			 }
	    		
	    		 }
	    		 if(count>maxnumber){
	    			 maxnumber=count;
	    		 }
	   
	    	 }
	     }
	     
	     return maxnumber+2;
	  }
}
