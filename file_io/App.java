import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;

class App {
  public static void main(String[] args) {
    Scanner sc = null;
    try {
      File file = new File("test.txt");
      FileInputStream fis = new FileInputStream(file);
      sc = new Scanner(fis);
      while (sc.hasNextLine()) {
        System.out.println(sc.nextLine());
      }
      // System.out.println("Enter a string: ");
      // String s = sc.nextLine();
      // System.out.println("You entered: " + s);
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("An error occurred.");
    } finally {
      if (sc != null) {
        sc.close();
      }
    }
  }
}
