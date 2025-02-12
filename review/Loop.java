class Loop {

  public static void main(String[] args) {

    int a; // a is NOT an array
    int[] b; // b is an array

    // variable a can ONLY hold one value
    a = 5;
    a = 10;
    a = 15;

    // variable b can hold multiple values (an array).
    b = new int[3]; // size of the array is 3
    // so, b can hold 3 values
    // knowing that b is an array of size 3
    // now I can store values in the array at each index
    // array's index starts at 0
    // and ends at size - 1
    b[0] = 5; // assign 5 to the first index
    b[1] = 10;
    b[2] = 15; // assign 15 to the last index

    // so, how would you sum all the values in the array?
    // one naive way is to add them manually
    // int sum = b[0] + b[1] + b[2];

    // we can do better by using a loop
    int sum = 0;
    for (int i = 0; i < b.length; i++) {
      sum += b[i];
    }

    // myArray = {45, 22, 18, 89, 82, 79, 15, 69, 100, 55, 48, 72, 16, 98, 57, 75,
    // 44, 32, 21, 14, 7, 16, 49, 58, 72}

    // myArray = {72, 45, 22, 18, 89, 82, 79, 15, 69, 100, 55, 48, 72, 16, 98, 57,
    // 75, 44, 32, 21, 14, 7, 16, 49, 58}

    // for example if int[] b = {5, 10, 15}, the rotated array to the right once
    // would be {5, 10, 15}
    // so, how would you rotate the array to the right once?

    for (int i = 0; i < b.length - 1; i++) {
      int temp = b[i];
      b[i] = b[i + 1];
      b[i + 1] = temp;
    }

    // we can assign values to the array using the index

    // declare an array of integers
    int[] numbers;
    // assign variable to an array of integers of size 5. Meaning the array can hold
    // 5 integers
    numbers = new int[5]; // size of the array is 5

    // assign values to the array
    // numbers[-1] = 5; // this is an ArrayIndexOutOfBoundsException
    numbers[0] = 92; // first index is ALWAYS 0
    numbers[1] = 42;
    numbers[2] = 56;
    numbers[3] = 78;
    numbers[4] = 12; // last index is ALWAYS size - 1

    // for loop
    // for (int i = 0; i < numbers.length; i++) {
    // System.out.println(numbers[i]);
    // }

    // for each loop
    for (int number : numbers) {
      System.out.println(number);
    }

  }
}
