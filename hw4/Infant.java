class Infant {
  private InfantToy[] toys;
  private int numInfantToys;

  public Infant() {
    toys = new InfantToy[10];
    numInfantToys = 0;
  }

  public void addInfantToy(String toyName, int toyRating) {
    if (numInfantToys < 10) {
      toys[numInfantToys] = new InfantToy(toyName, toyRating);
      numInfantToys++;
    }
  }

  public String getInfantToyAsString(int index) {
    if (index < numInfantToys) {
      return toys[index].toString();
    }

    return "invalid index " + index;
  }

  class InfantToy {
    String toyName;
    int toyRating;

    public InfantToy(String toyName, int toyRating) {
      this.toyName = toyName;
      this.toyRating = toyRating;
    }

  }
}
