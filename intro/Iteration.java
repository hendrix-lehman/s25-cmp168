import java.util.Scanner;

class Iteration {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // for loop
    // the for loop has 3 parts
    // 1. initialization
    // 2. condition
    // 3. increment/decrement
    for (int i = 0; i < 10; i++) { // execute the code block while the condition is true
      System.out.println(i);
    } // end for loop

    // for each loop
    // the for each loop is used to iterate over arrays and collections
    int[] numbers = { 1, 2, 3, 4, 5 };
    for (int number : numbers) { // for each item in the array execute the code block
      System.out.println(number);
    } // end for each loop

    // while loop
    // while loops usually need a sentinel value to stop
    int num = 0;
    while (num < 10) { // execute the code block while the condition is true
      System.out.println(num);
      num++;
    } // end while loop

    // do while loop
    // do while loops execute the code block at least once
    int num2 = 0;
    do { // execute the code block at least once
      System.out.println(num2);
      num2++;
    } while (num2 < 10); // execute the code block while the condition is true

    // break statement
    while (true) {
      System.out.println("Enter a number: ");
      int input = scanner.nextInt();
      if (input == 0) {
        break; // exit the loop
      }
    } // end while loop

    // continue statement
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        continue; // skip the rest of the code block and go to the next iteration
      }
      // continue means to skip anything statements below it
      System.out.println(i);
    } // end for loop

    scanner.close(); // release the resources used by the scanner
  }
}
