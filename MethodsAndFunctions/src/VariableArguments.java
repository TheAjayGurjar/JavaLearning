// Author:- TheAjayGurjar { bsag0001@gmail.com }

import java.util.Arrays;

public class VariableArguments {

    public static void main(String[] args) {

        fun();
        multiple(2, 3, "Ajay", "Rahul", "dvytsbhusc");
        demo("karan","Arjun");
        demo(1,2,3,4,5,6);
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {
        // Function can take variable arguments as the array of the arguments Data type
        // This type of argument should be in the last

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}