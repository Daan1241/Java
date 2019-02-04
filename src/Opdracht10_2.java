import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_2 extends Applet {

    double highest;
    TextField input;
    Button check;
    double convertedNumber;


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
        g.drawString("Het laatst ingevoerde getal is: " + convertedNumber, 20, 80);


    }

    class checkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String x = input.getText();
            convertedNumber = Double.parseDouble(x);
            if(convertedNumber > highest){
                highest = convertedNumber;

            }
            repaint();
        }
    }


}
