// Author:- TheAjayGurjar { bsag0001@gmail.com }

// Max and Min of all the number input by user till the input is integer.

import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        while(true){
            System.out.println("Enter number:");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int inputNumber = scanner.nextInt();
                if(inputNumber>maxNumber){
                    maxNumber=inputNumber;
                }
                if(inputNumber<minNumber){
                    minNumber=inputNumber;
                }
            }else {
                break;
            }
            scanner.nextLine();// handles enter key error
        }
        scanner.close();
        System.out.println("the maximum number is: "+maxNumber+" and the minimum number is: "+minNumber);
    }
}
