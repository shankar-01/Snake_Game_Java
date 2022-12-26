import javax.lang.model.element.ModuleElement;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
class SnakePart extends JLabel{
    SnakePart next = null;
    SnakePart(){
        setOpaque(true);
        setBackground(Color.white);
        setSize(20, 20);
    }
    public void setPosition(int x, int y){
        setBounds(x, y, getWidth(), getHeight());
    }
}
