// Author:- TheAjayGurjar { bsag0001@gmail.com }


// * java program has keyword, each has specific meaning and need to be used in specific order
// * we write java program with some set of rules along with the combination of keywords  and other things collectively
// known as java program.
// * keywords are case-sensitive, public and class are two java keywords .
// * public is an access modifier, which allows us to define the scope or how other parts of code or even some else's
// code can access code.
// * class keyword is used to define the class with name following the keyword and left and right curly braces to
// define the class block, anything between them is part of the class.
// * public is  optional access modifier.
public class HelloWorld {

// * a method is a collection of statements that perform  simple operation.
// * main method is  entry point to the java code as java looks for when running a program
// * void tells that this method return nothing
// * left and right parenthesis are necessary, and we can define multiple parameters in right now String args to parse
// information to the method
// in code blocks we write code which belongs to that method
    public static void main(String[] args){

        // * below is a statement which is command to be executed and can include one or more expressions amd is ended by a
        // semicolon
        System.out.println("Hello World");
        // * "Hello, AJAY!"  is a string literal and is defined by "". this prints the message as it is.
        // * a literal unlike variable cannot be changed, it's an expression not a variable.

        // System.out.println("Hello, AJAY!");

        // * variables are the way to store information in our computer . these can be accessed by the name we give them
        // the computer does the handwork in figuring out where they get stored in RAM.
        // * variable as the name suggest can be changed, in other words its contents are variable
        // * so, we tell the computer wht type of information wwe store in the variable and give it a name
        // * there are lots of types of data types we can define for our variables. these are known as data types, these
        // are also keywords in java
        // * we start with int data type which is abbreviation for integer i.e. numbers without decimal
        // * to define a variable we need to specify the data type , gve it a name , and optionally add an expression to
        // initialise thr variable with a value.
        int myFirsNumber = 5;
        // * int myFirsNumber = 5; is declaration statement which ends with a semicolon
        // * it is also known as initialisation(which is optional) of the variable as we are also providing the value to
        // the value to the variable at the same tim of declaring it .

        // * type (s out) and press tab it will print the whole printing statement
        System.out.println(myFirsNumber);
        // * simply write the variable name in parentheses

        // * even if change the value 5 to any other value or an expression like bod mas (Operator precedence) expressions.
        myFirsNumber = (10+5)+(2*10);

        // since variable value can be changed
        System.out.println(myFirsNumber);
        // prints the new value after calculation

        // * we used several operator inside the expression myFirsNumber = (10+5)+(2*10) like =,+,*
        // * java operators are the operators which perform the operation between tho operands , operand are the value or
        // variable in which operations being performed

        int mySecondNumber = 12 , myThirdNumber = 6;

        // * we can use variable name in the expression
        int myTotal = mySecondNumber+myThirdNumber+myFirsNumber;
        System.out.println(myTotal);

        // * we can also assign a variable to another value or an expression with a literal and a variable ;
        myFirsNumber = mySecondNumber*2;

        // * since we changed the value after the declaring th myTotal variable , it will still use the old value while
        // printing it , so we have to declare it again for using updated values before printing.
        myTotal = mySecondNumber+myThirdNumber+myFirsNumber;
        System.out.println(myTotal);

        // * print statement gives the same type of data that the printing variable has
        int myLastOne = myTotal - 1000;
        System.out.println(myLastOne);

        // * so far we have been using int data type , which is a primitive data type or a basic data type , there are
        // also non-primitive data type.
        // * there are 8 primitive data types in java -> byte , short , int , long , float , double , char , boolean



    }
}
