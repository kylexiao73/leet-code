import java.util.*;

public class wordLadder1 {
	static HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
	
	private static int getDiff(String s1, String s2){
		int d=0;
		for(int i=0; i<s1.length(); i++){
			if(s1.charAt(i)!=s2.charAt(i)) d++;
		}
		return d;
	}
	private static void buildMap(String beginWord, List<String> wordList){
		
		for(String key: wordList){
			ArrayList<String> list = new ArrayList<String>();
			map.put(key, list);
			for(String s: wordList){
				int diff = getDiff(key,s);
				if(diff==1) map.get(key).add(s);
			}
			
		}
		if(!wordList.contains(beginWord)){
			ArrayList<String> list = new ArrayList<String>();
			map.put(beginWord, list);
			for(String s: wordList){
				int diff = getDiff(s,beginWord);
				if(diff==1) map.get(beginWord).add(s);
			}
		}
       
	}
	public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(wordList==null || wordList.size()==0 
        		|| beginWord==null || beginWord.length()==0
        		|| endWord==null || endWord.length()==0) return 0;
        LinkedList<String> queue = new LinkedList<String>();
        HashSet<String> set = new HashSet<String>();
        
        buildMap(beginWord,wordList);
        
        queue.offer(beginWord);
        set.add(beginWord);
        int step=1;
        while(!queue.isEmpty()){
        	int size = queue.size();
        	for(int i=0; i<size;i++){
        		String w = queue.pop();
            	//System.out.println(w+" "+endWord);
        		if(w.equals(endWord)) return step;
        		for(String word:map.get(w)){
            		//System.out.println("queue "+queue);
            		if(!set.contains(word)){
            			queue.offer(word);
            			set.add(word);	
            		}
            	}
        		
        	}
        	step++;
        }
        return 0;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> wordList = 
				new ArrayList<String>(Arrays.asList("dot","hot","dog","lot","log","cog"));
		String beginWord = "hit";
		String endWord = "cog";
		
		System.out.println(ladderLength(beginWord, endWord,wordList));
	}

}
