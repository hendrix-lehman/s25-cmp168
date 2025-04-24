import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Game extends JFrame {

  // 2D array with questions and answers
  private String[][] questions = {
      { "What is the capital of France?", "Paris" },
      { "What is the largest planet in our solar system?", "Jupiter" },
      { "What is the chemical symbol for gold?", "Au" },
      { "Who wrote 'Romeo and Juliet'?", "William Shakespeare" },
      { "What is the square root of 64?", "8" }
  };

  // list of wrong answers
  private String[] wrongAnswers = {
      "London", "Mars", "Ag", "Charles Dickens", "6", "10"
  };

  // constructor
  public Game() {
    setTitle("Quiz Game");
    setSize(400, 300);

    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());

    // get a random question
    String[] question = getRandomQuestion();
    JLabel questionLabel = new JLabel(question[0]);
    questionLabel.setFont(questionLabel.getFont().deriveFont(24f));
    questionLabel.setHorizontalAlignment(SwingConstants.CENTER);
    panel.add(questionLabel, BorderLayout.NORTH);

    // panel for answers
    JPanel answerPanel = new JPanel();
    JButton correctButton = new JButton(question[1]);
    JButton wrongButton = new JButton(getRandomWrongAnswer());

    addButtons(answerPanel, correctButton, wrongButton);

    panel.add(answerPanel, BorderLayout.CENTER);

    add(panel);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  // select a random wrong answer
  public String getRandomWrongAnswer() {
    int randomIndex = (int) (Math.random() * wrongAnswers.length);
    return wrongAnswers[randomIndex];
  }

  // randomly add two buttons to the panel
  public void addButtons(JPanel panel, JButton correctButton, JButton wrongButton) {
    // add buttons in random order
    if (Math.random() < 0.5) {
      panel.add(correctButton);
      panel.add(wrongButton);
    } else {
      panel.add(wrongButton);
      panel.add(correctButton);
    }
  }

  // randomly select a question array
  public String[] getRandomQuestion() {
    int randomIndex = (int) (Math.random() * questions.length);
    return questions[randomIndex];
  }

  // verify the answer
  public boolean verifyAnswer(String question, String answer) {
    for (String[] q : questions) {
      if (q[0].equals(question)) {
        return q[1].equalsIgnoreCase(answer);
      }
    }
    return false;
  }

  // named inner adapter class to handle button clicks
  class ButtonClickListener implements ActionListener {
    private String question;
    private String answer;

    public ButtonClickListener(String question, String answer) {
      this.question = question;
      this.answer = answer;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if (verifyAnswer(question, answer)) {
        JOptionPane.showMessageDialog(null, "Correct!");
      } else {
        JOptionPane.showMessageDialog(null, "Wrong!");
      }
    }
  }

}
