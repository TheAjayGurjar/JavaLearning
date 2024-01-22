// Author:- TheAjayGurjar { bsag0001@gmail.com }

import java.util.Arrays;

public class PassingArray {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 12};
        System.out.println(Arrays.toString(nums));

        // Changes object mutable, Strings are immutable
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr) {

        // How does this happen already explained in the methods and funclion class
        // Pass by value of reference variable
        arr[0] = 99;
    }
}