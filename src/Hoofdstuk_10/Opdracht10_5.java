import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_5 extends Applet {
    //DIT SCRIPT WERKT NOG NIET!!!!<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    Button OkButton;
    TextField invoer;
    Label output;
    double gemiddelde;
    double nrAmount;

    public void init() {
        nrAmount = 0;
        gemiddelde = 0;
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


    }

    class OkButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String i = invoer.getText();
            int invoerConverted = Integer.parseInt(i);



            nrAmount = nrAmount + 1;
            gemiddelde = (gemiddelde + invoerConverted) / nrAmount;

            output.setText("Gemiddelde: " + gemiddelde);
            repaint();
        }
    }


}
