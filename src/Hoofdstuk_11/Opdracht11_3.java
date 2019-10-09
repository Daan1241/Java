import java.awt.*;
import java.applet.*;


public class Opdracht11_3 extends Applet {

    public void init() {


    }

    public void paint(Graphics g) {
        int basis = 10, nummer1 = 0, nummer2 = 1;
        int teller;
        int y = 0;

        for (teller = 0; teller < 100000; teller++) {
            g.drawString("" + nummer1, 100, y);
            teller = teller+teller;
            y = y+20;





            int opgeteld = nummer1 + nummer2;
            nummer1 = nummer2;
            nummer2 = opgeteld;
        }
        //Note: Ik vond dit een lastige opdracht. Ik weet dus niet zeker of ik deze opdracht helemaal goed heb gedaan.

    }
}
