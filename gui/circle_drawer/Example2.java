import javax.swing.JPanel;
import javax.swing.JFrame;

class Example2 extends JPanel {

  public Example2() {
    addMouseListener(new CircleDrawerAdapter());
  }

  public static void main(String[] args) {

    JFrame frame = new JFrame("Example 2");
    Example2 example = new Example2();
    frame.add(example);
    frame.setSize(400, 400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

  }
}
