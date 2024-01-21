// Author:- TheAjayGurjar { bsag0001@gmail.com }

// before using Scanner classes we have to import the Scanner classes from java.util package
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //   here we are creating an object of Scanner class of type Scanner
        Scanner scanner = new Scanner(System.in);

        // Default value of out and in inside the System class is null i.e
        // their value is command line of system.
        System.out.println("enter your year of birth : ");


        boolean hasNextInt = scanner.hasNextInt();
        // now this scanner.hasNextInt checks whether the next input in the console is of int type or not
        // but it doesn't stop the user to put the wrong code

        if(hasNextInt){

            int yearOfBirth = scanner.nextInt();

            scanner.nextLine();// handle the next line error, enter key error.

            System.out.println("enter your name here :");

            String name = scanner.nextLine();

            int age = 2018-yearOfBirth;

            if(age>=0&&age<=100){
                System.out.println("your name is : "+ name+ " and you are "+age+" years old.");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("unable to parse year of birth");
        }



        scanner.close();

        // a problem is arriving that the cursor is not directly moving to the console instead we have to place it
        // there , and type the input just after without pressing enter .
        // if we press enter it will take blank as input, and later it is not taking input een if we type the input
        // in the console and press to enter again.
        // we will solve that problem later ( problem solved by nextLine(); )

        // actually we have given strings input nextInt method parse the string to int

        // while taking input and processing it can make some problem like what if I entered the negative year of birth
        // above problem can be solved by restricting the input range
        // another problem can be inputting name in birth year then we get input mismatch error



    }


}

