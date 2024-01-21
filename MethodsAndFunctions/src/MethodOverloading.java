// Author:- TheAjayGurjar { bsag0001@gmail.com }

public class MethodOverloading {

    public static void main(String[] args) {

        int newScore = calculateScore("AJAY",500); // runs and stored both same time
        System.out.println("new score is : "+newScore);
        calculateScore(75);
        calculateScore();
        calculateScore(7,89);
        calculateScore(79,"AJAY");
        cacFeetAndInchesToCentimeters(87,6);
        double a = cacFeetAndInchesToCentimeters(67);
        System.out.println(a);
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("player "+playerName+" scored "+score+" points.");
        return score*1000;
    }

    // * method overloading is using same method name but this can be done only when either the number of parameters
    // are different or data-type of the parameter is different with the corresponding data type in other method having
    // same nme
    public static void calculateScore( int score){
        System.out.println("player unnamed scored "+score+" points.");

    }
    public static void calculateScore(){
        System.out.println("player unnamed scored no points.");

    }
    public static void calculateScore(int chestNumber , int score){
        System.out.println("player "+chestNumber+" scored "+score+" points.");

    }
    public static void calculateScore( int score , String playerName){
        System.out.println("player "+playerName+" scored "+score+" points.");

    }
    public static double cacFeetAndInchesToCentimeters(double feet, double inches){
        if(feet<0||(inches<0||inches>12))
            return -1;

        double centimeters = (feet*12)+(inches*2.54);
        System.out.println(feet+" feet and "+inches+" inches has total of "+centimeters+" centimeters.");
        return centimeters;
    }
    public static double cacFeetAndInchesToCentimeters(double inches){
        if(inches<0)
            return -1 ;
        double feet = (int)(inches/12);
        double remainingInches = inches%12;
        return cacFeetAndInchesToCentimeters(feet,remainingInches);
    }

}