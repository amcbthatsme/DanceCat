import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GoHome implements ActionListener{

   private JButton back;
   private JFrame window;
   private Intro play;
   public GoHome(JButton back, JFrame window){
      this.back = back;
      this.window = window;
      play = new Intro();
      back.addActionListener(this);
   }
   
   public void actionPerformed(ActionEvent e){
      play.PlayDanceCat();
   }
   
}


