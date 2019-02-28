package Hoofdstuk_12;

import java.awt.*;
import java.applet.*;

public class Opdracht12_1 extends Applet{

    double lijst[];
    int x;
    int teller;
    int y;



    public void init() {
        lijst = new double[10];

        lijst[0] = Math.random();
        lijst[1] = Math.random();
        lijst[2] = Math.random();
        lijst[3] = Math.random();
        lijst[4] = Math.random();
        lijst[5] = Math.random();
        lijst[6] = Math.random();
        lijst[7] = Math.random();
        lijst[8] = Math.random();
        lijst[9] = Math.random();

        y=20;


    }


    public void paint(Graphics g){
        for (teller = 0; teller < 10; teller++) {
            g.drawString(""+ lijst[x], 20, y);
            x++;
            y=y+10;
        }

        g.drawString("Gemiddelde = " + (lijst[0]+ lijst[1]+ lijst[2]+ lijst[3]+ lijst[4]+ lijst[5]+ lijst[6]+ lijst[7]+ lijst[8]+ lijst[9] / 10), 20, 200);
    }


}
