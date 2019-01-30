import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht8_1 extends Applet {

    String schermtekst;
    Button enter;
    Button reset;
    TextField tekstvak;

    public void init() {
        schermtekst = "Tekst hier!";
        enter = new Button("Tekst op knop");
        tekstvak = new TextField("Klik op mij", 20);

        enterButtonListener enterbl = new enterButtonListener();
        resetButtonListener resetbl = new resetButtonListener();

        enter.addActionListener(enterbl);
        reset.addActionListener(resetbl);

        add(tekstvak);
        add(enter);
        add(reset);

    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 50, 60);

    }


    class enterButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst = "TEST1";
            repaint();
        }

    }

    class resetButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst = "TEST2";
            repaint();
        }

    }

}
