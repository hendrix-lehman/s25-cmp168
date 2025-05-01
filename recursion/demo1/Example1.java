class Example1 {

  public void iterative() {

    for(int i = 3; i > 0; i--) {
      System.out.println(i);
    }

    System.out.println("Hooray!");

  }

  public void recursive(int count) {

    if(count == 0) { // base case
      System.out.println("Hooray!");
    } else {
      System.out.println(count);
      recursive(count - 1);
    }

  }

  public static void main(String[] args) {

    Example1 app = new Example1();
    app.iterative();

    app.recursive(3);

  }

}
