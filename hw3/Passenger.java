class Passenger {
  private String name;
  private int birthYear;
  private double weight;
  private char gender;
  private int numCarryOn;

  public Passenger() {
    name = "";
    birthYear = 1900;
    weight = 0.0;
    gender = 'u';
    numCarryOn = 0;
  }

  public Passenger(String name, int birthYear, double weight, char gender, int numCarryOn) {
    this.name = name;
    this.birthYear = birthYear;
    this.weight = weight;
    this.gender = gender;
    this.numCarryOn = numCarryOn;
  }

  // getters
  public double getWeight() {
    return weight;
  }

  // setters
  public void setWeight(double weight) {
    if (weight < 0) {
      this.weight = -1;
      return;
    }
    this.weight = weight;
  }

  // other methods
  public void printDetails() {
    String text = "Name: %20s | Year of Birth: %4d | Weight: %10.2f | Gender: %c | NumCarryOn: %2d\n";
    System.out.printf(text, name, birthYear, weight, gender, numCarryOn);
  }

  public void gainWeight() {
    weight += 1.0;
    // same as weight = weight + 1.0;
  }

  public void gainWeight(double amount) {
    if (amount < 0.0) {
      return;
    }
    weight = amount;
  }

  public void loseWeight() {
    if (weight == 0.0) {
      return;
    }
    weight -= 1.0;
    // same as weight = weight - 1.0;
  }

  public void loseWeight(double amount) {
    double newWeight = weight - amount;
    if (newWeight < 0.0) {
      return;
    }

    weight = newWeight;
  }

  // not part of the assignment, but useful for testing purposes
  public static void main(String[] args) {
    Passenger p1 = new Passenger("John Doe", 1980, 180.5, 'm', 2);
    p1.printDetails();

    if (p1.getWeight() != 180.5) {
      System.out.println("Error: getWeight() failed");
    }

    p1.gainWeight();

    if (p1.getWeight() != 181.5) {
      System.out.println("Error: gainWeight() failed");
    }

    p1.setWeight(-9999.0);
    if (p1.getWeight() != -1) {
      System.out.println("Error: setWeight() failed");
    }

    double currentWeight = p1.getWeight();
    p1.gainWeight(-5555.0);
    if (p1.getWeight() != currentWeight) {
      System.out.println("Error: gainWeight(double) failed");
    }

    p1.gainWeight(0.0);
    if (p1.getWeight() != 0.0) {
      System.out.println("Error: gainWeight(double) failed");
    }

    System.out.printf("weight: %10.2f\n", p1.getWeight());
    p1.loseWeight();
    System.out.printf("weight: %10.2f\n", p1.getWeight());
    if (p1.getWeight() == -1.0) {
      System.out.println("Error: loseWeight() failed");
    }

    System.out.printf("weight: %10.2f\n", p1.getWeight());
    p1.loseWeight(5555.0);
    System.out.printf("weight: %10.2f\n", p1.getWeight());
    if (currentWeight == p1.getWeight()) {
      System.out.println("Error: loseWeight(double) failed");
    }

  }
}
