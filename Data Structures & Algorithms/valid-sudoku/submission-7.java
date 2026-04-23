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
        for(int square = 0; square < board.length; square++){
            Set<Character> set = new HashSet<>();
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    int col = (square % 3) * 3  + j;
                    int row = (square / 3) * 3 + i;
                    if(board[row][col] != '.'){
                        if(!set.add(board[row][col])){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
