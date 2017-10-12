public class DataTypes {
  public static void main(String[] args) {
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

    //Create a variable long, and make it equal to 50000 + 10 times the sum of the byte plus the short plus the int
    byte thisByte = 25;
    short thisShort = 265;
    int thisInt = 3456;
    // long variables will accept int's so no casting is needed
    long thisLong = 50000L + 10L * (thisByte + thisShort + thisInt);
    System.out.println("new long variable: " + thisLong);
    // short and byte variables DO need casting [using (short) to convert the variable]
    short shortTotal = (short) (1000 + (thisByte + thisShort + thisInt));
    System.out.println("new short total: " + shortTotal);


    //DATA TYPES FOR DECIMAL NUMBERS
    // Float - single precision, add 'f' at end of number
    float myFloat = 5.25f;

    // Double - double precision, can add 'd' at end of number but you don't have to
    // Java assumes a decimal is by default a double
    double myDouble = 7.65d;

    //Convert a given number of pounds to kilograms (1 lbs = 0.45359237 kilograms)
    double numOfPounds = 10d;
    double kiloInPound = 0.45359237d;
    double totalKilograms = numOfPounds * kiloInPound;
    System.out.println("Number of kilograms in " + numOfPounds + " lbs. is: " + totalKilograms);


    //CHAR DATA TYPES
    char myChar = 'M';
    char myUnicodeChar = '\u00A9';  //Adds copyright symbol with unicode code

    //BOOLEANS
    boolean myBool = true;

    //STRINGS
    String myString = "Hello Darlings";
    System.out.println("Current string = " + myString);
    myString = myString + ". How are you today?";   //appends more text to the string
    System.out.println("Now string = " + myString);

  }
}
