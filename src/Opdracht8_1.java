import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht8_1 extends Applet {

    Button knop;
    Button reset;
    String schermtekst;
    TextField tekstinput;
    Label label;

    public void init() {
        schermtekst = "Vul wat in";

        //knop
        KnopListener kl = new KnopListener();
        knop = new Button("Kopieer Tekst");
        knop.addActionListener(kl); //moet NA 'knop = new Button("Knop Tekst");' komen!

        //reset
        ResetListener kl2 = new ResetListener();
        reset = new Button("reset");
        reset.addActionListener(kl2); //moet NA 'knop = new Button("Knop Tekst");' komen!


        //tekstvak
        tekstinput = new TextField("Vul hier wat in", 20);


        //label
        label = new Label(schermtekst);

        //in elkaar zetten van scherm
        add(tekstinput);
        add(knop);
        add(reset);
        add(label);



    }


    //KOPIEREN
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            label.setText(tekstinput.getText());
            repaint();
        }
    }


    //RESET
    class ResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            label.setText("");
        }
    }


}

