import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Instructions implements ActionListener{
   private JButton instruct;
   private JFrame window;
   private JButton play;
   public Instructions(JButton ins,JButton pl, JFrame win){
      instruct = ins;
      window = win;
      play = pl;
      instruct.addActionListener(this);
      instruct.setBackground(Color.CYAN);
      instruct.setPreferredSize(new Dimension(250,250));
      instruct.setFont(new Font( "Serif", Font.BOLD, 24));
      }
   public void actionPerformed(ActionEvent e){
      play.setVisible(false);
      instruct.setVisible(false); 
      JLabel instructer = new JLabel("<html>DanceCat is based off of the popular game<BR>Dance Dance Revolution.<BR>You will see several falling arrows.<BR>When a falling arrow reaches its stationary arrow outline,<BR>press the corresponding arrow key on your keyboard.</html>");
      instructer.setFont(new Font( "Serif", Font.BOLD, 53));       
      window.add(instructer, BorderLayout.CENTER);
      instructer.setVisible(true);
      JButton back = new JButton("Back to Home");
      back.addActionListener(this);
      back.setVisible(true);
      back.setPreferredSize(new Dimension(125,125));
      back.setBackground(Color.ORANGE);
      window.add(back, BorderLayout.SOUTH);
      back.setFont(new Font( "Serif", Font.BOLD, 53));
      GoHome home = new GoHome(back, window);
      }
}
   