class Volvo extends Car {
  private int trimLevel = 3;

  class Radio {
    public void play() {
      trimLevel = 4;
      System.out.println("Playing music");
    }
  }

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
