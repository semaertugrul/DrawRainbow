package DrawRainbow;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
/**
 *
 * @author sema
 */
public class DrawRainbow extends JPanel{
    
    private final static Color VIOLENT= new Color(128,0,128);
    private final static Color INDIGO = new Color(75,0,130);
    
    private Color [] colors = {Color.WHITE,Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED , Color.BLUE,VIOLENT,INDIGO};
    
    public DrawRainbow(){
    
    setBackground(Color.WHITE);
    
    }
            
    public void paintComponent(Graphics g){
    
        super.paintComponent(g);
        
        int radius = 20;
           int centerX = getWidth() / 2; //use half width
           int centerY = getHeight() - 10;//shift from bottom to top  10
            for (int counter = colors.length; counter > 0; counter--){
                g.setColor(colors[counter - 1]);
                 g.fillArc(centerX - counter * radius, centerY - counter * radius, counter * radius * 2, counter * radius * 2, 0, 180 );
            }
             
    
    }
    
}
