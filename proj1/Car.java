class Car {
  // Instance variables
  String color;
  int speed;
  int gear;

  Sticker[] stickers = new Sticker[5];
  int stickerCount = 0;

  // Constructors
  Car() {
    gear = 1;
    speed = 0;
    color = "red";
  }

  Car(int gear, int speed, String color) {
    this.gear = gear;
    this.speed = speed;
    this.color = color;
  }

  // add stickers to the car and double the size of the array if it is full
  public void addSticker(Sticker sticker) {
    if (stickerCount < stickers.length) {
      stickers[stickerCount] = sticker;
      stickerCount++;
    } else {
      doubleStickersArray(sticker);
      stickerCount++;
    }
  }

  // double the size of the stickers array
  private void doubleStickersArray(Sticker sticker) {
    Sticker[] temp = new Sticker[stickers.length * 2];
    for (int i = 0; i < stickers.length; i++) {
      temp[i] = stickers[i];
    }
    temp[stickers.length] = sticker;
    stickers = temp;
  }

  // get how many stickers a car has
  public int getStickerCount() {
    return stickerCount;
  }

  // Method to increase speed
  void speedUp(int increment) {
    speed = speed + increment;
  }

  // Method to decrease speed
  void applyBrakes(int decrement) {
    speed = speed - decrement;
  }

  // Method to display the attributes of the class
  void printStates() {
    System.out.println("color: " + color + " speed: " + speed + " gear: " + gear);
  }
}
