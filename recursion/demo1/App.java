class App {
  private int num = 0;

  public App(int num) {
    this.num = num;  
  }

  public void printNum() {
    //while(true){
      System.out.println("num = " + num);
    //}
    printNum();
  }

  public int add(int a, int b) {
    //return a + b;
    return add(a, b);
  }

  public int triple() {
    return num * 3;  
  }

  public static void main(String[] args) {

    App app = new App(5);
    app.printNum();

    app.triple();

  }
    
}  
