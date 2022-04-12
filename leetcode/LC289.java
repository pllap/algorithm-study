import java.util.Arrays;

public class LC289 {

    private static final int LIVE = 1;
    private static final int DEAD = 0;
    private int numRow;
    private int numCol;

    public void gameOfLife(int[][] board) {
        // return the next state of the board

        // live cell
        //   1: die
        //   2,3: live
        //   4~: die
        // dead cell
        //   3: become a live cell
        numRow = board.length;
        numCol = board[0].length;
        int[][] newBoard = new int[numRow][numCol];

        for (int r = 0; r < numRow; ++r) {
            for (int c = 0; c < numCol; ++c) {
                nextState(board, newBoard, r, c);
            }
        }

        for (int r = 0; r < numRow; ++r) {
            for (int c = 0; c < numCol; ++c) {
                board[r][c] = newBoard[r][c];
            }
        }
    }

    private void nextState(int[][] board, int[][] newBoard, int curRow, int curCol) {
        int currentCellState = board[curRow][curCol];
        int liveCellCount = currentCellState == DEAD ? 0 : -1;
        for (int r = -1; r < 2; ++r) {
            for (int c = -1; c < 2; ++c) {
                int neighborRow = curRow + r;
                int neighborCol = curCol + c;
                if (neighborRow >= 0 && neighborRow < numRow && neighborCol >= 0 && neighborCol < numCol &&
                        board[neighborRow][neighborCol] == LIVE
                ) {
                    ++liveCellCount;
                }
            }
        }

        if (currentCellState == LIVE && (liveCellCount < 2 || liveCellCount > 3)) {
            newBoard[curRow][curCol] = DEAD;
            return;
        }
        if (currentCellState == DEAD && liveCellCount == 3) {
            newBoard[curRow][curCol] = LIVE;
            return;
        }
        newBoard[curRow][curCol] = board[curRow][curCol];
    }

    public static void main(String[] args) {
        int[][] board;

        board = new int[][]{{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        new LC289().gameOfLife(board);
        System.out.println(Arrays.deepToString(board));

        board = new int[][]{{1,1},{1,0}};
        new LC289().gameOfLife(board);
        System.out.println(Arrays.deepToString(board));
    }
}
