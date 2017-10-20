public class Methods {
    public static void main(String[] args){
        //main method inside class Methods
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScores(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was: " + highScore);

        highScore = calculateScores(true, 1000, 8, 200);
        System.out.println("Your final score was: " + highScore);

        String player1 = "Mary";
        int player1score = 1500;
        String player2 = "Bob";
        int player2score = 900;
        String player3 = "Sasha";
        int player3score = 400;
        String player4 = "Josh";
        int player4score = 50;

        //For Mary
        player1score = calculateScores(gameOver, player1score, levelCompleted, bonus);
        System.out.println("Mary's score is: " + player1score);
        int player1position = calculateHighScorePosition(player1score);
        displayHighScorePosition(player1, player1position);

        //For Bob
        player1score = calculateScores(gameOver, player2score, levelCompleted, bonus);
        System.out.println("Bob's score is: " + player2score);
        int player2position = calculateHighScorePosition(player2score);
        displayHighScorePosition(player2, player2position);

        //For Sasah
        player1score = calculateScores(gameOver, player3score, levelCompleted, bonus);
        System.out.println("Sasha's score is: " + player3score);
        int player3position = calculateHighScorePosition(player3score);
        displayHighScorePosition(player3, player3position);

        //For Josh
        player1score = calculateScores(gameOver, player4score, levelCompleted, bonus);
        System.out.println("Josh's score is: " + player4score);
        int player4position = calculateHighScorePosition(player4score);
        displayHighScorePosition(player4, player4position);

    }

    //Define new method inside the class but outside other Methods
    //DO NOT define a method inside another method
    //Void means method is NOT returning a value.
    //If you want to return data, specify data type rather than void.
    //Be sure to return some data (hence the else statement below)
    public static int calculateScores(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position: " + playerPosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000){
            return 2;
        } else if (playerScore >= 100 && playerScore < 500){
            return 3;
        } else {
            return 4;
        }
    }
}
