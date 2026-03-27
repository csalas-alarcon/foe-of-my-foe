package babysteps;

import java.util.LinkedList;
import java.util.Queue;

public class TicTacToe {

    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    record Position(int x, int y) {}

    static Queue<Position> tailX = new LinkedList<>();
    static Queue<Position> tailO = new LinkedList<>();

    public static void main(String[] args) {
        putX(1,1);
        putO(1, 1);
        putO(2, 2);
        printBoard();
        putX(0, 0);
        putX(0, 1);
        putX(1, 0);
        putO(1, 1);
        printBoard();
    }

    public static void printBoard() {
        for (int i = 0; i < board.length; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < board.length -1 ) {
                System.out.println("---|---|---");
            }
        }
    }

    public static void putX(int x, int y) {
        if (board[x][y] != ' ') {
            System.out.println("La casilla ya está ocupada.");
        } else {
            tailX.add(new Position(x, y));
            board[x][y] = 'X';
        }

        if (tailX.size() > 3) {
            Position oldest = tailX.poll();
            board[oldest.x()][oldest.y()] = ' ';
        }
    }

    public static void putO(int x, int y) {
        if (board[x][y] != ' ') {
            System.out.println("La casilla ya está ocupada.");
        } else {
            tailO.add(new Position(x, y));
            board[x][y] = 'O';
        }

        if (tailO.size() > 3) {
            Position oldest = tailX.poll();
            board[oldest.x()][oldest.y()] = ' ';
        }
    }

    public static boolean whoWins(char player) {
        // Rows and Columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                    return true;
                }
            }
        
        // Diagonals
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
                return true;
            }

        return false;
    }
}
