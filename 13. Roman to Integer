
public class roman1 {
	public static int trans(char c) {
		if(c == 'I') return 1;
		
		if(c == 'V') return 5;
		
		if(c == 'X') return 10;
			
		if(c == 'L') return 50;
			
		if(c == 'C') return 100;
			
		if(c == 'D') return 500;
			
		if(c == 'M') return 1000;
			
		else return 0;
			
	}
	public static int roman(String s) {
		int sum = 0;
		if(s.contains("IV")) sum = sum-2;
		if(s.contains("IX")) sum = sum-2;
		if(s.contains("XL")) sum = sum-20;
		if(s.contains("XC")) sum = sum-20;
		if(s.contains("CD")) sum = sum-200;
		if(s.contains("CM")) sum = sum-200;
		
		for(int i=0; i<s.length(); i++) {
			sum = sum+ trans(s.charAt(i));
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="MCMLIV";
		String s2 = "MCMXC";
		String s3 = "MMXIV";
		System.out.println(roman(s1));
		System.out.println(roman(s2));
		System.out.println(roman(s3));
	}

}
