package Hoofdstuk_11;

import java.awt.*;
import java.applet.*;


public class Opdracht11_9 extends Applet {
    int x = 50;
    int y = 50;
    int breedte = 50;
    int hoogte = 50;

    public void init(){
        setSize(500, 500);

    }

    public void paint(Graphics g) {

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }

        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }


        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }



        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }


        x = 100;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }

        x = 0;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }

            x = 50;
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }

        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }

        x = 100;
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }

        x = 0;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }

        x = 100;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }



    }
}
