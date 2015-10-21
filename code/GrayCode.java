package code;
//Gray Code My Submissions Question Solution 
//Total Accepted: 42115 Total Submissions: 126486 Difficulty: Medium
//The gray code is a binary numeral system where two successive values differ in only one bit.
//
//Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.
//
//For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:
//
//00 - 0
//01 - 1
//11 - 3
//10 - 2
//Note:
//For a given n, a gray code sequence is not uniquely defined.
//
//For example, [0,2,3,1] is also a valid gray code sequence according to the above definition.
//
//For now, the judge is able to judge based on one instance of gray code sequence. Sorry about that.
import java.util.ArrayList;
import java.util.List;

public class GrayCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<Integer> grayCode(int n) {
	    if(n==0){
	    	List<Integer> result=new ArrayList<>();
	    	result.add(0);
	    	return result;
	    }
	    List<Integer> result=new ArrayList<>(grayCode(n-1));
	    int count=result.size();
	    for(int i=count-1;i>=0;i--){
	    	result.add((int) (result.get(i)+Math.pow(2, n-1)));
	    }
	    return result;
	}
}
