import java.util.Scanner;

class DecisionBranches {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // System.out.print("Favorite number: ");

    // int favoriteNumber = scanner.nextInt();
    //
    // // the expression within the parentheses is called a condition
    // // while that condition is true, the code within the braces will be executed
    // while (favoriteNumber < 0) {
    // System.out.print("Please enter a number greater than zero: ");
    // favoriteNumber = scanner.nextInt();
    // }

    // int favoriteNumber;
    // do {
    // System.out.print("Favorite number (must be greater than zero): ");
    // favoriteNumber = scanner.nextInt();
    // } while (favoriteNumber < 0); // checking the condition
    //
    // if (favoriteNumber % 2 == 0) { // it checks first condition
    // System.out.println("Your favorite number is even.");
    // } else if (favoriteNumber == 7) { // it checks second condition
    // System.out.println("Sweet! My favorite number is 7 too!");
    // } else { // if no condition is true, this block will be executed
    // System.out.println("Your favorite number is odd.");
    // }

    // checking equality of two strings
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    if (name.toLowerCase().equals("hendrix")) {
      System.out.println("Hey, that's my name too!");
    } else {
      System.out.println("Nice to meet you, " + name + "!");
    }

    scanner.close(); // release the resources used by the scanner
  }
}
