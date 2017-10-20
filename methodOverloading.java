//METHOD OVERLOADING -- defining methods w/ the same name and different # of parameters
public class Method_Overloading {

    public static void main(String[] args){

        //Passing method feet and inches
        double myResult = calcFeetAndInchesToCentimeters(2, 8);
        System.out.println("2 feet and 8 inches = " + myResult + " centimeters");

        //Passing method just inches
        myResult = calcFeetAndInchesToCentimeters(84);
        System.out.println("84 inches = " + myResult + " centimeters");

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
      if(feet >= 0 && inches >= 0)
          return 2.54 * (inches + feet * 12);
      else if (feet < 0) {
          System.out.println("Invalid number of feet.");
          return -1;
      }
      else if (inches < 0) {
          System.out.println("Invalid number of inches.");
          return -1;
      }
      else {
          System.out.println("Oops. Something went wrong.");
          return -1;
      }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0)
            return 2.54 * (inches);
        else {
            System.out.println("Oops. Something went wrong. Invalid number.");
            return -1;
        }
    }

}
