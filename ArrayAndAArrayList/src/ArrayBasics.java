// Author:- TheAjayGurjar { bsag0001@gmail.com }

public class ArrayBasics {

    public static void main(String[] args) {

        // Array is collection of similar primitive data type, object or complex datatype
        // Array are object and object in java is not necessarily contiguous
        // therefore it depends on jvm that array will be contiguous or not in java.

        // Q: store a roll number
        int a = 19;

        // Q: store a person's name
        String name = "Ajay Gurjar";

        // Q: store 5 roll numbers
        int rno1 = 23;
        int rno2 = 55;
        int rno3 = 18;

        // syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 roll numbers:
        // int[] rnos = new int[5];
        // or directly
        // int[] rnos2 = {23, 12, 45, 32, 15};

        int[] ros; // declaration of array. ros is getting defined in the stack (COMPILE TIME)
        ros = new int[5]; // initialisation: actually here object is being created in the memory (heap) (RUNTIME)
        // This is Known as Dynamic Memory Allocation

        // By default array stores zero in int array
         System.out.println(ros[1]);

        String[] arr = new String[4];
        // By default array stores Null means no datatype is present.
        System.out.println(arr[0]);

        // Null****
        // null is the literal not the type and can be assigned to only non primitives.
        // every reference value is null till the object is created
        // All the primitives are stored in the stack and object in heap in the java
        // Every element of array is separate object

        /* for (String element : arr) {
              System.out.println(element);
          }

         */

    }
}