class App {
  // this class App represents the program entry point
  // and it contains the main method
  public static void main(String[] args) {

    Car car = new Car();
    System.out.println(car.hashCode());
    System.out.println(car.toString());
    System.out.println(car.getClass());
    System.out.println(car.equals(car));

    Volvo volvo = new Volvo();
    System.out.println(volvo.toString());

    VolvoSedan volvoSedan = new VolvoSedan();
    System.out.println(volvoSedan.toString());
    volvoSedan.run();
    volvoSedan.run("Hello");

    // Volvo.Radio radio = new Volvo.Radio();
    // radio.play();

  }
}
