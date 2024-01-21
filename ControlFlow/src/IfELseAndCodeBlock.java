// Author:- TheAjayGurjar { bsag0001@gmail.com }

public class IfELseAndCodeBlock {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100 ;

        // * if statement onl executes one statement by default so use code blocks wherever needed
        if(score==5000){
            System.out.println("the score was 5000");}

        if(score<5000){
            System.out.println("the score was 5000");
        }else{
            System.out.println("got here");
        }
        // * else statement runs in all the rest condition which are not mentioned in the if

        if(score<=5000){
            System.out.println("the score was 5000");
        }else{
            System.out.println("got here");
        }

        // * we can use multiple else if statements for multiple different conditions
        if(score<5000&& score>1000){
            System.out.println("the score was less than 5000 but greater than 1000");
        }else if(score<1000){
            System.out.println("score is less than 1000");
        }else{
            System.out.println("got here");
        }

        score = 4000;
        if(score<5000&& score>1000){
            System.out.println("the score was less than 5000 but greater than 1000");
        }else if(score<1000){
            System.out.println("score is less than 1000");
        }else{
            System.out.println("got here");
        }

        // * after it gets the condition correct or true it will not read subsequent below else statements
        score = 800;
        if(score<5000&& score>1000){
            System.out.println("the score was less than 5000 but greater than 1000");
        }else if(score<1000){
            System.out.println("score is less than 1000");
        }else{
            System.out.println("got here");
        }

        // * let's see some code
        if(gameOver){
            int finalScore = score + (levelCompleted*bonus);
            System.out.println("your final score was "+finalScore);
        }

        // * variable which is declared inside a code block , we cannot access it outside that code block,
        // this is known as scope of variable
        // int z = finalScore; this will give error
        score = 10000;
        levelCompleted = 8;
        bonus = 200 ;
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        }
        // what we did above is not the efficient one , we will use the methods for that

    }
}
