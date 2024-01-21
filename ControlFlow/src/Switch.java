// Author:- TheAjayGurjar { bsag0001@gmail.com }

import java.util.Locale;

public class Switch {

    public static void main(String[] args) {

        int value = 1;
        if (value == 1)
            System.out.println("value was 1");
        else if (value == 2)
            System.out.println("value was 2");
        else
            System.out.println("value was 1 or 2");

        // * above method of doing can be more difficult if we have to test for the 10 or more than that cases
        // switch statement is another control flow statement which allows us to test several values for the single
        // given expression , and give output accordingly.

        int switchValue = 6;

        switch (switchValue) {
            case 1:
                System.out.println("value was 1");
                break;
            // * we use break statement so that when case matches with actually value of expression, and it runs
            // the necessary statement , after that it doesn't run the below statements, so we use break statement .
            // * once the boolean value inside switch statement got true it will start running each and every statement
            // below it even if the case returns false , so to prevent this we take help of the break statement so
            // when condition is set to true break statement tells java to bypass all the upcoming cases and reach
            // further code

            case 2:
                System.out.println("value was 2");
                break;
            // when no cases matched the required boolean condition and return true then at the end we use default
            // statement for all the remaining cases, this statement runs when none of the statements is executed .

            // for similar output for several cases we won't use break statement
            case 3:
            case 4:
            case 5:
                System.out.println("was a 3,4,or 5");
                System.out.println("actually it was a " + switchValue);
                break;
            default:
                System.out.println("was not 1, 2,3,4 or 5");
                break;
        }

        char myChar = 'C';
        switch (myChar) {
            case 'A':
                System.out.println("A IS FOUND");
                break;
            case 'B':
                System.out.println("B IS FOUND");
                break;
            case 'C':
                System.out.println("C IS FOUND");
                break;
            case 'D':
                System.out.println("D IS FOUND");
                break;
            case 'E':
                System.out.println("E IS FOUND");
                break;
            default:
                System.out.println("NOT FOUND");
                break;
        }

        // * using switch for String

        String month = "January";
        switch (month) {
            case "January":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not Sure");
                break;
        }

        // what if I change th case of January
        month = "january";
        switch (month) {
            case "January":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not Sure");
                break;
        } // we got not sure because switch is case-sensitive and check for exact and precise value.
        // so to overcome that we can make cases for every different casing of the word January like jaNuary, jAnuary
        // etc. but this won't be an effective way instead we can use .toLowerCase method of String class

        month = "jAnuary";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not Sure");
                break;
        }
        month = "jUNE";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not Sure");
                break;
        }
        month = "jAnuary";
        switch (month.toUpperCase()) {
            case "JANUARY":
                System.out.println("Jan");
                break;
            case "JUNE":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not Sure");
                break;
        }
        month = "junE";
        switch (month.toUpperCase()) {
            case "JANUARY":
                System.out.println("Jan");
                break;
            case "JUNE":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not Sure");
                break;
        }



    }
}

