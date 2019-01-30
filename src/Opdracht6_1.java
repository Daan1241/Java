import java.awt.*;
import java.applet.*;


public class Opdracht6_1 extends Applet {
    double a;
    double b;
    double c;
    double d;
    double totaal;

    public void init() {
        //initialiseren van value
        totaal = 113;
        a = totaal / 4;
        b = totaal / 4;
        c = totaal / 4;
        d = totaal / 4;

        //achtergrond naar donkergrijs verzetten
        setBackground(Color.darkGray);



        //groote van de Applet instellen
        setSize(300, 150);

    }

    public void paint(Graphics g) {
        //grootte van de tekst instellen
        g.setFont(g.getFont().deriveFont(22.0f));
        g.setColor(Color.white);
        g.fillRoundRect(15, 15, 250, 100, 30, 30);
        //Hoeveelheden opschrijven
        g.setColor(Color.blue);
        g.drawString("Jan krijgt: €" + a + ",-", 20, 40);
        g.setColor(Color.orange);
        g.drawString("Ali krijgt: €" + b + ",-", 20, 60);
        g.setColor(Color.red);
        g.drawString("Jeanette krijgt: €" + c + ",-", 20, 80);
        g.setColor(Color.black);
        g.drawString("Daan krijgt: €" + d + ",-", 20, 100);
    }
}