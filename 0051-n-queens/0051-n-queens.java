import java.util.*;
class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        queen(0,board,n,ans);
        return ans;
    }
    public void queen(int row,char[][] board,int n,List<List<String>> ans){
        if(row==n){
            List<String> list=new ArrayList<>();
             for (int i = 0; i < n; i++) {
                list.add(new String(board[i]));
            }
            ans.add(list);
            return;
        }
        for (int col = 0; col < n; col++) {

            if (safe(row, col, board, n)) {

                board[row][col] = 'Q';

                queen(row + 1, board, n, ans);

                board[row][col] = '.';
            }
        }
    }
    public boolean safe(int row, int col,char[][] board, int n) {
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q')
                return false;
        }
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0; i--, j--) {

            if (board[i][j] == 'Q')
                return false;
        }
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < n; i--, j++) {

            if (board[i][j] == 'Q')
                return false;
        }
        return true;
    }
}
 
