class Loop {

  public static void main(String[] args) {
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
