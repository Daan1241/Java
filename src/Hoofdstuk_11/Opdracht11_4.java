package Hoofdstuk_11;

import java.awt.*;
import java.applet.*;

public class Opdracht11_4 extends Applet {
    int y;
    int teller;
    int tafel;
    int x;

    public void start() {
        y = 20;
        tafel = 3;
        x = 1;
    }

    public void paint(Graphics g) {

        for (teller = 0; teller < 1000; teller++) {
            tafel = x * 3;
            g.drawString("" + tafel, 20, y);
            y = y + 15;
            x = x+1;
        }

    }

}
