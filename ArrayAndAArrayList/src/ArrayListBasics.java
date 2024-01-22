// Author:- TheAjayGurjar { bsag0001@gmail.com }

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBasics {
    public static void main(String[] args) {

        // When we do not know the size of array then we use array list
        // by array list we can input any number of elements and java handles the size
        // It's a class which extends some other class
        // Also this is equivalent of vectors in c++
        // Part of collection framework in java

        Scanner in = new Scanner(System.in);

        // Syntax
        ArrayList<Integer> list = new ArrayList<>(5);
        // new ArrayList<>(5) is constructor
        // initial capacity is provided.
        // ArrayList<Integer> we are using generics here which tells what type of data we can store in this list
        // We cannot pass primitives in generic, wrapper classes are passed.

        // How to add elements and any number of elements
        list.add(67);
        list.add(234);
        list.add(654);
        list.add(43);
        list.add(654);
        list.add(8765);

        // List will itself call to string method internally to print elements
        System.out.println(list);

        // When we type list. we can see all the function it can use some of them are listed below

        System.out.println(list.contains(765432));// check it contain or not
        list.set(0, 99); // set index 0 to 99
        list.remove(2); // remove anything at index 2

        System.out.println(list);

        // input by for loop
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index by for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }

        System.out.println(list);


        // Internal Working
        // Internally when it is filled half of the initial capacity it creates new arraylist with more capacity
        // and add the old to the new list, delete the old list. New capacity is calculated by a formula
        // given in the implementation of ArrayList class.
        // Time complexity id O(1).
    }
}