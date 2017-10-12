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

    //Ternary Example
    int pointsScored = 21;
    char gameResult = (pointsScored > 20) ? 'W' : 'L';
    System.out.println(gameResult);
  }
}
