public interface CandyFactory extends CandyShipping {
  // add a constant to represent the number of candies
  static final int NUM_CANDIES = 5;

  Candy makeCandy();

  // some default methods
  default void printCandy(String name) {
    System.out.println("Candy name: " + name);
  }

}
