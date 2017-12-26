import java.util.Arrays;

public class twoDArrayCaptureOX {
	public static void solve(char[][] board) {
		int row = board.length;
		int col = board[0].length;
		if(board==null || row==0 || col==0) return;
		
		
		for(int i=0; i<row;i++){
			if(board[i][0] == 'O') {
				
			}
			if(board[i][col-1]=='O') {
				
			}
		}
		for(int j=0; j<col;j++){
			if(board[0][j] == 'O') {
				
			}
			if(board[row-1][j]== 'O') {
				
			}
		}
		
		
	}
	private void dfs(int row, int col, char[][] board){
		if(row==board.length || col==board[0].length) return;
		if(board[row][col]!='O') board[row][col] = 'K';
		else{
			board[row][col]='X';
		}
		dfs(row+1,col,board);
		dfs(row,col+1,board);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = {{'X','X','O','X','X'},
						  {'X','O','O','O','X'},
						  {'X','O','O','O','X'},
						  {'X','X','X','X','X'}};
		solve(board);
		System.out.println(Arrays.deepToString(board));			
	}

}
