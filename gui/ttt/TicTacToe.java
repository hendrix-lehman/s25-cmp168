import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


class TicTacToe {

  // rows and columns
  private static final int SIZE = 3;
  private char[][] board;

  // current player
  private char currentPlayer;

  // default constructor to initialize the game
  public TicTacToe() {
    init();
  }

  // method to reset the game
  public void init() {
    // for (int i = 0; i < SIZE; i++) {
      // for (int j = 0; j < SIZE; j++) {
        // board[i][j] = ' '; // empty cell
      // }
    // }
    board = new char[SIZE][SIZE];
    currentPlayer = 'X'; // reset to player X
  }

  // play method to place a mark on the board
  public boolean play(int row, int col) {
    if (row < 0 || row >= SIZE || col < 0 || col >= SIZE || board[row][col] != '\0') {
      return false; // invalid move
    }
    board[row][col] = currentPlayer;
    return true;
  }

  // switch player
  public void switchPlayer() {
    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
  }

  // check for a win
  public boolean checkWin() {
    // check rows and columns
    for (int i = 0; i < SIZE; i++) {
      if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
          (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
        return true;
      }
    }
    // check diagonals
    if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
        (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {
      return true;
    }
    return false;
  }

  // check for a draw
  public boolean checkDraw() {
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        if (board[i][j] == '\0') {
          return false; // empty cell found
        }
      }
    }
    return true; // no empty cells
  }

  private static void resetButtons(JButton[][] buttons) {
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        buttons[i][j].setText("");
      }
    }
  }
  
  public static void main(String[] args) {

    JFrame frame = new JFrame("Tic Tac Toe");
    TicTacToe game = new TicTacToe();
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(SIZE, SIZE));
    JButton[][] buttons = new JButton[SIZE][SIZE];
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        buttons[i][j] = new JButton();
        buttons[i][j].setFont(new Font("Arial", Font.PLAIN, 60));
        int row = i;
        int col = j;
        buttons[i][j].addActionListener(e -> {
          if (game.play(row, col)) {
            buttons[row][col].setText(String.valueOf(game.currentPlayer));
            if (game.checkWin()) {
              JOptionPane.showMessageDialog(frame, "Player " + game.currentPlayer + " wins!");
              game.init();
              resetButtons(buttons);
            } else if (game.checkDraw()) {
              JOptionPane.showMessageDialog(frame, "It's a draw!");
              game.init();
              resetButtons(buttons);
            } else {
              game.switchPlayer();
            }
          }
        });
        panel.add(buttons[i][j]);
      }
    }
    frame.add(panel);
    frame.setSize(400, 400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

}
