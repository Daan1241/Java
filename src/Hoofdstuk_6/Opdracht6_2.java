import java.awt.*;
import java.applet.*;

public class Opdracht6_2 extends Applet {
    int sec;
    int min;
    int kwart;
    int half;
    int uur;
    public void init(){

        sec = 1;
        min = sec * 60;
        kwart = min * 15;
        half = min * 30;
        uur = min * 60;


    }



    public void paint(Graphics g){
            g.drawString("Seconden in een minuut: " + min, 40, 40);
            g.drawString("Seconden in een kwartier: " + kwart, 40, 80);
            g.drawString("Seconden in een half uur: " + half, 40, 120);
            g.drawString("Seconden in een uur: " + uur, 40, 160);


    }



}
