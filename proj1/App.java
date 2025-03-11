import java.util.Scanner;

class App {
  public static void main(String[] args) {
    Person p1 = new Person("Alice", 25, "123 Main St.");
    Person p2 = new Person("Alice", 25, "123 Main St.");
    Person p3 = new Person("Bob", 30, "456 Elm St.");

    System.out.println("hashCode of p1: " + p1.hashCode());
    System.out.println("hashCode of p2: " + p2.hashCode());
    System.out.println("hashCode of p3: " + p3.hashCode());

    System.out.println(p1.equals(p2)); // true
    System.out.println(p1.equals(p3)); // false

    Car c1 = new Car(1, 25, "red");
    Car c2 = new Car(4, 125, "blue");

    p1.addCar(c1);
    p1.addCar(c2);

    System.out.println(p1.getCarCount()); // 2

    // ask user for input, how many cars would you like to add?
    System.out.println("How many cars would you like to add?");
    Scanner scanner = new Scanner(System.in);
    int numCars = scanner.nextInt();

  }
}
