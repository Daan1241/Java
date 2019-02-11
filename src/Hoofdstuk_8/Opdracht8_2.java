import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht8_2 extends Applet {

    Button man;
    Button vrouw;
    Button jongen;
    Button meisje;
    Label label_hint1;
    int man_count;
    int vrouw_count;
    int jongen_count;
    int meisje_count;
    int totaal;





    public void init() {
        setSize(800, 400);
        totaal = 0;


        manBtnListener manbl = new manBtnListener();
        man = new Button("Ik ben een man");
        man.addActionListener(manbl);

        vrouwBtnListener vrouwbl = new vrouwBtnListener();
        vrouw = new Button("Ik ben een vrouw");
        vrouw.addActionListener(vrouwbl);

        jongenBtnListener jongenbl = new jongenBtnListener();
        jongen = new Button("Ik ben een jongen");
        jongen.addActionListener(jongenbl);

        meisjeBtnListener meisjebl = new meisjeBtnListener();
        meisje = new Button("Ik ben een meisje");
        meisje.addActionListener(meisjebl);


        label_hint1 = new Label("Selecteer wat het beste bij u past:");


        add(label_hint1);
        add(man);
        add(vrouw);
        add(jongen);
        add(meisje);


    }

    public void paint(Graphics g){
        g.drawString("Er zijn " + man_count + " mannen aanwezig.", 100, 60);
        g.drawString("Er zijn " + vrouw_count + " vrouwen aanwezig.", 100, 100);
        g.drawString("Er zijn " + jongen_count + " jongens aanwezig.", 100, 140);
        g.drawString("Er zijn " + meisje_count + " meisjes aanwezig.", 100, 180);
        g.drawString("Er zijn " + totaal + " mensen in totaal aanwezig", 100, 220);

    }

    class manBtnListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            man_count = man_count+1;
            totaal = totaal+1;
            repaint();
        }
    }

    class vrouwBtnListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouw_count = vrouw_count+1;
            totaal = totaal+1;
            repaint();
        }
    }

    class jongenBtnListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jongen_count = jongen_count+1;
            totaal = totaal+1;
            repaint();
        }
    }

    class meisjeBtnListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            meisje_count = meisje_count+1;
            totaal = totaal+1;
            repaint();
        }
    }

}
