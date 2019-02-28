package Hoofdstuk_12;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht12_2 extends Applet {


    public void init() {

        int x = 1;

        for (int teller = 0; teller < 25; teller++) {

            Button knop = new Button("" + x);
            add(knop);
            x++;
        }


    }


    public void paint(Graphics g) {


    }


}

