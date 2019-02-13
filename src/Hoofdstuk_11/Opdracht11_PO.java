package Hoofdstuk_11;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht11_PO extends Applet {

    int teller;
    double tafel;
    int y;
    int multiplier;
    int getal;

    Button ok;
    TextField input;

    public void init() {
        tafel = 1;
        y = 40;
        multiplier = 1;
        getal = 1;


        KnopListener kl = new KnopListener();
        ok = new Button("OK");
        ok.addActionListener(kl); //moet NA 'knop = new Button("Knop Tekst");' komen!

        input = new TextField("Vul hier wat in", 20);

        add(input);
        add(ok);
    }

    public void paint(Graphics g) {
        for (teller = 0; teller < 10; teller++) {


            g.drawString("Tafel van " + getal + ": " + multiplier + " x " + tafel + " = " + tafel * multiplier, 20, y);

            multiplier = multiplier+1;
            y = y + 10;
            System.out.println(y);




        }
        y = 40;
        getal = 1;
        tafel = 1;
        multiplier = 1;
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tafel = Double.parseDouble(input.getText());

            repaint();
        }
    }


}
