class KitKatFactory implements CandyFactory {

  public Candy makeCandy() {
    return new KitKat("KitKat");
  }

  public void ship(Candy[] candies) {
    System.out.println("Shipping " + candies.length + " KitKats");
  }
}
