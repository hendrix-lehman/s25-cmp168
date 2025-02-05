import java.util.Scanner;

class Methods {

  // this method is public. It can be called from anywhere.
  // it returns an integer.
  // it has 2 parameters: a Scanner object and a String.
  public int askUserForAnInteger(Scanner scanner, String prompt) {
    System.out.print(prompt);
    int userInput = scanner.nextInt();
    return userInput;
  }

  public void printMessage(String message) {
    System.out.println(message);
  }

  public static void main(String[] args) {

    // creating an instance of the Methods class
    // obj is an object of the Methods class
    Methods obj = new Methods();
    Scanner scanner = new Scanner(System.in);

    // calling the method askUserForAnInteger
    // we must pass in a Scanner object and a String
    // we are capturing the return value in a variable named favoriteNumber
    int favoriteNumber = obj.askUserForAnInteger(scanner, "What is your favorite number? ");
    obj.printMessage("Your favorite number is " + favoriteNumber);

    int age = obj.askUserForAnInteger(scanner, "What is your age? ");
    obj.printMessage("Your age is " + age);

    scanner.close(); // release the resources used by the scanner

  }
}
