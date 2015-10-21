package code;
//Merge Intervals Total Accepted: 40697 Total Submissions: 181352 My Submissions Question Solution 
//Given a collection of intervals, merge all overlapping intervals.
//
//For example,
//Given [1,3],[2,6],[8,10],[15,18],
//return [1,6],[8,10],[15,18].
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Currency;
import java.util.List;
import java.util.Stack;

class Interval {
	      int start;
	      int end;
	      Interval() { start = 0; end = 0; }
	      Interval(int s, int e) { start = s; end = e; }
	  }
public class MergeIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("unchecked")
	public List<Interval> merge(List<Interval> intervals) {
	   if(intervals==null||intervals.size()<=1)
		   return intervals;
	   
	   Collections.sort(intervals,new Comparator() {
		      @Override
		      public int compare(Object o1, Object o2) {
		        return ((Interval)o1).start-((Interval)o2).start;
		      }
		    });
	   Stack<Interval> stack=new Stack<>();
	   stack.add(intervals.get(0));
	   for(int i=1;i<intervals.size();i++){
		   Interval cur=stack.pop();
		   if(intervals.get(i).start>cur.end){
			   stack.push(cur);
			   stack.push(intervals.get(i));
		   }else{
			   cur.end=Math.max(cur.end, intervals.get(i).end);
			   stack.push(cur);
		   }
	   }
	   List<Interval> result=new ArrayList<>();
	   while(!stack.isEmpty()){
		   result.add(stack.pop());
	   }
	   return result;
	}
}
