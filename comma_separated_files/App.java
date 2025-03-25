import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


class App {

  public static void readFile(File file) {
    Scanner scanner = null;
    try {
      scanner = new Scanner(file);
      int count = 0;
      while (scanner.hasNextLine()) {
        if (count == 0) {
          count++;
          scanner.nextLine();
          continue;
        }
        String line = scanner.nextLine();
        String[] data = line.split(",");

        for(int i=0; i < data.length; i++) {
          System.out.println(data[i]);
        }

//        System.out.println(line);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } finally {
      if (scanner != null) {
        scanner.close();
      }
    }
  }

  public static void main(String[] args) {
    File file = new File("courses.dat");
    readFile(file);
  }
}

