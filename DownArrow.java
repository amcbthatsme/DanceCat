import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.*;
import java.awt.image.*;
import java.io.*;

public class DownArrow implements Arrows {  
   private int x = 485;
   private int y = 0;
   public BufferedImage arrow; 
   private String direction;
   public DownArrow( )throws  FileNotFoundException{
   try{
      arrow = (ImageIO.read(new File("FallDown.png")));
      }catch(IOException e){}
}
   public void stop(){}
   public BufferedImage getArrow(){
      return arrow;
   }
   
   public int getX(){
      return x;
   }
   
   public int getY(){
      return y;
   }
   
   public void setX(int xSet){
      x = xSet;
   }
   
   public void setY(int ySet){
      y = ySet;
   }
   
}