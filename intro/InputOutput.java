import java.util.Scanner;

class InputOutput {

  public static void main(String[] args) {

    // The Scanner class is a helper class that allows us to read input from the
    // user keyboard.
    // System.in is a special object that represents the keyboard.
    Scanner scanner = new Scanner(System.in);

    // Prompt the user for an input.
    // In this case, we are asking for the user's name.
    System.out.print("Enter your name: ");

    // Read the user's input.
    // nextLine() is a method that reads a line of text from the keyboard.
    String name = scanner.nextLine();

    int num = 5;

    // printf is a method that allows us to print formatted text.
    // the order of the arguments must match the order of the format specifiers.
    System.out.printf("Hello, %s! Your lucky number is %d\n", name, num);
    // System.out.println("Hello, " + name + "!");

  }
}
