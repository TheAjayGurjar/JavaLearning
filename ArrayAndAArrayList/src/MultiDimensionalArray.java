// Author:- TheAjayGurjar { bsag0001@gmail.com }

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        // Multidimensional Array are more of a Matrix
        /*
             1 2 3
             4 5 6
             7 8 9
        */

        Scanner in = new Scanner(System.in);

        // Initialization of 2d aray
//        int[][] arr = new int[3][];

        // No of row is fix but number of column can be anything
//        int[][] arr = {
//                {1, 2, 3}, // 0th index
//                {4, 5}, // 1st index
//                {6, 7, 8, 9} // 2nd index -> arr[2] = {6, 7, 8, 9}
//        };

        int[][] arr = new int[3][3];

        System.out.println(arr.length); // gives no of rows not column


        // input in 2D Array
        for (int row = 0; row < arr.length; row++) {

            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) { // arr[row].length gives the size of that row(no. of col)
                arr[row][col] = in.nextInt();
            }
        }

        // output by for loop but recommended for each/Enhanced for loop
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        // output by using to string and passing the row in it
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        // by for each loop , here type of 'a' is Array, pass the array 'a' into the to string.
        for(int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}