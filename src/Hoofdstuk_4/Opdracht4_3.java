import java.awt.*;
import java.applet.*;


public class Opdracht4_3 extends Applet {

    public void init(){



    }


    public void paint(Graphics g) {
        //schaduw
        g.setColor(Color.black);
        g.fillRect(12, 12, 100, 60);

        //kleuren
        g.setColor(Color.red);
        g.fillRect(10, 10, 100, 20);
        g.setColor(Color.white);
        g.fillRect(10, 30, 100, 20);
        g.setColor(Color.blue);
        g.fillRect(10, 50, 100, 20);

        //schaduw vlaggenstok
        g.setColor(Color.black);
        g.fillRect(12, 72, 10, 100);

        //vlaggenstok
        g.setColor(Color.darkGray);
        g.fillRect(10, 70, 10, 100);
    }
}
