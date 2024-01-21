// Author:- TheAjayGurjar { bsag0001@gmail.com }

public class Methods {

    // below is th main method, returns nothing
    public static void main(String[] args) {

        // * look at the below code snippet
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100 ;
        if(gameOver){
            int finalScore = score + (levelCompleted*bonus);
            System.out.println("your final score was "+finalScore);
        }


        // using calculateScore method here
        calculateScore(true,800,levelCompleted,bonus);
        calculateScore(true,10000,8,200);

        // using the value returned by the method
        int highScore = calculateScore(true,10000,8,200);
        System.out.println("high score value is "+highScore);

        // calling score position method
        displayHighScorePosition("AJAY",calculateHighScorePosition(1500));
        displayHighScorePosition("AJAY",calculateHighScorePosition(900));
        displayHighScorePosition("AJAY",calculateHighScorePosition(400));
        displayHighScorePosition("AJAY",calculateHighScorePosition(50));

        double kilometersPerHour = 50;
        long milesPerHour = Math.round(kilometersPerHour/1.609);
        // *** Math.round() round is the built-in function in built in class Math in java to round of
        System.out.println(milesPerHour);




        score = 10000;
        levelCompleted = 8;
        bonus = 200 ;
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        }
        // but this is not efficient
    }

    // * methods
    // we define parameters inside the parenthesis after the method name so that they can be used by method in
    // performing the operations , syntax for that is given below
    // will parse the information to this parameter at the place where we call the method
    // we can parse a literal or a variable which is defined in the scope
    // now if change the code inside the method it will reflect in all the places where method was used
    // * we know that void keyword shows that method would not return anything , but if we want the method to return a
    // value that can either printed or can be stored by the variable we can change the void to the data type of the
    // value which we want to return b the method
    // public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore+=2000;
            System.out.println("your final score was " + finalScore);
            // * for returning the value below is syntax
            // return finalScore; // but we still got he error
            // we got the error because a method should always return something not only when he conditions in if
            // statement is satisfied
            return finalScore;
        }else{
            return -1;// now return is available for every condition
            // * -1 in programing terms depicts the error, in searching algorithms it depicts invalid value or value
            // not found
        }

        // so we put the return statement outside the if block or return with help of else statement

    }

    // let's have some fun
    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName+" managed to get the position "+playerPosition);
    }
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore>=1000)
            return 1;
        else if (playerScore>=500)
            return 2;
        else if (playerScore>=100)
            return 3;
        return 4;

    }
}
