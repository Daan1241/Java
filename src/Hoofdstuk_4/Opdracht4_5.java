import java.awt.*;
import java.applet.*;


public class Opdracht4_5 extends Applet {

    public void init(){
        setBackground(Color.blue);
    }


    public void paint(Graphics g){
        g.setColor(Color.yellow);
        g.fillArc(10, 10, 200, 100, 0, 360);


        g.setColor(Color.black);
        //smiley
        g.fillArc(80, 30, 20, 40, 0, 360);
        g.fillArc(120, 30, 20, 40, 0, 360);
        g.fillArc(90, 60, 40, 40, 180, 180);

    }
}
