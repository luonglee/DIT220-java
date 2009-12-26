
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

/**
 * A simple applet that shows six different types of border.  Also, an
 * empty border is used on the panel that is set as the content pane
 * of the applet.
 */
public class BorderDemo extends JApplet {

   JPanel content;  // The panel that will be the content panel of the applet.
   
   public void init() {
     content = new JPanel();
      content.setBackground(Color.LIGHT_GRAY);
      content.setLayout( new GridLayout(0,1,7,7) );
      content.setBorder(BorderFactory.createEmptyBorder(7,7,7,7));
      make(BorderFactory.createLineBorder(Color.RED,2),
          "BorderFactory.createLineBorder(Color.RED,2)");
      make(BorderFactory.createMatteBorder(2,2,5,5,Color.RED),
          "BorderFactory.createMatteBorder(2,2,5,5,Color.RED)");
      make(BorderFactory.createEtchedBorder(),
          "BorderFactory.createEtchedBorder()");
      make(BorderFactory.createRaisedBevelBorder(),
          "BorderFactory.createRaisedBevelBorder()");
      make(BorderFactory.createLoweredBevelBorder(),
          "BorderFactory.createLoweredBevelBorder()");
      make(BorderFactory.createTitledBorder("Title Goes Here"),
          "BorderFactory.createTitledBorder(\"Title Goes Here\")");
      setContentPane(content);
   }
   
   /**
    * Make a lable showing the string and with the specified border.
    * The label will be opaque and will have a light gray background.
    * The label is added to the content pane.
    */
   void make(Border border, String command) {
         // 
      JLabel label = new JLabel(command, JLabel.CENTER);
      label.setBackground(Color.lightGray);
      label.setOpaque(true);
      label.setBorder(border);
      content.add(label);
   }
   

} // end class 
