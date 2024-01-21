// Author:- TheAjayGurjar { bsag0001@gmail.com }

public class KeywordsAndExpression {

    public static void main(String[] args) {

        // * keywords are reserved words in java, and we cannot use them as the variable name .
        // int int = 2 ;gives error
        int int2 =2 ;
        System.out.println(int2);

        // a mile is equal to 1.609344 kilometers
        double kilometers = (100*1.609344);
        // here kilometers = (100*1.609344) is expression
        // expression in java are by default Int Type.
        System.out.println(kilometers);

        int highScore = 50 ;
        // highScore = 50 ;   is expression

        if(highScore==50){
            // highScore==50  is expression

            System.out.println("this is an expression");
            // "this is an expression"  is expression

            int score = 100 ;//  score = 100    is expression

            if(score>99){
                //score>99    is expression

                System.out.println("you get the high score"); // "you get the high score"    is expression

                score=0; //  score=0  is expression

                System.out.println(score);

                // * methods also builds the expression
            }
        }
    }
}

