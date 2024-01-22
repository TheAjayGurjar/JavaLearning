// Author:- TheAjayGurjar { bsag0001@gmail.com }

import java.util.Arrays;

public class SearchingInString {
    public static void main(String[] args) {
        String name = "Ajayg";
        char target = 'j';

        System.out.println(search(name, target));

        // Printing Array with to String, but before convert the String to Char array
        System.out.println(Arrays.toString(name.toCharArray()));
    }


    // Search 2

    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for(char ch : str.toCharArray()) { // used toCharArray() function
            if (ch == target) {
                return true;
            }
        }
        return false;
    }


    // search 1

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        // here str.length() is function
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) { // Using CharAt() function
                return true;
            }
        }
        return false;
    }
}