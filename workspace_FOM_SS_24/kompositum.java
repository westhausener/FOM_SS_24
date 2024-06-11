import javax.swing.*;
import java.awt.FlowLayout;

public class KompositumTest extends JFrame{
   public static void main (String[] args){
      new KompositumTest("Hauptfenster");
   }
   public KompositumTest(String titel){   
      // Für JFrame wird die Container-Funktionalität genutzt.
      super(titel);
      JLabel label = new JLabel ("Name:");
      JTextField textfield = new JTextField (20);
      JButton button = new JButton ("uebernehmen");
      setLayout (new FlowLayout());
      // Dem Hauptfenster werden durch Aufruf der Methode add() die
      // anderen GUI-Komponenten hinzugefügt.
      add (label);
      add (textfield);
      add (button);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      pack();
      setVisible(true);
   }
}
