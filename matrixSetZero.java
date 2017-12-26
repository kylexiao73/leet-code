import java.util.Arrays;

public class matrixSetZero {
	public static void setZeroes(int[][] matrix) {
       if(matrix == null || matrix.length ==0 || matrix[0].length==0) return;
        boolean rows = false;
        boolean cols= false;
        for(int i =0;i<matrix[0].length;i++){
        	if(matrix[0][i] == 0){
        		rows = true;
        		break;
        	}
        }
        for(int i=0; i<matrix.length; i++){
        	if(matrix[i][0] == 0){
        		cols = true;
        		break;
        	}
        }
       
        for(int i=1;i<matrix[0].length;i++){
        	for(int j=1;j<matrix.length;j++){
        		if(matrix[j][i]==0) {
        			matrix[j][0] = 0;
        			matrix[0][i] = 0;
        		}
        	}
        }
        //first row:
        for(int i =1;i<matrix[0].length;i++){
        	if(matrix[0][i]==0){
        		for(int j=0; j<matrix.length;j++){
        			matrix[j][i] =0;
        		}
        	}
        }
       
        //first col
        for(int i=1; i<matrix.length;i++){
        	if(matrix[i][0]==0) {
        		for(int j=0; j<matrix[0].length; j++){
        			matrix[i][j] =0;
        		}
        	}
        }
        
        if(cols == true){
        	for(int i=0; i<matrix.length;i++){

        		matrix[i][0] =0;
        	}
        }
        
       
        if(rows == true) {
        	for(int i=0; i<matrix[0].length;i++){
        		
        		matrix[0][i] = 0;
        	}
        }
        		
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {
				{0,2,0},
				{3,2,6},
				{7,8,9}
		};
		int[][] b ={
				{1,0}
		};
		setZeroes(b);
		System.out.println("\n");
		for(int i=0; i<b.length;i++){
			System.out.println(Arrays.toString(b[i]));
		}
		
	}

}
