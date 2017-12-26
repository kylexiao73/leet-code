import java.util.*;

public class spiral {
	public static List<Integer> spiralOrder(int[][] matrix) {
		ArrayList<Integer> res = new ArrayList<Integer>();
        if(matrix.length==0)return new ArrayList<Integer>();
        int t = 0;
        int b = matrix.length-1;
        int l = 0;
        int r = matrix[0].length-1;
        while(l<r && t<b){
        	for(int i=l;i<=r;i++){
        		res.add(matrix[t][i]);
        	}
        	for(int i=t+1;i<=b;i++){
        		res.add(matrix[i][r]);
        	}
        	for(int i=r-1; i>=l;i--){
        		res.add(matrix[b][i]);
        	}
        	for(int i=b-1;i>t;i--){
        		res.add(matrix[i][l]);
        	}
        	l++;
        	r--;
        	t++;
        	b--;	
        }
        //System.out.println("t,b,l,r: "+t+b+l+r);
        if(l==r){
    		for(int i=t;i<=b;i++){
    			res.add(matrix[i][l]);
    		}
    	}
        else if(t==b){
        	for(int i=l;i<=r;i++){
        		res.add(matrix[t][i]);
        	}
        }
        return res;
    }
	public static void main(String[] args) {
		//tblr:1211 need 5,8
		int[][] m = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12}
		};
		//tblr 2121, correct
		int[][] n={
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		//tblr 1112 need 6,7
		int[][] a={
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		//tblr 1111 need center {1,2,3}{4,5,6}{7,8,9},
		//tblr 1311 need 5,8
		int[][]d={
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int[][]b={
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12},
				{13,14,15}
		};// tblr 1010 correct
		int[][]c= {
				{1,2},
				{3,4}
		};
		System.out.println(spiralOrder(d));
		
	}
}
