class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < board.length; i++){
            Set<Integer> set = new HashSet<>();
            for(int j = 0; j < board.length; j++){
                char boardVal = board[i][j];
                if(Character.isDigit(boardVal)){
                    int boardInt = Integer.parseInt(String.valueOf(boardVal));
                    if(!set.add(boardInt)){
                        return false;
                    }
                }
            }
        }

        for(int i = 0; i < board.length; i++){
            Set<Integer> set = new HashSet<>();
            for(int j = 0; j < board.length; j++){
                char boardVal = board[j][i];
                if(Character.isDigit(boardVal)){
                    int boardInt = Integer.parseInt(String.valueOf(boardVal));
                    if(!set.add(boardInt)){
                        return false;
                    }
                }
            }
        }

        for (int square = 0; square < board.length; square++) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < board.length/3; i++) {
                for (int j = 0; j < board.length/3; j++) {
                    int row = (square / 3) * 3 + i;
                    int col = (square % 3) * 3 + j;
                    if (board[row][col] == '.') continue;
                    if (seen.contains(board[row][col])) return false;
                    seen.add(board[row][col]);
                }
            }
        }

        return true;
    }
}
