  import javax.swing.*;
 
  public class SimpleDemo {
      public static void main(String[] args) throws Exception {
          SwingUtilities.invokeLater(new Runnable() {
              public void run() {
                  final JFrame frame = new JFrame();
                  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
                  JButtonPanel panel = new JPanel();
                  panel.setCyclic(true);
        
                  panel.add(new JButton("One"));
                  panel.add(new JButton("Two"));
                  panel.add(new JButton("Three"));
        
                  frame.add(panel);
                  frame.setSize(200, 200);
                  frame.setLocationRelativeTo(null);
                  frame.setVisible(true);
              }
          });
      }
  }
