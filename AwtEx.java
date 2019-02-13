package firstguiapp;
import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.*;

import java.awt.event.*;
public class AwtEx{
   Frame f;
   Button b;
   Label l;
   TextField tf;
   public AwtEx(){
       f = new Frame("mini calculator");
       f.setLayout(null);
       f.setSize(400, 300);
       f.setBackground(Color.cyan);
       f.setVisible(true); 
       l = new Label("Enter 1st  number : ");
       l.setBounds(40, 50, 110, 40);
       f.add(l);
       tf = new TextField();
       tf.setBounds(190, 50, 160, 30);
       tf.setBackground(Color.white);
       
       f.add(tf);
       l = new Label("Enter 2nd  number : ");
       l.setBounds(40, 120, 110, 40);
       f.add(l);
       tf = new TextField();
       tf.setBounds(190, 120, 160, 30);
       tf.setBackground(Color.white);
       f.add(tf);
       b = new Button("+");
       b.setBounds(40, 190, 60, 50);
       f.add(b);
       b = new Button("-");
       b.setBounds(105, 190, 60, 50);
       f.add(b); 
       b = new Button("*");
       b.setBounds(170,190, 60, 50);
       f.add(b);
       b = new Button("/");
       b.setBounds(235,190, 60, 50);
       f.add(b);
       b = new Button("%");
       b.setBounds(300,190, 60, 50);
       f.add(b);  
       
       l = new Label("Answer : ");
       l.setBounds(40, 250, 100, 40);
       f.add(l);
       l = new Label("--------------");
       l.setBounds(250, 250, 100, 30);
       f.add(l);   
  
     
   }
 


 
  }     
class FirstGuiApp {
    public static void main(String[] args) {
        new AwtEx();
    }  
}
