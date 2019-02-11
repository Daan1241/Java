import java.applet.Applet;
import java.awt.*;


public class Opdracht5_1 extends Applet {

    Color lijnkleur = Color.black;
    Color opvulkleur = Color.green;

    public void init(){

    }

    public void paint(Graphics g){
        //Lijn
        g.setColor(lijnkleur);
        g.drawLine(20, 20, 200, 20);
        g.drawString("Lijn", 20, 40);

        //Rechthoek
        g.drawRect(20, 60, 200, 100);
        g.drawString("Rechthoek", 25, 75);

        //Afgeronde rechthoek
        g.drawRoundRect(20, 180, 200, 100, 30, 30);
        g.drawString("Afgeronde Rechthoek", 25, 205);

        //Gevulde rechthoek met ovaal
        g.setColor(opvulkleur);
        g.fillRect(230, 60, 200, 100);
        g.setColor(lijnkleur);
        g.drawArc(230, 60, 200, 100, 0, 360);
        g.setColor(lijnkleur);
        g.drawString("Gevulde rechthoek met ovaal", 250, 130);

        //Gevulde ovaal
        g.setColor(opvulkleur);
        g.fillArc(230, 180, 200, 100, 0, 360);
        g.setColor(lijnkleur);
        g.drawString("Gevulde rechthoek met ovaal", 250, 230);

        //Ovaal met taartpunt
        g.setColor(lijnkleur);
        g.drawString("Gevulde rechthoek met ovaal", 460, 130);
        g.drawArc(230+210, 60, 200, 100, 0, 360);
        g.setColor(opvulkleur);
        g.fillArc(440, 60, 200, 100, 0, 45);

        //Cirkel
        g.setColor(lijnkleur);
        g.drawString("Cirkel", 480, 260);
        g.drawArc(440, 180, 100, 100, 0, 360);

    }
}
