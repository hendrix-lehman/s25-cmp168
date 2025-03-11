class Person {
  private String name;
  private int age;
  private String address;

  // a person can not have more than 5 cars
  private Car[] cars = new Car[5];

  // keep track of the number of cars a person has
  private int carCount = 0;

  public Person(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  // add up to 5 cars, one at a time
  public void addCar(Car car) {
    if (carCount < 5) {
      cars[carCount] = car;
      carCount++;
    }
  }

  // add multiple cars, one at a time until the array is full
  public void addCars(Car[] cars) {
    for (Car car : cars) {
      addCar(car);
    }
  }

  // get how many cars a person has
  public int getCarCount() {
    return carCount;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getAddress() {
    return address;
  }

  // equals(Object obj): boolean //all attributes must match for 2 Course objects
  // to be considered equal
  public boolean equals(Object obj) {
    // if both instances are the same reference, they are equal
    if (this == obj) {
      return true;
    }

    // if obj is null, they are not equal
    if (obj == null) {
      return false;
    }

    if (obj instanceof Person) {
      Person other = (Person) obj;
      return name.equals(other.name) && age == other.age && address.equals(other.address);
    }

    return false;
  }

}
