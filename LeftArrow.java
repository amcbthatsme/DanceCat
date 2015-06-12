import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.*;
import java.awt.image.*;
import java.io.*;

public class LeftArrow implements Arrows {  
   public int x = 195;
   public int y = 0;
   public String name = "left";
   public BufferedImage arrow; 
   private String direction;
   public LeftArrow( )throws  FileNotFoundException{
   try{
      arrow = (ImageIO.read(new File("FallLeft.png")));
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