//Class example w/ inheritance
public class Rodentia {
  public static void main(String[] args) {
  }
  public void order() {
    System.out.println("This animal belongs to the Rodentia order.");
  }
}
public class Mouse extends Rodentia {
  String name;
  public Mouse(String name) {
    this.name = name;
  }
  public void eat() {
    System.out.println(name + " ate some cheese pizza!");
  }
  public void solveMaze(int minutes) {
    System.out.println(name + " solved the maze in " + minutes + " minutes!");
  }
  public static void main(String[] args) {
    Mouse ratly = new Mouse("Ratly");
    ratly.eat();
    ratly.solveMaze(3);
    ratly.order();
  }
}

//Creating a class
class Dog {
  //add instance variables, or a detail/data we’d want to associate w/ the class
  int age;

  // create class constructor
  public Dog( int dogsAge ) {
    //add parameters for the class
    age = dogsAge;
  }
  //create a method for the Dog class
  public void bark( ){
    System.out.println("Woof!");
  }
  //create a method that returns a value
  public int legs() {
    return 4;
  }
  //add the Java’s built-in main method
  //anything inside main will run when Java runs your program
  public static void main(String[] args) {
    //Creating a new instance / object of the Dog class
    Dog spike = new Dog(4);
    //to call the bark method on spike
    spike.bark();
    spike.run(100);
    int spikeAge = spike.getAge();
    System.out.println(spikeAge);
  }
}
