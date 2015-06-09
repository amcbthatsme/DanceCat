import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Intro extends JPanel implements ActionListener {
   private JFrame window;
   private JButton play;
   private JButton instruct;
   private JLabel title;
   private JPanel drawings;
   //private DrawComponents drawer;
   public Intro(){
      instruct = new JButton("Instructions");
      play = new JButton("Click Anywhere to Play DanceCat!    ");
      play.addActionListener(this);
      drawings = new JPanel();
      title = new JLabel("                                    DANCECAT");
    
   //ArrayList
   
   
   }
   public void PlayDanceCat(){
      window = new JFrame();
      window.setBackground(Color.BLACK);
      window.setForeground(Color.RED);
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setSize(new Dimension(1920,1080));
      window.setTitle("DanceCat");  
      play.setIcon(new ImageIcon("CatNeutral.png"));
      play.setBackground(Color.YELLOW);
      instruct.setBackground(Color.CYAN);
      instruct.setPreferredSize(new Dimension(250,250));
      instruct.setFont(new Font( "Serif", Font.BOLD, 24));
      play.setPreferredSize(new Dimension(125,125));
      play.setFont(new Font( "Serif", Font.BOLD, 24));
      JLabel title = new JLabel("                                    DANCECAT");
      title.setFont(new Font( "Serif", Font.BOLD, 56));
      window.add(play, BorderLayout.CENTER);
      window.add(instruct, BorderLayout.SOUTH);
      window.add(title, BorderLayout.NORTH);
      window.setVisible(true);
      //drawer = new DrawComponents();
      
      Instructions createInstructions = new Instructions(instruct, play, window);
      
   }
    
     
   public void actionPerformed(ActionEvent e){
     // DrawCat creator = new DrawCat();
      //creator.tester = false;
      //creator.create();
      //window.add(creator);
      title.setVisible(false);
      play.setVisible(false);
      instruct.setVisible(false);
      //drawer.create();
      
      PlayDanceCat player = new PlayDanceCat(window);
      window.add(player); 
      player.tester = false;
      player.create();  
   }
}
