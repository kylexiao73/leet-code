import java.util.*;

public class plusOneOnArray {
	 public static int[] plusOne(int[] digits) {
		 if(digits.length==0) return new int[0];
		 for(int i=digits.length-1; i>=0;i--){
			 if(digits[i]!=9){
				 digits[i]++;
				 return digits;
			 }
			 else digits[i]=0;
		 }
		 int[] ans = new int[digits.length+1];
		 if(digits[0]==0){
			 
			 ans[0]=1;
			 return ans;
		 }
		 return ans;
	 }
	 public static void main(String[] args) {
		 int[] a={9,9,9};
		 System.out.println(Arrays.toString(plusOne(a)));
	 }
}
