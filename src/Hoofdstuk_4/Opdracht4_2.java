import java.awt.*;
import java.applet.*;

public class Opdracht4_2 extends Applet {

    public void init(){
    setBackground(Color.white);
    }

    public void paint(Graphics g) {
        //Dak
        g.drawLine(80, 50, 20, 150);
        g.drawLine(80, 50, 140, 150);
        g.drawLine(20, 150, 140, 150);

        //begane grond
        g.drawRect(20, 150, 120, 120);

        //raam
        g.drawOval(55, 90, 50, 50);

        //deur
        g.drawArc(55, 200, 30, 30, 0, 180);
        g.drawLine(55, 212, 55, 270);
        g.drawLine(85, 212, 85, 270);
    }
}
