//DATA TYPES FOR WHOLE NUMBERS
// int has a width of 32
int myValue = 156700;
// Min & Max possible value for int
int minIntValue = -2147483648;
int maxIntValue = 2147483647;

// byte has a width of 8
byte myByteValue = 10;
// Min & Max possible value for byte
byte minByteValue = -128;
byte maxByteValue = 127;

// short has a width of 16
short myShortValue = 25656;
// Min & Max possible value for short
short minShortValue = -32768;
short maxShortValue = 32767;

// long has a width of 64 (max/min values 2^64)
long myLongValue = 256L;


// To maintain data type in an expression, use (type) to prevent conversion to int
byte myNewByteValue = (byte) (myByteValue / 2);
System.out.println(myNewByteValue);


// Conditionals Example
public class Conditionals {
  public static void main(String[] args) {
    if (1 < 4 && 0 > 5) {
      System.out.println("You ordered a cup of hot, mint tea.");
    } else if (21 <= 19 || 17 >= 28) {
      System.out.println("You ordered freshly squeezed orange juice!");
    } else if ( !(true == true) ) {
      System.out.println("You ordered hot cocoa!");
    } else {
      System.out.println("You ordered a cup of Java!");
    }

    char answerChoice = 'C';

    switch (answerChoice) {
      case 'A': System.out.println("You answered: " + answerChoice + ". Try again.");
      break;
      case 'B': System.out.println("You answered: " + answerChoice + ". Try again.");
      break;
      case 'C': System.out.println("You answered: " + answerChoice + ". Correct!");
      break;
      case 'D': System.out.println("You answered: " + answerChoice + ". Try again.");
      break;
      default:
      System.out.println("Please select a valid answer choice.");
    }
  }
}

// If - Else If Example
public class IfElseIf {
  public static void main(String[] args) {
    int round;
    if (round > 12) {
      System.out.println("The match is over!");
    } else if (round > 0) {
      System.out.println("The match is underway!");
    }	else {
      System.out.println("The boxing match hasn't started yet.");
    }
  }
}

//Ternary Example
int pointsScored = 21;
char gameResult = (pointsScored > 20) ? 'W' : 'L';
System.out.println(gameResult);

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

//Data Structure - ArrayList (specify data type stored)
import java.util.ArrayList;

public class Temperatures {
  public static void main(String[ ] args) {
    //Create new ArrayList
    ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();
    //Add data to the ArrayList
    weeklyTemperatures.add(94);
    weeklyTemperatures.add(87);
    weeklyTemperatures.add(90);
    weeklyTemperatures.add(101);
    //Retrieve data from the ArrayList at index 2
    weeklyTemperatures.get(2);
    //Using a For Each loop to iterate thru the ArrayList
    for (Integer temperature : weeklyTemperatures) {
      System.out.println(temperature);
    }

  }
}

//Data Structure - HashMap (specify data in key-value pairs)
public class Menu {
  public static void main(String[ ] args) {
    HashMap<String, Integer> restaurantMenu = new HashMap<String, Integer>( );

    restaurantMenu.put("Turkey Burger", 13);
    restaurantMenu.put("Naan Pizza", 11);
    restaurantMenu.put("Cranberry Kale Salad", 10);
    restaurantMenu.get(“Naan Pizza”);

    System.out.println(restaurantMenu.size( ));

    for (String item : restaurantMenu.keySet( )) {
      System.out.println("A " + item + " costs " + restaurantMenu.get(item) + " dollars.");
    }
  }
}
