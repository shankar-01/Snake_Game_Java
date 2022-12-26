import javax.lang.model.element.ModuleElement;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
class Food extends Thread{
    JLabel egg = null;
    Random random = new Random();
    Color[] colors = {Color.red, Color.yellow, Color.green, Color.white, Color.pink};
    public Food(){
        egg = new JLabel();
        egg.setOpaque(true);
        egg.setBackground(colors[random.nextInt(5)]);
        egg.setBounds(random.nextInt(Toolkit.getDefaultToolkit().getScreenSize().width-45) + 20, random.nextInt(Toolkit.getDefaultToolkit().getScreenSize().height - 90) + 20, 20, 20 );
    }
    public void run(){
        try {
                    while (true) {
                        System.out.print("\0");
                        if(isMeet()){
                        egg.setVisible(false);
                        egg.setBounds(random.nextInt(1000), random.nextInt(650), 20, 20);
                        egg.setBackground(colors[random.nextInt(5)]);
                        egg.setVisible(true);
                        MoveSnake.gb.increaseSnake();
                        }
                    }

        }catch (Exception e){
            System.out.println(e.getCause());
        }
    }
    public boolean isMeet(){
        int x = MoveSnake.snake.head.getX();
        int y = MoveSnake.snake.head.getY();
        int h = MoveSnake.snake.head.getHeight();
        int w = MoveSnake.snake.head.getWidth();
        return (egg.getX() >= x && egg.getX() <= x+w && egg.getY() >= y && egg.getY() <= y+h) || (egg.getX()+egg.getWidth() >= x && egg.getX()+egg.getWidth() <= x+w && egg.getY() >= y && egg.getY() <= y+h)
                || (egg.getX()+egg.getWidth() >= x && egg.getX()+egg.getWidth() <= x+w && egg.getY()+egg.getHeight() >= y && egg.getY()+egg.getHeight() <= y+h)
                || (egg.getX() >= x && egg.getX() <= x+w && egg.getY()+egg.getHeight() >= y && egg.getY()+egg.getHeight() <= y+h);
    }
}
