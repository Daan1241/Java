import java.awt.*;
import java.applet.*;

public class Opdracht6_3 extends Applet {
int nummer;
int overflow;

    public void init(){
        nummer = 2147483647;
        overflow = nummer + 1;
        setSize(800, 200);

    }

    public void paint(Graphics g){
        g.drawString("Nummer = " + nummer, 50, 50);
        g.drawString("Nummer = " + overflow, 50, 80);
        g.drawString("Wanneer het getal groter wordt dan de 32-bit Integer Limit, gaat de waarde vreemde dingen doen...", 50, 100);


    }





}
