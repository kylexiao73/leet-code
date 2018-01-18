import java.util.*;

public class uniPathII {
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int r = obstacleGrid.length;
        int c = obstacleGrid[0].length;
        if(r==0 || c==0) return -1;
        int[][] res = new int[r][c];
        
        for(int i=0;i<r;i++){
        	
        	if(obstacleGrid[i][0]==0){
        		res[i][0] = 1;
        	}
        	else break;
        }
        for(int j=0;j<c;j++){
        	
        	if(obstacleGrid[0][j]==0){
        		res[0][j] = 1;
        	}
        	else break;
        }
        for(int i=1;i<r;i++){
        	for(int j=1;j<c;j++){
        		if(obstacleGrid[i][j]==0) {
        			res[i][j] = res[i-1][j]+res[i][j-1];
        		}
        		else{
        			res[i][j] = 0;
        		}
        	}
        }
       
        return res[r-1][c-1];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] i = {
				{0,0,1,0},
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0}
		};
		int[][] a ={
				{0}	
		};
		System.out.println(uniquePathsWithObstacles(a));

	}
}	
