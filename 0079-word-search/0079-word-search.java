class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for (int r=0; r<rows; r++){
            for (int c=0; c<cols; c++){
                if (board[r][c] == word.charAt(0) && dfs(board, word, r, c, 0)) return true;
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, String word, int r, int c, int index){
        if (r<0 || r>=board.length || c<0 || c>=board[0].length ||  board[r][c] != word.charAt(index)) return false;

        if (index == word.length()-1) return true;

        char temp = board[r][c];
        board[r][c] = '$';

        boolean found = dfs(board, word, r+1, c, index+1) || 
                        dfs(board, word, r-1, c, index+1) ||
                        dfs(board, word, r, c+1, index+1) ||
                        dfs(board, word, r, c-1, index+1) ;

        board[r][c] = temp;

        return found;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna