import java.awt.*;
import java.applet.*;
import java.time.Year;

public class Opdracht2_1 extends Applet {


  public void init() {
    setBackground(Color.blue);
    //Initialiseert het programma. Zet de achtergrond blauw
  }



  public void paint(Graphics g) {
    g.setColor(Color.yellow);
    int counter = 0;
    int y = 10;
    int age = Year.now().getValue() - 2003; //Ik ben geboren in 2002, maar om lastige formules te ontwijken vul ik 2003 in voor het gemak.

    g.drawString("Opdracht 2.1", 50, 30);
    g.drawString("Mijn naam is Daan en ik ben " + age + " jaar oud", 50, 50);
    g.drawLine(50, 60, 270, 60);
    g.drawString("(Mijn leeftijd is hier berekend door een Integer met de naam 'age' de waarde van het huidige jaar te geven, en mijn geboortejaar hier van af te trekken)", 50, 80);







      for(int i=1;i<=1000;i++)
      {
        counter = counter+1;
        y = y+10;
        //g.drawString("counter:" + counter, 50, y);
        System.out.println("Value of integer 'counter' = " + counter);
        }
  }

  public void main(String[] args) {



  }

}