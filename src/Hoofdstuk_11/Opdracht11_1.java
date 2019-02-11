import java.awt.*;
import java.applet.*;


public class Opdracht11_1 extends Applet {

    public void init() {
        setSize(500, 500);

    }

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for(teller = 0; teller < 11; teller++) {
            y += 20;
            g.drawString("" + teller, y, 320 );
            g.drawLine(y , 50, y, 300 );

        }
    }
}