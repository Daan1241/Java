package Hoofdstuk_12;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Opdracht12_3 extends Applet{

    int n1, n2, n3, n4;
    String a,b,c,d;
    TextField text1 = new TextField("Nummer 1");
    TextField text2 = new TextField("Nummer 2");
    TextField text3 = new TextField("Nummer 3");
    TextField text4 = new TextField("Nummer 4");
    Button verify = new Button("Check");
    String[] getallen;
    String output;
    int i;

    public void init() {
        ButtonListener bl = new ButtonListener();
        verify.addActionListener(bl);


        add(text1);
        add(text2);
        add(text3);
        add(text4);
        add(verify);



    }

    public void paint(Graphics g){
        g.drawString(output, 50, 200);

    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String a = text1.getText();
            double d1 = Integer.parseInt(a);
            String b = text2.getText();
            double d2 = Integer.parseInt(b);
            String c = text3.getText();
            double d3 = Integer.parseInt(c);
            String d = text4.getText();
            double d4 = Integer.parseInt(d);
            Arrays.sort(getallen);
            getallen[0] = ""+n1;
            getallen[1] = ""+n2;
            getallen[2] = ""+n3;
            getallen[3] = ""+n4;


            for (int i = 0; i < getallen.length; i++) {
                output = output+getallen[i];
            }
            repaint();
        }
    }

}
