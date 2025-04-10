import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;

class Home extends JPanel {
  private JButton button1;
  private JButton button2;
  private JButton button3;
  private JButton button4;

  public Home() {
    setLayout(new GridLayout(2, 2));

    ButtonListener buttonListener = new ButtonListener();

    // creating buttons
    button1 = new JButton("Button 1");
    button2 = new JButton("Button 2");
    button3 = new JButton("Button 3");
    button4 = new JButton("Button 4");

    // adding action listeners to buttons
    button1.addActionListener(buttonListener);
    button2.addActionListener(buttonListener);
    button3.addActionListener(buttonListener);
    button4.addActionListener(buttonListener);

    add(button1);
    add(button2);
    add(button3);
    add(button4);
  }
}
