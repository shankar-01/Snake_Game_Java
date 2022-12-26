import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game{
    static GameBoard gameBoard = null;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake");
        gameBoard = new GameBoard();
        frame.add(gameBoard);
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        frame.setVisible(true);
        frame.addKeyListener(new KeyBoardControl());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameBoard.play();
    }
}
