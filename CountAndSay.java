
public class CountAndSay {
	
	public static String countAndSay(int n) {
        if(n==0) return "0";
        String str = "1";
        for(int i=0;i<n-1;i++){
        	StringBuilder sb = new StringBuilder();
        	int count =0;
        	char prev = ' ';
        	for(int j=0; j<str.length();j++){
        		char curr = str.charAt(j);
        		if(curr==prev||prev==' '){
        			count++;
        		}
        		else{
        			sb = sb.append(Integer.toString(count)+prev);
        			count = 1;
        		}
        		prev = curr;
        	}
        	sb = sb.append(Integer.toString(count)+prev);
        	str = sb.toString();
        }
        return str;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countAndSay(0));
	}

}
