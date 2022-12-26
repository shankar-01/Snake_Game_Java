import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
class KeyBoardControl implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP){
            if(MoveSnake.dir != Direction.bottom)
            MoveSnake.dir = Direction.top;
        }
        else if(e.getKeyCode() == KeyEvent.VK_DOWN){
            if(MoveSnake.dir != Direction.top)
                MoveSnake.dir = Direction.bottom;
        }
        else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            if(MoveSnake.dir != Direction.left)
                MoveSnake.dir = Direction.right;
        }
        else if(e.getKeyCode() == KeyEvent.VK_LEFT){
            if(MoveSnake.dir != Direction.right)
                MoveSnake.dir = Direction.left;
        }
    }
}
