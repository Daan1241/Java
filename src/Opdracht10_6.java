import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_6 extends Applet {

    TextField input;
    Button check;
    Label label;

    public void init() {

        setSize(500, 500);

        AL1 AL2 = new AL1();

        input = new TextField("Test");
        check = new Button("Check");
        check.addActionListener(AL2);

        label = new Label("-");


        add(input);
        add(check);
        add(label);

    }

    class AL1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String x = input.getText();
            int converter = Integer.parseInt(x);

            switch(converter){
                case 1:
                    label.setText("Slecht");
                    repaint();
                    break;
                case 2:
                    label.setText("Slecht");
                    repaint();
                    break;
                case 3:
                    label.setText("Slecht");
                    repaint();
                    break;
                case 4:
                    label.setText("Onvoldoende");
                    repaint();
                    break;
                case 5:
                    label.setText("Matig");
                    repaint();
                    break;
                case 6:
                    label.setText("Voldoende");
                    repaint();
                    break;
                case 7:
                    label.setText("Voldoende");
                    repaint();
                    break;
                case 8:
                    label.setText("Goed");
                    repaint();
                    break;
                case 9:
                    label.setText("Goed");
                    repaint();
                    break;
                case 10:
                    label.setText("Goed");
                    repaint();
                    break;
                default:
                    label.setText("Voer een geldig cijfer in");
                    repaint();
                    break;


            }



        }
    }


}
