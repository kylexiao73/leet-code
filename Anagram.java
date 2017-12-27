import java.util.*;

public class Anagram {
	public static List<List<String>> groupAnagrams(String[] strs) {
	        if(strs.length==0)return new ArrayList<List<String>>();
	        HashMap<String,List<String>> map = new HashMap<String,List<String>>();
	        for(int i=0; i<strs.length;i++){
	        	char[] alph = strs[i].toCharArray();
	        	Arrays.sort(alph);
	        	if(!map.containsKey(String.valueOf(alph))){
	        		map.put(String.valueOf(alph),new ArrayList<String>());
	        	}
	        	map.get(String.valueOf(alph)).add(strs[i]);	
	        }
	        
	        return new ArrayList<List<String>>(map.values());
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"tan","ant","tea","ate","teat"};
		System.out.println(groupAnagrams(str));
	}

}
