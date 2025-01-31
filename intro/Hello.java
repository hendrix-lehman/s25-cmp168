class Hello {

  // entry-point of a Java program
  public static void main(String[] args) {

    // body of the main method
    System.out.println("Hello, World!");

    // when your program is run, memory is allocated to store the data
    // this memory is broken into two parts: stack and heap
    // primitive variables are stored in the stack
    // the stack is basically a memory address where the data is stored
    //
    // reference variables are stored in the heap
    // the heap is a memory address that points to the actual data
    // [stack] -> [heap]

    // primitive variables
    int favoriteNumber = 42; // initialize and assign a value

    int num; // initialize only, therefore by default, the value is 0

    char letter = 'A';
    letter = 'B';
    boolean isJavaFun = true;
    double decimal = 3.14;

    // reference variables
    String name; // by default, the value is null
    name = "Alice";
    System.out.println(name.charAt(0)); // A

    // overflow int data type
    int maxInt = Integer.MAX_VALUE;
    System.out.println(maxInt); // 2147483647
    maxInt = maxInt + 1;
    System.out.println(maxInt); // -2147483648

    // casting
    int a = 10;
    int b = 3;
    double c = (double) a / b; // to avoid losing the remainder,
                               // cast one of the variables to a double
                               // 10.0 / 3 = 3.3333333333333335

  }
}
