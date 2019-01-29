import java.awt.*;
import java.applet.*;

public class Opdracht2_2 extends Applet{

    public void init(){
        //Voorinstellingen van het programma
        setBackground(Color.white);

    }

    public void paint(Graphics g){
        g.setFont(g.getFont().deriveFont(25.0f));
        //voegt schaduw aan onder de tekst. Moet BOVEN de normale tekst staan.
        g.setColor(Color.black);
        g.drawString("Daan", 31, 51);
        g.setColor(Color.black);
        g.drawString("Klein", 31, 81);

        //Normale tekst in de kleuren blauw en rood.
        g.setColor(Color.blue);
        g.drawString("Daan", 30, 50);
        g.setColor(Color.red);
        g.drawString("Klein", 30, 80);




    }


}
