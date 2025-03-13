import java.util.Scanner;

class App {

  // this is up to us developers to prevent StackOverflowError like this from
  // happening
  public void recursiveMethod() {
    recursiveMethod();
  }

  // this type of Exception can be prevented by checking if the object is null
  public void method(Object obj) {
    // prevention by checking if the object is null
    // if (obj == null) {
    // System.out.println("Object is null");
    // return;
    // }
    recursiveMethod();
    System.out.println(obj.toString());
    System.out.println("method completed");
  }

  public static void main(String[] args) {

    // let's try to create a statement that will throw an exception
    // ask user for number to select from an array
    // Scanner scanner = new Scanner(System.in);
    // System.out.println("Enter a number to select from an array");
    // int number = scanner.nextInt();

    // int[] numbers = { 8, 5, 9 };
    // while (number < 0 || number >= numbers.length) {
    // System.out.println("Invalid number. Enter a number to select from an array");
    // number = scanner.nextInt();
    // }
    // System.out.println(numbers[number]);

    App app = new App();
    // app.recursiveMethod();
    try {
      app.method(null);
    } catch (Throwable e) {
      System.out.println("Array index out of bounds exception");
      e.printStackTrace();
    }
    System.out.println("After the exception");
  }
}
