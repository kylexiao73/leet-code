
public class DecodeWays {
	public static  int numDecodings(String s) {
        if(s.length()==0) return 0;
        if(s.charAt(0)=='0') return 0;
        int curr = 1;
        int prev = 1;
        for(int i=1; i<s.length(); i++){
        	int temp = curr;
        	if(s.charAt(i)=='0'){
        		curr = prev;
        		if(s.charAt(i-1)>='3' || s.charAt(i-1)<='0') return 0;
        	}
        	else{
        		if(s.charAt(i-1)!='0' && Integer.valueOf(s.substring(i-1, i+1))<=26 ) {
        			curr = curr+prev;
        		}
        	}
        	prev = temp;
        }
        return curr;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "110";
		System.out.println(numDecodings(s));
	}

}
