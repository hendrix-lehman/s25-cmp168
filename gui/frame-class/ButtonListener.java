import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class ButtonListener implements ActionListener {

  @Override
  public void actionPerformed(ActionEvent e) {
    // System.out.println(buttonName + " clicked");
    String command = e.getActionCommand();
    // this if helps us to identify which button was clicked
    // and create a different action for each button
    if (command.equals("Button 1")) {
      /// add code that responds to the button1 click
      System.out.println("Button 1 clicked");

    } else if (command.equals("Button 2")) {
      System.out.println("Button 2 clicked");
    } else if (command.equals("Button 3")) {
      System.out.println("Button 3 clicked");
    } else if (command.equals("Button 4")) {
      System.out.println("Button 4 clicked");
    } else {
      System.out.println("Unknown button clicked");
    }
  }
}
