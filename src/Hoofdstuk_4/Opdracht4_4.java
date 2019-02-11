import java.awt.*;
import java.applet.*;


public class Opdracht4_4 extends Applet {

    public void init(){
    setBackground(Color.darkGray);


    }


    public void paint(Graphics g) {
        //teken de grafiek (buitenlijnen)
        g.setColor(Color.white);
        g.drawLine(20, 20, 20, 220);
        g.drawLine(20, 220, 200, 220);


        //grafieklijnen (20, 40, 60, 80)
        //20
        g.drawLine(20, 180, 200, 180);
        //40KG
        g.drawLine(20, 140, 200, 140);
        //60KG
        g.drawLine(20, 100, 200, 100);
        //80KG
        g.drawLine(20, 60, 200, 60);
        //100KG
        g.drawLine(20, 20, 200, 20);

        g.setColor(Color.magenta);
        //Valerie: 40 kg
        g.fillRect(30, 140, 45, 80);
        g.drawString("Valerie", 35, 240);

        g.setColor(Color.green);
        //Jeroen: 100 kg
        g.fillRect(85, 20, 45, 200);
        g.drawString("Jeroen", 90, 240);

        g.setColor(Color.blue);
        //Hans: 80 kg
        g.fillRect(140, 60, 45, 160);
        g.drawString("Hans", 145, 240);



    }
}
