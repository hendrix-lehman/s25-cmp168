import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;

class HomeScreen extends JFrame {

  public HomeScreen() {
    setTitle("Home Screen");
    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    add(new Home(), BorderLayout.CENTER);

    setVisible(true);
  }

}
