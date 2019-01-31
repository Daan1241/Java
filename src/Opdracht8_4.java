import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht8_4 extends Applet {

    TextField nr1;
    TextField nr2;
    Button plus;
    Button minus;
    Button multiply;
    Button divide;
    double answer;

    public void init() {
        nr1 = new TextField("", 10);
        nr2 = new TextField("", 10);

        plusListener plusBl = new plusListener();
        plus = new Button("+");
        plus.addActionListener(plusBl);

        minusListener minBl = new minusListener();
        minus = new Button("-");
        minus.addActionListener(minBl);

        multiplyListener multiplyBl = new multiplyListener();
        multiply = new Button("X");
        multiply.addActionListener(multiplyBl);

        divideListener divideBl = new divideListener();
        divide = new Button("/");
        divide.addActionListener(divideBl);


        add(nr1);
        add(nr2);
        add(plus);
        add(minus);
        add(multiply);
        add(divide);

    }

    public void paint(Graphics g){
        g.drawString("Uitkomst: " + answer, 50, 50);

    }




    class plusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String x1 = nr1.getText();
            String x2 = nr2.getText();
            double p1 = Double.parseDouble(x1);
            double p2 = Double.parseDouble(x2);
            answer = p1 + p2;
            repaint();
        }
    }

    class minusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String x1 = nr1.getText();
            String x2 = nr2.getText();
            double p1 = Double.parseDouble(x1);
            double p2 = Double.parseDouble(x2);
            answer = p1 - p2;
            repaint();
        }
    }

    class multiplyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String x1 = nr1.getText();
            String x2 = nr2.getText();
            double p1 = Double.parseDouble(x1);
            double p2 = Double.parseDouble(x2);
            answer = p1 * p2;
            repaint();
        }
    }

    class divideListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String x1 = nr1.getText();
            String x2 = nr2.getText();
            double p1 = Double.parseDouble(x1);
            double p2 = Double.parseDouble(x2);
            answer = p1 / p2;
            repaint();
        }
    }


}

