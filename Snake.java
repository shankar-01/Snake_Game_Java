import javax.lang.model.element.ModuleElement;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Snake {
    SnakePart head = null;
    SnakePart tail = null;
    Snake(int hx, int hy){
        head = new SnakePart();
        tail = head;
        head.setBackground(Color.RED);
        head.setPosition(hx, hy);
        for(int i=0; i<3; i++)
            increaseSize();
    }
    public void increaseSize(){
        tail.next = new SnakePart();
        tail.next.setPosition(tail.getX()-20, tail.getY());
        tail = tail.next;
    }
    public void moveSnake(int x, int y){
        int px, py;
        px = head.getX();
        py=head.getY();
        int bx, by;
        head.setPosition(x, y);
        SnakePart temp = head;
        while(temp.next != null){
            bx = temp.next.getX();
            by = temp.next.getY();
            temp.next.setPosition(px, py);
            px = bx;
            py = by;
            temp = temp.next;
        }
    }
}
