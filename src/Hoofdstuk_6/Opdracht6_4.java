import java.awt.*;
import java.applet.*;

public class Opdracht6_4 extends Applet {
    double c1, c2, c3;
    double uitkomst;
    int x;



    public void init(){
        c1 = 5.9;
        c2 = 6.3;
        c3 = 6.9;
        uitkomst = (c1+c2+c3)/3;
        uitkomst = uitkomst*10;
        x = (int) uitkomst;
        uitkomst = x;
        uitkomst = uitkomst / 10;



    }


    public void paint(Graphics g) {
        g.drawString("Het gemiddelde cijfer is: " + uitkomst, 50, 50);


    }
}
