package DrawRainbow;

import javax.swing.JFrame;
/**
 *
 * @author sema
 */
public class DrawRainbowTest {
    
     public static void main(String[] args) {
      DrawRainbow panel = new DrawRainbow();
      JFrame app = new JFrame();
      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      app.add(panel);
      app.setSize(300,300);
      app.setVisible(true);
     
     
     }
    
}
