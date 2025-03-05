class SkittlesFactory implements CandyFactory {
  // unique number for each candy
  private static int numSkittles = 0;

  public Candy makeCandy() {
    return new Skittles("Skittles " + ++numSkittles);
  }

  public void ship(Candy[] candies) {
    System.out.println("Shipping " + candies.length + " Skittles");
  }
}
