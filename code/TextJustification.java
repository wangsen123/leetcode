package code;
//Text Justification Total Accepted: 22323 Total Submissions: 152223 My Submissions Question Solution 
//Given an array of words and a length L, format the text such that each line has exactly L characters and is fully (left and right) justified.
//
//You should pack your words in a greedy approach; that is, pack as many words as you can in each line. Pad extra spaces ' ' when necessary so that each line has exactly L characters.
//
//Extra spaces between words should be distributed as evenly as possible. If the number of spaces on a line do not divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right.
//
//For the last line of text, it should be left justified and no extra space is inserted between words.
//
//For example,
//words: ["This", "is", "an", "example", "of", "text", "justification."]
//L: 16.
//
//Return the formatted lines as:
//[
//   "This    is    an",
//   "example  of text",
//   "justification.  "
//]
//Note: Each word is guaranteed not to exceed L in length.
import java.util.ArrayList;
import java.util.List;

public class TextJustification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a=new String[]{
				"a","b","c","d","e"	
		};
		
		fullJustify(a,1);
	}
	public static List<String> fullJustify(String[] words, int maxWidth) {
		List<String> result=new ArrayList<>();
		//记录当前单词占的行数
		int numberCount=0;
		//存放当前的单词元素
		List<String> temp=new ArrayList<>();
		for(int i=0;i<words.length;i++){
			if(temp.size()==0){
				temp.add(words[i]);
				numberCount=numberCount+words[i].length();
			}else{
				//个数加1
				if(numberCount+1+words[i].length()<=maxWidth){
					temp.add(" "+words[i]);
					numberCount=numberCount+words[i].length()+1;
				}else {
					StringBuilder eleString=new StringBuilder();
					int perblankNum=0;
					int surplusNum=0;
					//注意size>1 括号注意加    if for 就一句也要注意加
					if(temp.size()>1){
						perblankNum=(maxWidth-numberCount)/(temp.size()-1);
						surplusNum=(maxWidth-numberCount)%(temp.size()-1);
					}
					eleString.append(temp.get(0));
					if (temp.size()==1) {
						while(eleString.length()!=maxWidth)
						eleString.append(" ");
					}
					for(int j=1;j<temp.size();j++){
						if(j<=surplusNum){
							for(int k=0;k<=perblankNum;k++)
								eleString.append(" ");
							eleString.append(temp.get(j));
						}else{
							for(int k=0;k<perblankNum;k++)
								eleString.append(" ");
							eleString.append(temp.get(j));
						}
					}
					result.add(eleString.toString());
					//移除所有
					temp.removeAll(temp);
					numberCount=0;
					i--;
				}
			}
		}
		//记得处理完了最后一行 最后一行直接加
		StringBuilder eleString=new StringBuilder();
		
		for(int j=0;j<temp.size();j++){
			eleString.append(temp.get(j));
		}
		while(eleString.length()!=maxWidth)
			eleString.append(" ");
		result.add(eleString.toString());
		return result;
    }
	
//	public static List<String> fullJustify(String[] words, int maxWidth) {
//		List<String> result=new ArrayList<>();
//		//记录当前单词占的行数
//		int numberCount=0;
//		//存放当前的单词元素
//		List<String> temp=new ArrayList<>();
//		for(int i=0;i<words.length;i++){
//			if(temp.size()==0){
//				temp.add(words[i]);
//				numberCount=numberCount+words[i].length();
//			}else{
//				//个数加1
//				if(numberCount+1+words[i].length()<=maxWidth){
//					temp.add(" "+words[i]);
//					numberCount=numberCount+words[i].length()+1;
//				}else {
//					StringBuilder eleString=new StringBuilder();
//					int perblankNum=0;
//					int surplusNum=0;
//					//注意size>1 括号注意加    if for 就一句也要注意加
//					if(temp.size()>2){
//						perblankNum=(maxWidth-numberCount)/(temp.size()-1);
//						surplusNum=(maxWidth-numberCount)%(temp.size()-1);
//					}
//					eleString.append(temp.get(0));
//					if(temp.size()>=2){
//						eleString.append(temp.get(1));
//					}
//					if (temp.size()<=2) {
//						while(eleString.length()!=maxWidth)
//						eleString.append(" ");
//					}
//					for(int j=2;j<temp.size();j++){
//						if(j<=surplusNum){
//							for(int k=0;k<=perblankNum;k++)
//								eleString.append(" ");
//							eleString.append(temp.get(j));
//						}else{
//							for(int k=0;k<perblankNum;k++)
//								eleString.append(" ");
//							eleString.append(temp.get(j));
//						}
//					}
//					result.add(eleString.toString());
//					//移除所有
//					temp.removeAll(temp);
//					numberCount=0;
//					i--;
//				}
//			}
//		}
//		//记得处理完了最后一行
//		StringBuilder eleString=new StringBuilder();
//		int perblankNum=0;
//		int surplusNum=0;
//		//注意size==1 括号注意加 if for 就一句也要注意加
//		if(temp.size()>2){
//			perblankNum=(maxWidth-numberCount)/(temp.size()-1);
//			surplusNum=(maxWidth-numberCount)%(temp.size()-1);
//		}
//		eleString.append(temp.get(0));
//		if(temp.size()>=2){
//			eleString.append(temp.get(1));
//		}
//		if (temp.size()<=2) {
//			while(eleString.length()!=maxWidth)
//			eleString.append(" ");
//		}
//		for(int j=2;j<temp.size();j++){
//			if(j<=surplusNum){
//				for(int k=0;k<=perblankNum;k++)
//					eleString.append(" ");
//				eleString.append(temp.get(j));
//			}else{
//				for(int k=0;k<perblankNum;k++)
//					eleString.append(" ");
//				eleString.append(temp.get(j));
//			}
//		}
//		result.add(eleString.toString());
//		return result;
//    }
}
