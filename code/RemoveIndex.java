package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveIndex {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s = null;
		try {
			s = new Scanner(new File("F:\\文档\\本科毕业设计\\matlab代码\\结果数据\\removed_features.txt"));
		} catch (FileNotFoundException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		
//		System.out.println("输入你要输入的数字  0结束");
		ArrayList<Integer> a =new ArrayList();
		
		while(s.hasNext()){
			a.add(s.nextInt());
			
		}
		ArrayList<Integer> b =new ArrayList();
		b.add(0);
		for(int i=1;i<=64;i++){
			b.add(i);
		}
		for(int i=0;i<a.size();i++){
			int c=b.get(a.get(i));
			System.out.print(c+" ");
			//(int) 非常重要，调用的是remove(i),否则调用的是remove(Element)
			b.remove((int)a.get(i));
			
		}
		
	}

}
