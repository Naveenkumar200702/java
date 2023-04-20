package leetcode;

public class Battleships419 {
	 public void check(int i,int j,char[][] board)
	    {
	        if(i>=board.length||i<0||j>=board[i].length||j<0||board[i][j]=='.')
	        {
	            return;
	        }
	        board[i][j]='.';
	        check(i,j+1,board);
	        check(i+1,j,board);
	    }
	    public int countBattleships(char[][] board) {
	       int count=0;
	       for(int i=0;i<board.length;i++)
	       {
	           for(int j=0;j<board[i].length;j++)
	           {
	               if(board[i][j]=='X')
	               {
	                   count++;
	                   check(i,j+1,board);
	                   check(i+1,j,board);
	               }           
	           }
	       }
	        return count;
	    }
}
