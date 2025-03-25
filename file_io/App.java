import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;

class App {

  public static void keyboardInput() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String s = sc.nextLine();
    System.out.println("You entered: " + s);
    sc.close();
  }

  public static void fileInput() {
    Scanner sc = null;
    try {
      File file = new File("./test.txt");
      if (file.exists() && file.canRead() && file.isFile()) {
        FileInputStream fis = new FileInputStream(file);
        sc = new Scanner(fis);
        while (sc.hasNextLine()) {
          System.out.println(sc.nextLine());
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("An error occurred.");
    } finally {
      if (sc != null) {
        sc.close();
      }
    }
  }

  public static void outputToConsole() {
    System.out.println("Hello, World!");
  }

  public static void outputToFile() {
    FileOutputStream fos = null;
    try {
      File file = new File("./output.txt");
      if (file.exists() && file.canWrite() && file.isFile()) {
        System.out.println("File exists and is writable.");
        fos = new FileOutputStream(file);
        fos.write("Hello, World!".getBytes());
        fos.close();
      } else {
        System.out.println("File does not exist or is not writable.");
        file.createNewFile();
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("An error occurred.");
    } finally {
      if (fos != null) {
        try {
          fos.close();
        } catch (Exception e) {
        }
      }
    }
  }

  public static void appendToFile() {
    PrintWriter pw = null;
    // FileOutputStream fos = null;
    try {
      File file = new File("./output.txt");
      if (file.exists() && file.canWrite() && file.isFile()) {
        System.out.println("File exists and is writable.");
        // fos = new FileOutputStream(file);
        pw = new PrintWriter(file);
        pw.append("Hello, World!\n");
        pw.append("next line\n");
        pw.flush();
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("An error occurred.");
    } finally {
      // if (fos != null) {
      // try {
      // fos.close();
      // } catch (Exception e) {
      // }
      // }
      if (pw != null) {
        pw.close();
      }
    }
  }

  public static void copyFile() {
    FileInputStream fis = null;
    FileOutputStream fos = null;
    try {
      File file = new File("./output.txt");
      if (file.exists() && file.canRead() && file.isFile()) {
        fis = new FileInputStream(file);
        fos = new FileOutputStream("./output_copy.txt");
        int b;
        while ((b = fis.read()) != -1) {
          fos.write(b);
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("An error occurred.");
    } finally {
      if (fis != null) {
        try {
          fis.close();
        } catch (Exception e) {
        }
      }
      if (fos != null) {
        try {
          fos.close();
        } catch (Exception e) {
        }
      }
    }
  }

  public static void deleteFile() {
    File file = new File("./output_copy.txt");
    if (file.exists() && file.isFile()) {
      file.delete();
    }
  }

  public static void main(String[] args) {
    // keyboardInput();
    // fileInput();
    // outputToConsole();
    // outputToFile();
    // appendToFile();
    // copyFile();
    deleteFile();
  }
}
