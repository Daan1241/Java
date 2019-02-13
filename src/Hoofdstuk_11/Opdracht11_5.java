package Hoofdstuk_11;

import java.awt.*;
import java.applet.*;

public class Opdracht11_5 extends Applet{

    int x, y, x1, y2, teller;

    public void paint(Graphics g) {
        for (teller = 0; teller < 5; teller++) {
            x1 = x1+20;
            y2 = y2+20;

            g.drawRect(x1, y2, 20, 20);


        }
    }


}
