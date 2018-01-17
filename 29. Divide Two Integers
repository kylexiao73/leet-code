
public class divide {
	public static int divide(int dividend, int divisor) {
        if(divisor == 0) return Integer.MAX_VALUE;
        if(dividend == Integer.MIN_VALUE) {
        	if(divisor == -1) return Integer.MAX_VALUE;
        	if(divisor == 1) return Integer.MIN_VALUE;
        }
        long dd = (long)dividend;
		long dr = (long)divisor;
		
		int sign = 1;
		if(dd<0){
			dd = -dd;
			sign = -sign;
		}
		if(dr<0){
			dr = -dr;
			sign = -sign;
		}
		int res =0;
		while(dd>=dr) {
			int shift = 0;
			long temp=0;
			while(temp <= dd) {
				shift++;
				temp = dr<<shift;
				//System.out.println("temp: "+temp);
			}
			res = res+(1<<(--shift));
			dd -= dr<<shift;
			//System.out.println("dd: "+dd);
		}
		return res*sign;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divide(-2147483648,-1));

	}

}
