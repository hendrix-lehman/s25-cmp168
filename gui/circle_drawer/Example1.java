import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

class Example1 extends JPanel implements MouseListener {

  private Color shapeColor = Color.BLUE;
  private int drawingSize = 20;
  private int lastX = 0;
  private int lastY = 0;

  public Example1() {
    addMouseListener(this);
  }

  @Override
  public void mouseClicked(java.awt.event.MouseEvent e) {
  }

  @Override
  public void mouseReleased(java.awt.event.MouseEvent e) {
  }

  @Override
  public void mouseEntered(java.awt.event.MouseEvent e) {
  }

  @Override
  public void mouseExited(java.awt.event.MouseEvent e) {
  }

  @Override
  public void mousePressed(java.awt.event.MouseEvent e) {
    lastX = e.getX();
    lastY = e.getY();

    Graphics g = getGraphics();
    Graphics2D g2d = (Graphics2D) g;
    g2d.setColor(shapeColor);
    g2d.fillOval(lastX - drawingSize / 2, lastY - drawingSize / 2, drawingSize, drawingSize);
  }

  public static void main(String[] args) {

    javax.swing.JFrame frame = new javax.swing.JFrame("Example 1");
    Example1 example = new Example1();
    frame.add(example);
    frame.setSize(400, 400);
    frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

  }
}
