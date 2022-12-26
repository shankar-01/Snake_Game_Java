import javax.lang.model.element.ModuleElement;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
class MoveSnake extends Thread{
    static Snake snake = null;
    static GameBoard gb = null;
    static Direction dir = Direction.right;
    Food food = new Food();
    public MoveSnake(GameBoard gb) {
        this.snake = gb.snake;
        this.gb = gb;
        gb.add(food.egg);
        start();
    }
    @Override
    public void run() {
        int x = 0;
        int y = 0;
        food.start();
        while(true){
            if(dir == Direction.right){
                x=snake.head.getX()+20; y = snake.head.getY();
            }
            else if(dir == Direction.left){
                x=snake.head.getX()-20; y = snake.head.getY();
            }
            else if(dir == Direction.top){
                x=snake.head.getX(); y = snake.head.getY()-20;
            }
            else if(dir == Direction.bottom){
                x=snake.head.getX(); y = snake.head.getY()+20;
            }
            snake.moveSnake(x, y);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
