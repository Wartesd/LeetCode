class Solution {
    public int countBattleships(char[][] board) {
        int ships = 0;
        for (int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if (board[i][j] == '.' || (i>0 && board[i-1][j] == 'X') || (j>0 && board[i][j-1] == 'X')) continue;

                ships++;
            }
        }

        return ships;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna