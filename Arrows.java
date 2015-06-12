import javax.imageio.*;
import java.awt.image.*;
import java.io.*;
public interface Arrows {
   public int getX();
   public int getY();
   public void setX(int ySet);
   public void setY(int xSet);
   public void stop();
   public BufferedImage getArrow();
   public String getName();
}