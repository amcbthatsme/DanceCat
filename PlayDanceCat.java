import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.util.ArrayList;
public class PlayDanceCat extends JPanel implements KeyListener, ActionListener{
   private int id = 0;
   private JFrame window;
   private Timer t;
   public boolean tester = true;
   public String thingy = "";
   public int cat = 0;
   private ArrayList<Arrows> arrows;
   private int timeDiff = 0;
   private int xAddin = 0;
   private int yAddin = 0;
   private int score = 1;
   private int lives = 3;
   public PlayDanceCat(JFrame w) {
      window = w;
      t = new Timer(25, this);
      t.start();
      arrows = new ArrayList<Arrows>();
      this.addKeyListener(this);
      setFocusable(true);
      setFocusTraversalKeysEnabled(false);
   }
   
   
   public void keyPressed(KeyEvent e) {
    int key = e.getKeyCode();
    if (e.getKeyCode() == KeyEvent.VK_LEFT) {
        id = 0; 
        thingy = "SCORE: " + score;      
        cat = 1;
        if(yAddin<= 500 && yAddin >= 420 && arrows.get(0).getName().equals("left") ){
             score++;
             yAddin = 601;           
        }else{
        yAddin = 601; 
        lives--;
        }
    
    }

    if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
        id = 1;
        thingy = "SCORE: " + score ; 
        cat = 2;
        if(yAddin<= 495 && yAddin >= 435 && arrows.get(0).getName().equals("right") ){
             score++;    
             yAddin = 601;        
        }else{
        yAddin = 601;  
        lives--;
        }
    }

    if (e.getKeyCode() == KeyEvent.VK_UP) {
        id = 2;
        cat = 3;
        thingy = "SCORE: " + score;
        if(yAddin<= 540 && yAddin >= 460 && arrows.get(0).getName().equals("up") ){
             score++;     
             yAddin = 601;       
        }else{
        yAddin = 601;  
        lives--;
        }
    }

    if (e.getKeyCode() == KeyEvent.VK_DOWN) {
        id = 3;
        cat = 4;
        thingy = "SCORE: " + score;
        if(yAddin<= 525 && yAddin >= 445 && arrows.get(0).getName().equals("down") ){
             score++;     
             yAddin = 601;       
        }else{
        yAddin = 601; 
        lives--;
        }
    }
}


   public void actionPerformed(ActionEvent e){
      if(timeDiff % 180 == 0){
      try{ 
       int direction = (int)(Math.random()*4 + 1);       
         if (direction == 1) {
            UpArrow a = new UpArrow();
            yAddin = 0;            
            arrows.add(0,a);
         } else if (direction == 2) {
            RightArrow a = new RightArrow();           
            yAddin = 0;  
            arrows.add(0,a);
         } else if (direction == 3) {
           LeftArrow a = new LeftArrow();
           yAddin = 0;             
           arrows.add(0,a);
         } else {
            DownArrow a = new DownArrow();
            yAddin = 0;              
            arrows.add(0,a);
         }
         
         }catch(FileNotFoundException i) {}
         }
         timeDiff+=5;
         yAddin +=30;
         if(yAddin == 600){
            lives--;
         }
         if(lives == 0){
            t.stop();
         }       
         repaint();
         
   
   }
   
   public void keyReleased(KeyEvent e) { 
   
   }
   
   public void keyTyped(KeyEvent e) {
   
}
   public  void paintComponent(Graphics g){
      super.paintComponent(g);
      try{
         
         g.drawImage(ImageIO.read(new File("ArrowUp.png")), 0, 500, this);
         g.drawImage(ImageIO.read(new File("ArrowLeft.png")), 195, 460, this);
         g.drawImage(ImageIO.read(new File("ArrowRight.png")), 345, 455, this);
         g.drawImage(ImageIO.read(new File("ArrowDown.png")), 485, 485, this);
         Font scoreType = new Font("Serif", Font.BOLD, 25);
         g.setFont(scoreType);
         g.drawString(thingy, 1000, 800);
         g.drawString("LIVES: " + lives, 1000, 700);
         if(cat == 0 ){
         g.drawImage(ImageIO.read(new File("CatNeutralSmall.png")),750,150 ,this);
         } else if (cat == 1){
         g.drawImage(ImageIO.read(new File("CatLeftSmall.png")),740,150 ,this);
         setBackground(Color.YELLOW);
         } else if (cat == 2){
         setBackground(Color.CYAN);
         g.drawImage(ImageIO.read(new File("CatRightSmall.png")),760,150 ,this);
         } else if (cat == 3){
         setBackground(Color.GREEN);
         g.drawImage(ImageIO.read(new File("CatUpSmall.png")),750,140 ,this);
         } else{
         setBackground(Color.PINK);
         g.drawImage(ImageIO.read(new File("CatDownSmall.png")),750,160 ,this);
         }
         if(arrows.size() > 0){
            g.drawImage(arrows.get(0).getArrow(), arrows.get(0).getX(), arrows.get(0).getY(), this);
            arrows.get(0).setY(yAddin);
         }
            
        
      }
      catch(IOException e){}
         
   }
   
   public void create(){
      repaint();
   }
   
   
}