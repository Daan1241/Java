import java.awt.*;
import java.applet.*;


public class Opdracht4_7 extends Applet {

    public void init(){

    }


    public void paint(Graphics g){
        //basisvorm dobbelsteen
        g.drawRoundRect(40, 40, 200, 200, 30, 30);

        //stippen
        g.fillArc(70, 70, 40, 40, 0, 360);
        g.fillArc(170, 170, 40, 40, 0, 360);
        g.fillArc(170, 70, 40, 40, 0, 360);
        g.fillArc(70, 170, 40, 40, 0, 360);

    }
}
