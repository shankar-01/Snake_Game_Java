import javax.lang.model.element.ModuleElement;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
class GameBoard extends JPanel{
    Snake snake = null;
    GameBoard(){
        snake = new Snake(400, 400);
        setBackground(Color.BLACK);
        setLayout(null);
        addBoundry();
        addSnake();

    }
    public void play(){
        new MoveSnake(this);
    }
    private void addSnake(){
        SnakePart part = snake.head;
        while (part != null){
            add(part);
            part = part.next;
        }
    }
    private void addBoundry(){
        int x = Math.round((float)Toolkit.getDefaultToolkit().getScreenSize().getWidth());
        int y = Math.round((float)Toolkit.getDefaultToolkit().getScreenSize().getHeight());
        x-=25;
        y-=70;
        for (int i = 0; i <= x/20; i++) {
            for (int j = 0; j <= y/20; j++) {
                if(i==0 || j==0 || i>=x/20 || j==y/20) {
                    JLabel label = new JLabel();
                    label.setOpaque(true);
                    label.setBackground(Color.gray);
                    label.setBounds(i * 20, j * 20, 20, 20);
                    add(label);
                }
            }

        }
    }
    public void increaseSnake(){
        snake.increaseSize();
        add(snake.tail);
    }
}
