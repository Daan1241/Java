/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek
import java.awt.*;
import java.applet.*;
import javax.swing.JButton;


//een klasse met de naam Show van het type Applet
public class Show<non> extends Applet {

  //een (lege) methode die de Applet initialiseert
  public void init() {
    setBackground(Color.white);
  }



  public void paint(Graphics g) {
    g.drawRoundRect(40,40,100,30, 20, 20);
    int counter = 0;
    int y = 10;
    for(int i=1;i<=100000;i++)
    {
      counter = counter + 1;
      y = y+10;
      g.drawString("counter:" + counter, 50, y);
      System.out.println("Student age is : " + counter);

    }
  }

  public void main(String[] args) {



  }

}