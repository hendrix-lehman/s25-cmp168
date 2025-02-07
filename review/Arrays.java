class Arrays {

  // print array
  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  // swap two elements in an array
  public static void swap(int[] arr, int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }

  // copy an array
  public static int[] copyArray(int[] arr, boolean doubleSize) {
    int[] copy;

    if (doubleSize) {
      copy = new int[arr.length * 2];
    } else {
      copy = new int[arr.length];
    }

    for (int i = 0; i < arr.length; i++) {
      copy[i] = arr[i];
    }
    return copy;
  }

  public static void main(String[] args) {

    // declare an array of integers AND assigned a group of values or integers
    // therefore, we know the size of the array is 5
    // array starts at index 0 and ends at index 4
    int[] numbers = { 1, 2, 3, 4, 5 };
    // same as above but with a different data type
    String[] names = { "John", "David", "Sarah", "Alice", "Kate" };

    double[] decimals = { 1.1, 2.2, 3.3, 4.4, 5.5 };

    // another way to declare an array
    // this time we declare an array of integers with a size of 5
    int[] numbers2 = new int[5]; // [0, 0, 0, 0, 0] because the default value of an integer is 0

    String[] names2 = new String[5]; // [null, null, null, null, null] because the default value of a string is null

    Person[] people = new Person[5]; // [null, null, null, null, null] because the default value of a Person object
                                     // is null

    // assign values to the array
    numbers2[0] = 1; // [1, 0, 0, 0, 0]
    numbers2[1] = 2; // [1, 2, 0, 0, 0]

    names2[0] = "John"; // ["John", null, null, null, null]
    names2[1] = "David"; // ["John", "David", null, null, null]

    people[0] = new Person("John", 25); // [Person("John", 25), null, null, null, null]
    people[1] = new Person("David", 30); // [Person("John", 25), Person("David", 30), null, null, null]

    // access the values of the array
    // System.out.println(numbers2[0]); // 1
    // System.out.println(numbers2[1]); // 2

    // if I try to access an index that is out of bounds, I will get an
    // ArrayIndexOutOfBoundsException
    // System.out.println(numbers2[5]); // ArrayIndexOutOfBoundsException

    printArray(numbers);
    swap(numbers, 0, 4);
    System.out.println("----------");
    printArray(numbers);

    int[] copy = copyArray(numbers, true);

    // arrays cannot be copied by assignment
    // int[] copy = numbers;

    System.out.println("----------");
    printArray(copy);
  }
}
