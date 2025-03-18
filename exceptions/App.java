import java.util.Scanner;

class App {

  // this is up to us developers to prevent StackOverflowError like this from
  // happening
  public void recursiveMethod() {
    recursiveMethod();
  }

  // this type of Exception can be prevented by checking if the object is null
  public void method(Object obj, int index) throws MyException {
    // prevention by checking if the object is null
    // if (obj == null) {
    // System.out.println("Object is null");
    // return;
    // }
    // try {
    // recursiveMethod();
    if (obj == null) {
      throw new MyException("Object is null");
    }
    System.out.println(obj.toString());

    // this will throw an ArrayIndexOutOfBoundsException
    if (index < 0 || index >= 3) {
      throw new MyException("Array index out of bounds exception");
    }
    int[] numbers = { 8, 5, 9 };
    System.out.println(numbers[index]);

    // } catch (Throwable e) {
    // throw new MyException("something went wrong");
    // }

    System.out.println("method completed");
  }

  public static void main(String[] args) {

    // let's try to create a statement that will throw an exception
    // ask user for number to select from an array
    Scanner scanner = new Scanner(System.in);
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
      app.method(1, 3);
    } catch (MyException e) {
      System.out.println(e.getMessage());
      // } catch (StackOverflowError e) {
      // System.out.println("Stack overflow error");
      // return;
      // } catch (NullPointerException e) {
      // // System.out.println("Array index out of bounds exception");
      // // e.printStackTrace();
      // System.out.println("Object is null");
      // return;
      // } catch (ArrayIndexOutOfBoundsException e) {
      // System.out.println("Array index out of bounds exception");
      // return;
      // } catch (Exception e) {
      // System.out.println("An exception occurred");
      // return;
      // } catch (Error e) {
      // System.out.println("An error occurred");
      // } catch (Throwable e) {
      // System.out.println("An error occurred");
      // return;
    } finally {
      scanner.close();
      System.out.println("Finally block executed");
    }
    System.out.println("This application ended normally");
  }
}
