
public class lcp_vertical {
	
	 public static String longestCommonPrefix(String[] strs) {
	        String lcp = "";
	        if(strs.length == 0 || strs == null) return "";
	        for(int i=0; i<strs[0].length();i++) {
	            char c = strs[0].charAt(i);
	            for(int j=1; j<strs.length; j++) {
	            	if(strs[j] == "") return "";
	                if(i ==strs[j].length() || c!=strs[j].charAt(i)) {
	                    lcp = strs[j].substring(0,i);
	                    return lcp;
	                    
	                }
	            }
	        }
	        return strs[0];
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs1 = {"abcd","abc","abac","abd","ab"};
		String[] strs2 = {"abcd","ab",""};
		System.out.println(longestCommonPrefix(strs1));
		System.out.println(longestCommonPrefix(strs2));
		
	}

}
