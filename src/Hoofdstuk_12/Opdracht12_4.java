package Hoofdstuk_12;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.lang.reflect.Array;

public class Opdracht12_4 extends Applet {

    int[] mijnArray = {1, 4, 6, 8, 11, 13, 18, 26, 29};
    TextField tekstveld = new TextField("", 20);
    Button button = new Button();

    public void init() {
        button.setLabel("Ok");
        add(tekstveld);
        add(button);

    }


}
