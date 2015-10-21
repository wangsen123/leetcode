package code;
//Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).
//
//You may assume that the intervals were initially sorted according to their start times.
//
//Example 1:
//Given intervals [1,3],[6,9], insert and merge [2,5] in as [1,5],[6,9].
//
//Example 2:
//Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] in as [1,2],[3,10],[12,16].
//
//This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].
import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
	public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
		List<Interval> result=new ArrayList<>();
		
		int flag=0;//����Ƿ�Ϊ��һ��Ԫ��Ӱ���Ԫ��
		int resultele=0;//��Ԫ��Ӱ��ĵ�һ��Ԫ����result������
		int i;
		for(i=0;i<intervals.size();i++){
			
			if(intervals.get(i).start>newInterval.end){
				//û��Ӱ���Ԫ��
				break;
			}
			if(intervals.get(i).end>=newInterval.start){
				if(flag==0){
					Interval cur=new Interval(Math.min(intervals.get(i).start, newInterval.start),Math.max(intervals.get(i).end, newInterval.end));
					//�õ��Ľ������������
					result.add(cur);
					flag=1;
					resultele=result.size()-1;
				}
				else{
					result.get(resultele).start=Math.min(intervals.get(i).start, result.get(resultele).start);
					result.get(resultele).end=Math.max(intervals.get(i).end, result.get(resultele).end);
				}
			}else{
				result.add(intervals.get(i));
			}
		}
		//���û��Ӱ���Ԫ��
		if(flag==0){
			result.add(newInterval);
		}
		while(i<intervals.size()){
			result.add(intervals.get(i));
			i++;
		}
		return result;
    }
}
