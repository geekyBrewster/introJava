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
