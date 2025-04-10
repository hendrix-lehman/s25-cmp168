import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

class Demo {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Demo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();
    panel.setBackground(Color.RED);

    JLabel label = new JLabel("Hello, World!");
    label.setFont(new Font("Arial", Font.PLAIN, 24));
    label.setForeground(Color.BLUE);
    // label.setHorizontalAlignment(SwingConstants.CENTER);
    // label.setPreferredSize(new Dimension(200, 50));
    panel.add(label);

    frame.add(panel);

    frame.pack();
    frame.setVisible(true);
  }
}
