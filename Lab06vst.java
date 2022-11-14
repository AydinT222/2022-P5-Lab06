// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab06vst extends Applet
{
    public int minMaxRand(int min, int max) {
        return (int)(Math.floor(Math.random() * (max - min)) + min); // it kept complaining about not accepting doubles, so had to cast to int
    }
    public void randomColor(Graphics g) { // used to do public int[] but forgot how to pass them as args instead of as an array
        g.setColor(new Color(
            (int)(Math.random() * 255),
            (int)(Math.random() * 255),
            (int)(Math.random() * 255)
        )); // same with this
    }
    public void paint(Graphics g)
    {
        // Draw Grid
        g.drawRect(10,10,780,580);
        g.drawLine(400,10,400,590);
        g.drawLine(10,300,790,300);



        // Draw Random Lines
        for (int i = 1; i <= 100; i++) {
            g.drawLine(
                minMaxRand(10, 390),
                minMaxRand(10, 300),
                minMaxRand(10, 390),
                minMaxRand(10, 300)
            );
            randomColor(g); 
        }

        // Draw Random Squares
        for (int i = 1; i <= 100; i++) {
            g.fillRect(
                minMaxRand(410, 740),
                minMaxRand(10, 250),
                50,
                50
            );
            randomColor(g); 
        }


        // Draw Random Circles
        for (int i = 1; i <= 100; i++) {
            int size = minMaxRand(0, 200);
            g.drawOval(
                minMaxRand(10, 400 - size),
                minMaxRand(300, 590 - size),
                size,
                size
            );
            randomColor(g); 
        }




        // Draw 3-D Box
        // polygons?




    }

}



    
 
