import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht8_3 extends Applet {

    TextField bedrag;
    Button ok;
    Label hint;
    Label nbedrag;
    double hoeveelheid;


    public void init() {
        hoeveelheid = 0;
        bedrag = new TextField("", 5);
        hint = new Label("Vul hier een bedrag exclusief BTW in: €");
        nbedrag = new Label("Het bedrag is: €" + hoeveelheid + ",-");

        okBtnListener okBl = new okBtnListener();
        ok = new Button("Ok");
        ok.addActionListener(okBl);

        add(hint);
        add(bedrag);
        add(ok);
        //add(nbedrag);

    }


    public void paint(Graphics g){
        g.drawString("Het bedrag is: €" + hoeveelheid + ",-", 50, 50);


    }



    class okBtnListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String x = bedrag.getText();
            hoeveelheid = Double.parseDouble(x);
            hoeveelheid = hoeveelheid*1.21;
            repaint();
        }
    }

}
