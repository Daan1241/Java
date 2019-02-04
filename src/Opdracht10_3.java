import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_3 extends Applet {

    TextField input;
    Button verify;

    public void init() {
    input = new TextField("Vul een maandnummer in", 12);
    verify = new Button("Check!");

    add(input);
    add(verify);

    }

    public void paint(Graphics g) {


    }

    class checkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }


}
