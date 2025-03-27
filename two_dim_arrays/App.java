class App {
  public static void main(String[] args) {

    // simple array
    int[] numbers = {1, 2, 3, 4, 5}; // array of 5 elements. Organized using index starting from 0
    // 1 -> index 0, 2 -> index 1, 3 -> index 2, 4 -> index 3, 5 -> index 4
    // the length of the array is 5 however the index of the last element is 4

    // access array element
    System.out.println(numbers[0]); // 1

    // change array element
    numbers[0] = 10;
    System.out.println(numbers[0]); // 10

    // create array of different data types like String
    String[] names = {"John", "Doe", "Jane"};
    // "John" -> index 0, "Doe" -> index 1, "Jane" -> index 2

    // access array element
    System.out.println(names[0]); // John

    // change array element
    names[0] = "Alice";
    System.out.println(names[0]); // Alice

    // navigate through array
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }


    // two dimensional array is an array of arrays
    int[][] matrix = {
      {1, 2, 3}, // array of 3 elements. 1 -> index 0, 2 -> index 1, 3 -> index 2
      {4, 5, 6}, // array of 3 elements. 4 -> index 0, 5 -> index 1, 6 -> index 2
      {7, 8, 9} // array of 3 elements. 7 -> index 0, 8 -> index 1, 9 -> index 2
    }; // array of 3 arrays. Each array has 3 elements

    // access array element
    System.out.println(matrix[0][0]); // 1. The index of first array is 0 and the index of first element in that array is 0

    System.out.println(matrix[1][2]); // 6. The index of second array is 1 and the index of third element in that array is 2


    // change array element
    matrix[0][0] = 10;
    System.out.println(matrix[0][0]); // 10

    matrix[1][2] = 60;
    System.out.println(matrix[1][2]); // 60

    int[] arrayAtIndexZero = matrix[0]; // access array at index 0
    System.out.println(arrayAtIndexZero[0]); // 10

    arrayAtIndexZero[0] = 100;
    System.out.println(arrayAtIndexZero[0]); // 100

    System.out.println(matrix[0][0]); // 100

    // navigate through two dimensional array
    for (int i = 0; i < matrix.length; i++) { // outer loop is to navigate each array in the two dimensional array
      for (int j = 0; j < matrix[i].length; j++) { // inner loop is to navigate each element in the array
        System.out.println(matrix[i][j]);
      }
    } // i is each row, j is each column

    // arrays in two dimensional array can have different lengths
    int[][] matrix2 = {
      {1, 2, 3}, // array of 3 elements
      {4, 5}, // array of 2 elements
      {6, 7, 8, 9} // array of 4 elements
    };

    // the first array has 3 elements, the second array has 2 elements, the third array has 4 elements
    System.out.println(matrix2[0][2]); // 3
    System.out.println(matrix2[1][1]); // 5
    System.out.println(matrix2[2][3]); // 9

    // navigate through two dimensional array
    for (int row = 0; row < matrix2.length; row++) {
      for (int col = 0; col < matrix2[row].length; col++) {
        System.out.println(matrix2[row][col]);
      }
    }


  }
}
