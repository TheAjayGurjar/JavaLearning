// Author:- TheAjayGurjar { bsag0001@gmail.com }

import java.util.ArrayList;
import java.util.Scanner;

public class MultidimensionalArrayList {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // creating reference of the arraylist of type array list which is type of integer 2d
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        // without this initialisation we will get error because below we are inputting in
        // an arraylist but there is no arraylist there , only null is present

        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
}