package Hoofdstuk_12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.Arrays;

public class Opdracht12_3 extends Applet {

    TextField[] textfields = new TextField[6];
    Button OkBtn;
    int[] intArray = new int[6];

    public void init() {
        OkBtn = new Button();
        OkBtn.setLabel("Ok");

        for (int i = 1; i <= 5; i++) {
            textfields[i] = new TextField("tf", 2);
            add(textfields[i]);
        }
        add(OkBtn);


        KnopListener kl = new KnopListener();
        OkBtn.addActionListener(kl);


    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int l = 1; l <= 5; l++) {
                intArray[l] = Integer.parseInt(textfields[l].getText());

            }
            Arrays.sort(intArray);
            for (int m = 1; m <= 5; m++) {
                textfields[m].setText(intArray[m] + "");
            }
        }
    }


}
