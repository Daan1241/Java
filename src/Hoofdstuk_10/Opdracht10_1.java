import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht10_1 extends Applet {

    double highest;
    TextField input;
    Button check;


    public void init() {
        checkListener checkBl = new checkListener();
        check = new Button("Check");
        check.addActionListener(checkBl);


        highest = 0;
        input = new TextField("Vul een getal in", 20);
        add(input);
        add(check);

    }

    public void paint(Graphics g) {
        g.drawString("Het hoogste ingevoerde getal is: " + highest, 20, 40);


    }

    class checkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String x = input.getText();
            double convertedNumber = Double.parseDouble(x);
            if(convertedNumber > highest){
                highest = convertedNumber;

            }
            repaint();
        }
    }


}
