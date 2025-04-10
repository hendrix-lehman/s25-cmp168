import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

class HomeScreen extends JFrame {
  private JButton button1;
  private JButton button2;
  private JButton button3;

  public HomeScreen() {
    setTitle("Home Screen");
    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());

    button1 = new JButton("Button 1");
    button2 = new JButton("Button 2");
    button3 = new JButton("Button 3");

    add(button1);
    add(button2);
    add(button3);

    setVisible(true);
  }

}
