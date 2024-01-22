
import java.util.Arrays;

public class SearchingIn2DArray {

    public static void main(String[] args) {

        // Here new is not necessary as we are initialising the array here only
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };

        int target = 56;

        int[] ans = search(arr,target); // format of return value {row, col}

        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));

        System.out.println(Integer.MIN_VALUE);
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};// here new is necessary as array is not initialised before
                }
            }
        }
        return new int[]{-1, -1}; // here new is necessary as array is not initialised before
    }


    // Max value in 2D Array
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}