class Airplane {
  private Passenger[] passengers;
  private int numPassengers;

  public Airplane() {
    passengers = new Passenger[100];
    numPassengers = 0;
  }

  public void addPassenger(Passenger p) {
    if (numPassengers >= passengers.length) {
      return;
    }
    passengers[numPassengers] = p;
    numPassengers++;
  }

  public Passenger getPassenger(int index) {
    if (index < 0 || index >= numPassengers) {
      return null;
    }
    return passengers[index];
  }

  // write a test program in main
  public static void main(String[] args) {
    Airplane a = new Airplane();
    Passenger p1 = new Passenger("Alice", 1990, 120.0, 'f', 2);
    Passenger p2 = new Passenger("Bob", 1995, 150.0, 'm', 1);
    Passenger p3 = new Passenger("Charlie", 2000, 180.0, 'm', 3);
    a.addPassenger(p1);
    a.addPassenger(p2);
    a.addPassenger(p3);
    a.getPassenger(0).printDetails();
    a.getPassenger(1).printDetails();
    a.getPassenger(2).printDetails();

    if (a.getPassenger(3) != null) {
      System.out.println("Error: getPassenger() failed");
    }
  }
}
