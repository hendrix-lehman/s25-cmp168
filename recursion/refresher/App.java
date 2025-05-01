
class App {
  private int num = 0;
  private int num2 = 0;

  public App(int a) {
    num = a;
  }

  public int getNum() {
    return num;
  }

  // public void setNum(int n) {
  // num = n;
  // }

  private void printMessage(int a, int b) {
    System.out.println("Adding two numbers");
    System.out.println("a: " + a);
    System.out.println("b: " + b);
  }

  public int add(int a, int b) {
    a = 5;
    printMessage(a, b);
    // System.out.println("Adding two numbers");
    // System.out.println("a: " + a);
    // System.out.println("b: " + b);
    return a + b;
  }

  public int add(App a, int b) {
    printMessage(a.getNum(), b);
    // a.setNum(5);
    // System.out.println("Adding two numbers");
    // System.out.println("a: " + a.getNum());
    // System.out.println("b: " + b);
    return a.getNum() + b;
  }

  public static void main(String[] args) {
    App app = new App(2);

    int x = 2;
    int result = app.add(x, 5);
    System.out.println("sum = " + result);
    System.out.println("x = " + x);

    // using a reference type
    // app.setNum(2);
    result = app.add(app, 5);
    System.out.println("sum = " + result);
    System.out.println("app.num = " + app.getNum());

    result = app.add(3, 4);
    System.out.println("sum = " + result);

    result = app.add(8, 2);
    System.out.println("sum = " + result);

    result = app.add(1, 7);
    System.out.println("sum = " + result);

    result = app.add(6, 2);
    System.out.println("sum = " + result);

  }
}

/**
 * behind the scene java is placing each method call into a stack
 * 
 * 
 * 
 * 
 **/
