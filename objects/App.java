// this class is the way I like to describe a program.
// it has a main method that is the entry point of the program.
class App {

  // main method is the entry point of the program.
  public static void main(String[] args) {

    // this is how you create an object
    // the object is of type Person
    // the object reference is in the variable xyz
    // in essence, xyz is a person named John
    Person xyz = new Person("John");

    xyz.greet();

    // this is how you call a method on an object
    // the method is called getName
    // it is a getter method
    // it is used to get the value of the instance variable name
    String name = xyz.getName();
    System.out.println(name);

    // now, let's create an array of Person objects
    // the array is sized 10
    // it can hold 10 Person objects
    Person persons[] = new Person[10];
    for (int i = 0; i < 10; i++) {
      // create a new Person object
      Person p = new Person("Person " + i);
      // assign the Person object to the array
      persons[i] = p;
    }

    // now, let's print the names of the Person objects
    for (int i = 0; i < 10; i++) {
      System.out.println(persons[i].getName());
    }

    // by creating a default constructor,
    // you can create a Person object without a name
    Person p = new Person();
    System.out.println(p.getName());
    p.setName("Jane");

    // I can call public methods on the object
    p.greet();
    p.walk();

    // not allowed
    // p.privateMethod();

    System.out.println(p.toString());
    System.out.println(p.hashCode());

    // this is how you compare objects
    // you can compare objects using the equals method
    // the equals method is defined in the Object class
    // the Object class is the parent class of all classes
    // the equals method is overridden in the Person class
    Boolean result0 = p.equals(xyz);
    System.out.printf("p.equals(xyz) returns %b\n", result0);

    Boolean result1 = p.equals(p);
    System.out.printf("p.equals(p) returns %b\n", result1);

    Boolean result2 = p.equals("Jane");
    System.out.printf("p.equals('Jane') returns %b\n", result2);

  }
}
