
public class SqureRoot {
	public static int mySqrt(int x) {
		int max = (int)Math.sqrt(Integer.MAX_VALUE);
		int l = 0;
		int r = max;
		int mid =0;
		while(l+1<r){
			mid = l+(r-l)/2;
			//System.out.println(mid);
			if(x==mid*mid) return mid;
			if(x>mid*mid) l = mid;
			else r = mid;
		}
		if(r*r<=x) return r;
		else return r;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mySqrt(2147395600));
	}

}
