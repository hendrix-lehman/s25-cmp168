class App {

  public static Candy[] makeCandies(CandyFactory factory) {
    Candy[] candies = new Candy[CandyFactory.NUM_CANDIES];
    for (int i = 0; i < CandyFactory.NUM_CANDIES; i++) {
      candies[i] = factory.makeCandy();
    }
    return candies;
  }

  public static void main(String[] args) {

    // create a CandyFactory object
    CandyFactory factory = new KitKatFactory();

    // create an array of candies
    Candy[] candies = makeCandies(factory);

    // print the name of each candy
    for (Candy candy : candies) {
      System.out.print(candy.getName() + " - ");
      candy.sweet();
    }

    factory.ship(candies);

  }
}
