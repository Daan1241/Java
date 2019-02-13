package Hoofdstuk_11;

import java.awt.*;
import java.applet.*;


public class Opdracht11_7 extends Applet{

    int x1 = 10, y1 = 10, x2 = 500, y2 = 500, teller;

    public void init(){



    }

    public void paint(Graphics g){
        for (teller = 0; teller < 1000; teller++) {
            x1 = x1+5;
            y1 = y1+5;
            x2 = x2-10;
            y2 = y2-10;


            g.drawArc(x1, y1, x2, y2, 0, 360);

        }
    }


}
