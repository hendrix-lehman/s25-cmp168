abstract class Candy {

  private String name;

  public Candy(String name) {
    this.name = name;
  }

  // this method is abstract, it does not have a body {}
  // that means that the implementation of this method
  // will be provided by the subclasses
  abstract void sweet();

  public String getName() {
    return name;
  }

}
