// Author:- TheAjayGurjar { bsag0001@gmail.com }

import java.util.Arrays;

public class PassByValueOfReference {

    // Java have no pass by reference;
    // For primitive data types it is passed by value (new object is created in heap)
    // For String, since they are immutable a new object is created while changing.
    // For object like array, they are passed to the function, the value of the reference variable is passed.
    public static void changeContent(int[] arr) {

        // If we change the content of arr.
        arr[0] = 10;  // Will change the content of array in main()
    }

    public static void changeRef(int[] arr) {
        // If we change the reference
        arr = new int[2];  // Will not change the array in main()
        arr[0] = 15;
    }

    public static void main(String[] args) {
        int [] arr = new int[2];
        arr[0] = 4;
        arr[1] = 5;

        changeContent(arr);

        System.out.println(arr[0]);  // Will print 10 and the value of reference is changed but

        changeRef(arr);

        System.out.println(arr[0]);  // Will still print 10, since Reference is not changed i.e. address of memory
        // is not changed.
        // Change the reference doesn't reflect change here


        // Another Example for Strings

        // create an array
        int[] arr2 = {1, 3, 2, 45, 6};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] numbers) {
        numbers[0] = 99; // if you make a change to the object via this ref variable, same object will be changed
    }


}
