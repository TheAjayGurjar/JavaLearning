// Author:- TheAjayGurjar { bsag0001@gmail.com }

public class Shadowing {

    // Shadowing is the concept in which lower level variable are preferred over higher level variable,
    // in function local var will be preferred over global
    static int x = 90; // this will be shadowed at line 8
    // Static is used since global variable are stored in the Static area of memory. more on that in oops.
    // Object dependent cannot be used in object Independent.
    // int x; is object independent

    public static void main(String[] args) {
        System.out.println(x); // 90
        int x; // the class variable at line 4 is shadowed by this
        //  System.out.println(x); // scope will begin when value is initialised
        x = 40;
        System.out.println(x); // 40
        fun();
    }

    static void fun() {

        System.out.println(x);
    }
}