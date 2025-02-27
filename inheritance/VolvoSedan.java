class VolvoSedan extends Volvo {
  private String coolFeature = "Cool feature: 360-degree camera";

  public String getCoolFeature() {
    return coolFeature;
  }

  public void run() {
    super.run();
    System.out.println("VolvoSedan is running");
  }

  public void run(String message) {
    System.out.printf("VolvoSedan - %s\n", message);
  }

  // public String toString() {
  // return "VolvoSedan";
  // }
}
