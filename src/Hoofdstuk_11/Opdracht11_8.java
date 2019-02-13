package Hoofdstuk_11;

import java.awt.*;
import java.applet.*;


public class Opdracht11_8 extends Applet{

    int x1 = 10, y1 = 10, x2 = 500, y2 = 500, teller;

    public void init(){



    }

    public void paint(Graphics g){
        for (teller = 0; teller < 1000; teller++) {
            x2 = x2-10;
            y2 = y2-10;


            g.drawArc(10, 10, x2, y2, 0, 360);

        }
    }


}
