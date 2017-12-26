
public class ZigZag_convert {
	public static String convert(String s, int numRows) {
		if(s.length()==0 || numRows ==0) return "";
		if(numRows ==1) return s;
		char[] c = s.toCharArray();
		int len = c.length;
		
		StringBuilder[] sb = new StringBuilder[numRows];
		for(int i=0; i<numRows; i++){
			sb[i] = new StringBuilder();
		}
		int i =0;
		while(i<c.length) {
			for (int idx = 0; idx < numRows && i < len; idx++) // vertically down
	            sb[idx].append(c[i++]);
	        for (int idx = numRows-2; idx >= 1 && i < len; idx--) // obliquely up
	            sb[idx].append(c[i++]);
		}
		for(int j=0; j<sb.length;j++) {
			sb[0].append(sb[j]);
		}
		return sb[0].toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABCDEFGHI";
		System.out.println(convert(s,3));

	}

}
