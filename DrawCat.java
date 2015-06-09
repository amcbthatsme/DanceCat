import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.ImageIO;
public class DrawCat extends JPanel{
   //private JFrame window;
   //private JPanel drawings;
   public static String cat;
   public boolean tester = false;
   
   public  void paintComponent(Graphics g){
      super.paintComponent(g);
      if (tester == true){
      try{
      g.drawImage(ImageIO.read(new File(cat)),750,150 ,this);
         //UpArrow up = new UpArrow(window,"Fall.png");
         //up.paintComponent(g);
         
        
      }
      catch(IOException e){}
      } 
      if (tester == false){
      try{
      g.drawImage(ImageIO.read(new File("CatNeutralSmall.png")),750,150 ,this);
         //UpArrow up = new UpArrow(window,"Fall.png");
         //up.paintComponent(g);
         
        
      }
      catch(IOException e){}
      }
      //repaint();
         
   }
   
  public void create(){
      repaint();
   }
}