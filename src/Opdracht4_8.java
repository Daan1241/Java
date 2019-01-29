import java.awt.*;
import java.applet.*;


public class Opdracht4_8 extends Applet {

    public void init(){

    }

    public void paint(Graphics g){
        //Lijn
        g.setColor(Color.black);
        g.drawLine(20, 20, 200, 20);
        g.drawString("Lijn", 20, 40);

        //Rechthoek
        g.drawRect(20, 60, 200, 100);
        g.drawString("Rechthoek", 25, 75);

        //Afgeronde rechthoek
        g.drawRoundRect(20, 180, 200, 100, 30, 30);
        g.drawString("Afgeronde Rechthoek", 25, 205);

        //Gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(230, 60, 200, 100);
        g.setColor(Color.black);
        g.drawArc(230, 60, 200, 100, 0, 360);
        g.setColor(Color.white);
        g.drawString("Gevulde rechthoek met ovaal", 250, 130);

        //Gevulde ovaal
        g.setColor(Color.magenta);
        g.fillArc(230, 180, 200, 100, 0, 360);
        g.setColor(Color.white);
        g.drawString("Gevulde rechthoek met ovaal", 250, 230);

        //Ovaal met taartpunt
        g.setColor(Color.black);
        g.drawString("Gevulde rechthoek met ovaal", 460, 130);
        g.drawArc(230+210, 60, 200, 100, 0, 360);
        g.setColor(Color.magenta);
        g.fillArc(440, 60, 200, 100, 0, 45);

        //Cirkel
        g.setColor(Color.black);
        g.drawString("Cirkel", 480, 260);
        g.drawArc(440, 180, 100, 100, 0, 360);

    }
}
