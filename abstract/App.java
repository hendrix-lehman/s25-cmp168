class App {

  public static Candy getRandomCandy() {
    int random = (int) (Math.random() * 3);
    switch (random) {
      case 0:
        return new KitKat("KitKat");
      case 1:
        return new Skittles("Skittles");
      case 2:
        return new MilkyWay("MilkyWay");
      default:
        return null;
    }
  }

  public static void main(String[] args) {

    Person person = new Person();
    Candy candy = getRandomCandy();
    candy.sweet();
    person.eat(candy);

  }
}
