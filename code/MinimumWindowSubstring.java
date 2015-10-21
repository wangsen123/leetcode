package code;

//Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).
//
//For example,
//S = "ADOBECODEBANC"
//T = "ABC"
//Minimum window is "BANC".
//
//Note:
//If there is no such window in S that covers all characters in T, return the emtpy string "".
//
//If there are multiple such windows, you are guaranteed that there will always be only one unique minimum window in S.
public class MinimumWindowSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//˫ָ�뷨
	public String minWindow(String s, String t) {
		//�մ����ؿ�
		if (t.length() == 0 || s.length() == 0) {
			return "";
		}
		int[] count1 = new int[256];
		int[] count2 = new int[256];
		//count1��¼��ǰ������ ��ЩԪ��û���� count2��¼�ܵ�Ҫ���ʵ�Ԫ��
		for (int i = 0; i < t.length(); i++) {
			count1[t.charAt(i)]++;
			count2[t.charAt(i)]++;

		}
		int count = t.length();
		int start = 0;
		int minSize = Integer.MAX_VALUE;
		int minStart=0;
		for (int end = 0; end < s.length(); end++) {
			//ֻ��Ҫ���ʵ�Ԫ��
			if (count2[s.charAt(end)] > 0) {
				count1[s.charAt(end)]--;
				//ֻ��ȷʵ��Ҫ�������������һ
				if (count1[s.charAt(end)] >= 0)
					count--;
			}
			//������Ҫ�����
			if (count == 0) {
				while (true) {
					//����Ҫ���ʵĺ͹������ʵ�ȥ��
					if (count2[s.charAt(start)] > 0) {
						if (count1[s.charAt(start)] < 0)
							count1[s.charAt(start)]++;
						else
							break;
					}
					start++;
				}

				if (minSize > end - start + 1) {
					minSize = end - start + 1;
					minStart = start;
				}
			}
		}
		//û�з��ʵ�
		 if (minSize == Integer.MAX_VALUE)
			  return "";
		 //���ʵ���
		 String result=s.substring(minStart,minStart+minSize);
		 return result;  
	}

}
