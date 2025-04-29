class App {
  public static void main(String[] args) {
    // two-dimensional array of chars
    char[][] arr = {
        { 'x', 'b', 'c' },
        { 'd', 'e', 'x' },
        { 'g', 'x', 'i' }
    };

    // on way to think about countGrid logic

    // loop through the array, and print only the x's
    for (int row = 0; row < arr.length; row++) { // loop through the rows

      for (int col = 0; col < arr[row].length; col++) { // loop through the columns

        // check previous row
        int prevRow = row - 1;
        int prevCol = col - 1;
        System.out.println("Row: " + row + ", Col: " + col);
        System.out.println("Prev Row: " + prevRow + ", Prev Col: " + prevCol);

        if (prevRow >= 0 && (prevCol >= 0 && prevCol < arr[prevRow].length - 1 )) { // check if previous row and column are in bounds
          System.out.println(arr[prevRow][prevCol]);
        }

        


        // check neighboring elements, avoid out of bounds

        // at each element, check if it is an x

        // if it is, add it to a counter

      }
    }


    // another way, is to just add or subtract 1 from the current index to check the neighbors


  }
}


