public class Methods {
    public static void main(String[] args){
      //main method inside class Methods
      boolean gameOver = true;
      int score = 800;
      int levelCompleted = 5;
      int bonus = 100;

      calculateScores(gameOver, score, levelCompleted, bonus);
      calculateScores(true, 1000, 8, 200);
    }

    //Define new method inside the class but outside other Methods
    //DO NOT define a method inside another method
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
      if(gameOver){
        int finalScore = score + (levelCompleted * bonus);
        finalScore += 1000;
        System.out.println("Your final score was: " + finalScore);
      }
    }
}
