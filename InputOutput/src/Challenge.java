// Author:- TheAjayGurjar { bsag0001@gmail.com }

// Sum all the number given as input till 11, Input should be only Int.

import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1, sum =0;
        while(true){
            System.out.println("Enter the Number #"+counter+":");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int number = scanner.nextInt();
                sum+=number;
                counter++;
                if(counter==11)
                    break;
            }else{
                System.out.println("Invalid Number");
            }
            scanner.nextLine();// prevent enter key error
        }
        scanner.close();
        System.out.println("Sum is :"+sum);
    }
}
