package Hoofdstuk_12;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Opdracht12_3 extends Applet{

    int n1, n2, n3, n4;
    TextField text1 = new TextField("Nummer 1");
    TextField text2 = new TextField("Nummer 2");
    TextField text3 = new TextField("Nummer 3");
    TextField text4 = new TextField("Nummer 4");
    Button verify = new Button("Check");

    public void init() {
        ButtonListener bl = new ButtonListener();
        verify.addActionListener(bl);
        Integer[] getallen = {n1, n2, n3, n4};

        add(text1);
        add(text2);
        add(text3);
        add(text4);
        add(verify);
    }

    public void paint(Graphics g){
        g.drawString("", 20, 20);

    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Arrays.sort(getallen);

            repaint();
        }
    }

}
