// Author:- TheAjayGurjar { bsag0001@gmail.com }

public class PassByValueAndReference {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // Here copies of Value of a and b is passed ( Pass by Value)
        // All Primitive Data Type are passed by Value.
        // There is nothing like pass By reference in Java as it does not have pointers
        swap(a, b);

        // Value swapped In the scope but swap() but real value of a, b remains same.
        System.out.println(a + " " + b);

        String name = "Ajay Gurjar";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String naam) {
        naam = "Rahul Rana"; // creating a new object instead of changing the real one
    }

    static void swap(int num1, int num2) {

        // Value swapped In the scope but swap() but real value of a, b remains same.
        int temp = num1;
        num1 = num2;
        num2 = temp;
        // this change will only be valid in this function scope only.
    }
}
