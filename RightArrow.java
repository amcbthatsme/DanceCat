import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.*;
import java.awt.image.*;
import java.io.*;

public class RightArrow implements Arrows {  
   public int x = 345;
   public int y = 0;
   public BufferedImage arrow; 
   private String direction;
   public String name = "right";
   public RightArrow( )throws  FileNotFoundException{
   try{
      arrow = (ImageIO.read(new File("FallRight.png")));
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