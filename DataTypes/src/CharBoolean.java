// Author:- TheAjayGurjar { bsag0001@gmail.com }

public class CharBoolean {

    public static void main(String[] args) {
        // char is the data type that is used to store the single character . syntax is given below
        // char occupies 16 bits in memoire , because it allows storing unicode characters, it can represent 65535
        // characters one at a time
        char myChar = 'D';

        // using unicode character
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyRightChar = '\u00a9';
        System.out.println(myCopyRightChar);

        // let's see boolean data type
        //a boolean value allows for two choices true or false , yes or no , 1 or 0 .in java boolean data type is a
        // primitive data type and can store only boolean values
        boolean myTrueBooleanValue = true ;
        boolean myFalseBooleanValue = false ;
        boolean isCustomerOverTwentyOne = true ;
        System.out.println(myFalseBooleanValue);
        System.out.println(myTrueBooleanValue);
        System.out.println(isCustomerOverTwentyOne);
    }
}

