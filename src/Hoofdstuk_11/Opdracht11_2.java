import java.awt.*;
import java.applet.*;


public class Opdracht11_2 extends Applet {

    int optelgetal = 10, y = 20, teller;

    public void init() {


    }

    public void paint(Graphics g) {
        for (teller = 0; teller < 11; teller++) {
            g.drawString("" + optelgetal, 20, y);
            optelgetal = optelgetal+1;
            y = y + 15;
        }
    }
}
