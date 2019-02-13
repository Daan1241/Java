package Hoofdstuk_11;

import java.awt.*;
import java.applet.*;


public class Opdracht11_6 extends Applet{

    int x1 = 100, y1 = 100, x2 = 100, y2 = 100, teller;

    public void init(){



    }

    public void paint(Graphics g){
        for (teller = 0; teller < 1000; teller++) {
                x1 = x1+10;
                y1 = y1+10;
                x2 = x2-20;
                y2 = y2-20;

            g.drawArc(100, 100, 100, 100, 0, 360);
            g.drawArc(x1, y1, x2, y2, 0, 360);

        }
    }


}
