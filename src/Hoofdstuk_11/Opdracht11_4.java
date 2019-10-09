package Hoofdstuk_11;

import java.awt.*;
import java.applet.*;

public class Opdracht11_4 extends Applet {
    int h;
    int teller;
    int tafel;
    int x;

    public void start() {

        h = 0;
        tafel = 3;
        x = 1;
        teller = 5;
    }

    public void paint(Graphics g) {
        for (teller = 0; teller < 100; teller++) {
            tafel = x * 3;
            g.drawString("TEST" + tafel, 20, h);
            h = h+1;

        }

    }

}
