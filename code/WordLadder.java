package code;
//Given two words (beginWord and endWord), and a dictionary's word list, find the length of shortest transformation sequence from beginWord to endWord, such that:
//
//Only one letter can be changed at a time
//Each intermediate word must exist in the word list
//For example,
//
//Given:
//beginWord = "hit"
//endWord = "cog"
//wordList = ["hot","dot","dog","lot","log"]
//As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
//return its length 5.
//
//Note:
//Return 0 if there is no such transformation sequence.
//All words have the same length.
//All words contain only lowercase alphabetic characters.
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WordLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        if(beginWord==null||endWord==null||beginWord.equals(endWord)||beginWord.length()!=endWord.length())
        	return 0;
        if(isOneWordDiff(beginWord,endWord))
        	return 2;
        Queue<String> queue=new LinkedList<String>();  
        HashMap<String,Integer> dist=new HashMap<String,Integer>();
        queue.offer(beginWord);
        dist.put(beginWord,1);
        while(!queue.isEmpty()){
        	String top=queue.poll();
        	int topDist=dist.get(top);
        	for(int i=0;i<top.length();i++){
        		for(char j='a';j<='z';j++){
        			if(top.charAt(i)==j) continue;
        			StringBuilder sb=new StringBuilder(top);
        			sb.setCharAt(i, j);
        			if(sb.toString().equals(endWord))
        				return topDist+1;
        			if(wordList.contains(sb.toString())&&!dist.containsKey(sb.toString())){
        				queue.add(sb.toString());
        				dist.put(sb.toString(),topDist+1);
        			}
        		}
        	}
        }
        return 0;
	}
	private boolean isOneWordDiff(String a, String b) {  
        int diff = 0;  
        for (int i = 0; i < a.length(); i++) {  
            if (a.charAt(i) != b.charAt(i)) {  
                diff++;  
                if (diff >= 2)  
                    return false;  
            }  
        }  
  
        return diff == 1;  
    }  
}
