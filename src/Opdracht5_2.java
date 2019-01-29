import java.awt.*;
import java.applet.*;


public class Opdracht5_2 extends Applet {

    int gewicht_Valerie;
    int gewicht_Jeroen;
    int gewicht_Hans;


    public void init(){
        setBackground(Color.darkGray);
        gewicht_Valerie = 40;
        gewicht_Jeroen = 100;
        gewicht_Hans = 80;


    }


    public void paint(Graphics g) {
        //teken de grafiek (buitenlijnen)
        g.setColor(Color.white);
        g.drawLine(20, 20, 20, 220);
        g.drawLine(20, 220, 200, 220);


        //grafieklijnen (20, 40, 60, 80, 100)
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
        g.fillRect(30, 220-gewicht_Valerie*2,45, gewicht_Valerie*2);
        g.drawString("Valerie", 35, 240);

        g.setColor(Color.green);
        //Jeroen: 100 kg
        g.fillRect(85, 220-gewicht_Jeroen*2, 45, gewicht_Jeroen*2);
        g.drawString("Jeroen", 90, 240);

        g.setColor(Color.blue);
        //Hans: 80 kg
        g.fillRect(140, 220-gewicht_Hans*2, 45, gewicht_Hans*2);
        g.drawString("Hans", 145, 240);



    }
}
