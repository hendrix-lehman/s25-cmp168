class Volvo extends Car {
  private int trimLevel = 3;

  public int getTrimLevel() {
    return trimLevel;
  }

  public void run() {
    super.run();
    System.out.println("Volvo is running");
  }

  public String toString() {
    return "Volvo";
  }
}
