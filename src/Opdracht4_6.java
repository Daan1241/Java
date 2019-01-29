import java.awt.*;
import java.applet.*;


public class Opdracht4_6 extends Applet {

    public void init(){



    }



    public void paint(Graphics g){
        g.setColor(Color.black);
        g.fillRoundRect(40, 40, 80, 200, 30, 30);

        g.setColor(Color.red);
        g.fillArc(60, 60, 40, 40, 0, 360);
        g.setColor(Color.orange);
        g.fillArc(60, 120, 40, 40, 0, 360);
        g.setColor(Color.green);
        g.fillArc(60, 180, 40, 40, 0, 360);

        g.setColor(Color.black);
        g.fillRect(75, 240, 10, 160);

    }

}
