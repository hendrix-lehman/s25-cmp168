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

  // method overloading
  // printValue method has 3 versions
  // the method signature is different for each version
  // one version takes an int as a parameter
  // another version takes a double as a parameter
  // another version takes a String as a parameter

  // passing primitive data type (int) as a parameter
  public void printValue(int value) {
    // changing the value of the parameter
    value = 200;
    // does not change the value of the argument

    System.out.println(value);
  }

  public void printValue(double value) {
    System.out.println(value);
  }

  public void printValue(String value) {
    System.out.println(value);
  }

  public void sayHello() {
    System.out.println("Hello");
  }

  public void sayHello(String name) {
    System.out.println("Hello " + name);
  }

  public void sayHello(String name, int age) {
    System.out.println("Hello " + name + " you are " + age + " years old");
  }

  public void sayHello(int age, String name) {
    System.out.println("Hello " + name + " you are " + age + " years old");
  }

  /*
   * if a program calls the sayHello method with a String and an int argument like
   * this:
   * sayHello("Alice", 10); // it knows which version of the method to call
   * 
   * if a program calls the sayHello method with an int and a String argument like
   * this:
   * sayHello(10, "Alice"); // it knows which version of the method to call
   * 
   */

  // passing an object as a parameter
  public void printPerson(Person a_person) {
    a_person.name = "John";
    System.out.println(a_person.name);
  }

  public static void main(String[] args) {

    // creating an instance of the Methods class
    // obj is an object of the Methods class
    Methods obj = new Methods();
    Scanner scanner = new Scanner(System.in);

    // calling the method askUserForAnInteger
    // we must pass in a Scanner object and a String
    // we are capturing the return value in a variable named favoriteNumber
    // int favoriteNumber = obj.askUserForAnInteger(scanner, "What is your favorite
    // number? ");
    // obj.printMessage("Your favorite number is " + favoriteNumber);

    // int age = obj.askUserForAnInteger(scanner, "What is your age? ");
    // obj.printMessage("Your age is " + age);

    // calling the method printValue
    // we are passing in an integer value
    int number = 100;
    obj.printValue(number);
    // the value of number is still 100
    System.out.println("Number is still " + number);

    // creating an instance of the Person class
    Person person = new Person("Alice", 10);
    // calling the method printPerson
    // we are passing in an object of the Person class
    obj.printPerson(person);
    // the name of the person object has been changed to John
    System.out.println("Name of the person object is " + person.name);

    // call overloaded method printValue with a double value
    obj.printValue(3.14);

    obj.printValue("Hello");

    scanner.close(); // release the resources used by the scanner

  }
}
