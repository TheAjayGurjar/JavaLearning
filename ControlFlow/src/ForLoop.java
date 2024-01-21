// Author:- TheAjayGurjar { bsag0001@gmail.com }

public class ForLoop {

    public static void main(String[] args) {

        System.out.println("10,000 at 2% interest " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at5% interest " + calculateInterest(10000.0, 5.0));

        // * but this is not the effective way,
        // * so we will use For loop.

        // * for loop consist three parts initialisation , termination , increment ->
        // initialisation is in which create a variable which we will be using to run the for loop ,
        // termination is the boolean expression which when return true the code inside the for loop will not be
        // executed further ,
        // increment is the expression which tells the for loop to jump to the which next value after a single complete
        // iteration(completion of one cycle of loop) of for loop.

        // for(initialisation;termination;increment){ }


        // after running this , for 7% we will get 700.0000000000001 because of double precision, we can show the

        // result only unto 2 decimal places by using String.format() method which uses "%.2f" as first argument shown

        // result unto 2 decimal places , and other argument is the number to be shown unto two decimal places

        for(int i=0;i<9;i++){
            System.out.println("10,000 at "+
                    i+"% interest " +
                    String.format("%.2f",calculateInterest(10000.0, i)));
        }// this will print same as the above
        // * scope of variable i is inside for loop code block

        for(int i=0;i<5;i++){
            System.out.println("loop says hello "+i+" times");
        }

        // interest for 8% to 2%
        for(int i=8;i>1;i--){
            System.out.println("10,000 at "+
                    i+"% interest " +
                    String.format("%.2f",calculateInterest(10000.0, i)));
        }

        int count = 0;

        // doing isPrime challenge
        for(int i = 375;i<467;i++){
            if(isPrime(i)){
                count++;
                System.out.println(count+". prime number is : "+i);}
            if(count==3){
                break;
            }
        }


    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }


    // method for finding prime number
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        // * Math.sqrt() is the method of Math class which helps to find out the square root of the number
        for (int i=2;i<=(long) Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }


}
