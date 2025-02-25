class Person {
  // Instance variables
  // properties of the object
  // attributes of the object
  String name;

  static int count = 0;

  // Constructor
  // this is the default constructor
  public Person() {
    name = "No name";
  }

  // overloaded constructor
  // a constructor that takes a parameter
  // a method that is called when an object is created
  public Person(String name) {
    this.name = name;
  }

  // this method is called a getter
  // it is used to get the value of the instance variable
  // an accessor method or getter method
  public String getName() {
    return name;
  }

  // this method is called a setter
  // mutator method or setter method
  public void setName(String name) {
    this.name = name;
  }

  // describe behavior of the object
  public void greet() {
    System.out.println("Hello, my name is " + name);
  }

  // describe operation of the object
  public void walk() {
    System.out.println(name + " is walking");

    // I can call a private method
    privateMethod();
  }

  // private methods are not accessible outside the class
  private void privateMethod() {
    System.out.println("This is a private method");
  }

  // static methods
  public static void staticMethod() {
    count++;
    System.out.printf("This is a static method, count = %d\n", count);
  }

  @Override
  public String toString() {
    return "Person [name=" + name + "]";
  }

  @Override
  public boolean equals(Object obj) {

    // if obj is null, it must not be the same person
    if (obj == null) {
      return false;
    }

    if (this == obj) {
      return true;
    }

    if (obj instanceof Person) { // check if obj is a Person
      Person p = (Person) obj; // cast obj to Person
      return this.name.equals(p.getName());
    }

    return false;
  }

}
