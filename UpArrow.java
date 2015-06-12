import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.*;
import java.awt.image.*;
import java.io.*;

public class UpArrow implements Arrows {  
   public int x = 0;
   public int y = 0;
   public BufferedImage arrow; 
   public String name = "up";
   private String direction;
   public UpArrow( )throws  FileNotFoundException{
   try{
      arrow = (ImageIO.read(new File("Fall.png")));
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
   public String getName(){
      return name;
   }
   
}