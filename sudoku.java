
public class sudoku {
	public static boolean isValidSudoku(char[][] board) {
        if(board.length==0) return false;
      //column
        for(int i=0; i<9;i++){
        	boolean[] taken = new boolean[9];
        	for(int j=0; j<9;j++){
        		char n = board[i][j];
        		if(n!='.'){
        			int num = n -'1';
        			if(taken[num]== true) return false;
            		else taken[num] = true;
        		}
        	}
        }
        //row
        for(int i=0; i<9;i++){
        	boolean[] taken = new boolean[9];
        	for(int j=0; j<9;j++){
        		char n = board[j][i];
        		if(n!='.'){
        			int num = n-'1';
        			if(taken[num]==true) return false;
        			else taken[num] = true;
        		}
        	}
        }
        //box
        for(int box =0; box<9; box++){
        	boolean[] taken = new boolean[9];
        	for(int r=0; r<3; r++){
        		for(int c=0; c<3;c++){
        			char n = board[r+3*(box/3)][c+3*(box%3)];
        			if(n!= '.'){
        				int num= n-'1';
        				if(taken[num]==true) return false;
        				else taken[num] = true;
        			}
        		}
        	}
        }
        return true;
        
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] s = {
				{'.','8','7','6','5','4','3','2','1'},
				{'2','1','.','.','.','.','.','.','.'},
				{'3','.','.','.','.','.','.','.','.'},
				{'4','.','.','.','.','.','.','.','.'},
				{'5','.','.','.','.','.','.','.','.'},
				{'6','.','.','.','.','.','.','.','.'},
				{'7','.','.','.','.','.','.','.','.'},
				{'8','.','.','.','.','.','.','.','.'},
				{'9','.','.','.','.','.','.','.','.'}
		};
		boolean b = isValidSudoku(s);
		System.out.println("b: "+b);
			
		}

}
