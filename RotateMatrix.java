import java.util.*;

public class RotateMatrix {
	public static void rotate(int[][] matrix) {
		int top = 0;
		int buttom = matrix.length-1;
		while(top<buttom){
			int[] a = matrix[top];
			matrix[top] = matrix[buttom];
			matrix[buttom] = a;
			top++;
			buttom--;
		}

		for(int i=0;i<matrix.length; i++){
			for(int j=i+1;j<matrix[i].length;j++){
				int a = matrix[j][i];
				matrix[j][i] = matrix[i][j];
				matrix[i][j] = a;
    	  }
      }
		
      
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] s = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		int[][] a = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		rotate(s);
		rotate(a);
		System.out.println(Arrays.deepToString(s));
	    	  
	      
		
	}

}
