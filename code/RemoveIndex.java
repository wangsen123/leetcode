package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveIndex {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner s = null;
		try {
			s = new Scanner(new File("F:\\�ĵ�\\���Ʊ�ҵ���\\matlab����\\�������\\removed_features.txt"));
		} catch (FileNotFoundException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		}
		
//		System.out.println("������Ҫ���������  0����");
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
			//(int) �ǳ���Ҫ�����õ���remove(i),������õ���remove(Element)
			b.remove((int)a.get(i));
			
		}
		
	}

}
