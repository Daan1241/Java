import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_5 extends Applet {
    //DIT SCRIPT WERKT NOG NIET!!!!<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    Button OkButton;
    TextField invoer;
    Label output;
    double gemiddelde, nrAmount, totaal;
    String foutcode;

    public void init() {
        nrAmount = 0;
        gemiddelde = 0;
        totaal = 0;
        foutcode = "";
        OkButtonListener OkBl = new OkButtonListener();

        OkButton = new Button("Ok");
        invoer = new TextField("", 20);
        output = new Label("Uitvoer");
        OkButton.addActionListener(OkBl);


        add(invoer);
        add(OkButton);
        add(output);

    }

    public void paint(Graphics g) {
        g.drawString("gemiddelde: " + gemiddelde, 20, 50);
        g.drawString("Cijfers: " + nrAmount, 20, 70);
        g.drawString(foutcode, 20, 90);


    }

    class OkButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int invoerConverted = Integer.parseInt(invoer.getText());

            if (invoerConverted > 10 || invoerConverted <= 0) {
                foutcode = "Vul een geldig nummer in";
                repaint();
            }
            else{
                nrAmount = nrAmount + 1;
                totaal += invoerConverted;
                gemiddelde = totaal / nrAmount;

                output.setText("Gemiddelde: " + gemiddelde);
                foutcode = "";
                repaint();

            }
        }
    }


}
