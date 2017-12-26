
public class wordSearch {
	 public static boolean exist(char[][] board, String word) {
	        if(board.length==0 || board[0].length==0 || word.length()==0) return false;
	        
	        boolean[][] b = new boolean[board.length][board[0].length];
	        for(int i=0; i<board.length;i++){
	        	for(int j=0; j<board[0].length;j++){
	        		if(helper(board,word.toCharArray(),b,i,j,0)) return true;
	        		
	        	}
	        	
	        }
	        return false;
	    }
	 private static boolean helper(char[][] board,char[] word,boolean[][] b,int r, int c, int curr) {
		 if(curr==word.length) return true;
		 if(r<0 || c<0 || r>=board.length || c>=board[0].length) return false;
		 if(b[r][c]==true || word[curr]!=board[r][c]) return false;
		 b[r][c] = true;
		 //up
		 boolean exist = helper(board,word,b,r-1,c,curr+1);
		 if(exist) return true; 
		 //down
		 exist = helper(board,word,b,r+1,c,curr+1);
		 if(exist) return true; 
		 //left
		 exist = helper(board,word,b,r,c-1,curr+1);
		 if(exist) return true; 
		 //right
		 exist = helper(board,word,b,r,c+1,curr+1);
		 if(exist) return true; 
		 b[r][c] = false;
		 return false;
				 
				 
	 	}
		 	
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = {
				{'A','B','C','E'},
				{'S','F','C','S'},
				{'A','D','E','E'}
		};
		String word = "ABCCED";
		System.out.println(exist(board,word));
	}

}
