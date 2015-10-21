package code;
//Combinations Total Accepted: 36487 Total Submissions: 119636 My Submissions Question Solution 
//Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
//
//For example,
//If n = 4 and k = 2, a solution is:
//
//[
//  [2,4],
//  [3,4],
//  [2,3],
//  [1,2],
//  [1,3],
//  [1,4],
//]
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Combinations {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List<Integer> a=new ArrayList();
		List<Integer> b=new ArrayList();
		a.add(3);
		a.add(5);
		//浅复制
		b=(List<Integer>) ((ArrayList)a).clone();
		a.add(9);
		System.out.print(b);
		//[3, 5]

	}
	 public List<List<Integer>> combine(int n, int k) {
		 List<List<Integer>> result=new ArrayList();
		 if(n<=0&&k<=0&&k>n)
			 return Collections.emptyList();
		 for(int e=1;e<=n;e++){
			 List<Integer> element=new ArrayList();
			 element.add(e);
			 recurTraverse(n,k-1,e+1,result,element);
			 
		 }
		 return result;
	 }
	private void recurTraverse(int n, int i, int j, List<List<Integer>> result, List<Integer> element) {
		// TODO 自动生成的方法存根
		
		if(0==i){
			result.add(element);
			return;
		}
		if(j>n)
			return;
		List<Integer> temp=new ArrayList(element);
		recurTraverse(n, i, j+1, result, element);
		
		temp.add(j);
		recurTraverse(n,i-1,j+1,result,temp);
		
			
	}
}
