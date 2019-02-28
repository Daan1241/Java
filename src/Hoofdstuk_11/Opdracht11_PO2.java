package Hoofdstuk_11;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht11_PO2 extends Applet {

    int teller;
    double tafel;
    int y;
    int multiplier;

    int getal;
    Button ok;


    public void init() {

        tafel = 1;
        y = 40;
        multiplier = 1;

        getal = 1;
        KnopListener kl = new KnopListener();
        ok = new Button("OK");
        ok.addActionListener(kl); //moet NA 'knop = new Button("Knop Tekst");' komen!


        add(ok);
    }

    public void paint(Graphics g) {
        for (teller = 0; teller < 10; teller++) {
            g.drawString("Tafel van " + getal + ": " + multiplier + " x " + tafel + " = " + tafel * multiplier, 20, y);
                y=y+10;
                getal++;
                multiplier++;


        }

        y = 40;
        multiplier = 1;
        getal = 1;
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tafel=tafel+1;

            repaint();
        }
    }


}
