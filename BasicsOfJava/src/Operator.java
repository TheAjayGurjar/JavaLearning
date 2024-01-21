// Author:- TheAjayGurjar { bsag0001@gmail.com }

public class Operator{

    public static void main(String[] args) {

        // * operator in java are special symbols that perform specific operations on 1,2, or three operands, and then
        // return a result.

        /* * as an example we used the + operator to sum the values in previous code
          double myDouble = 120.47d;
         lastString=lastString+myDouble; */

        // * an operand is a term is used to describe any object that is manipulated by operator .
        // lastString=lastString+myDouble; here + is an operator and lastString, myDouble are operands.

        // * an expression is formed by combining variables , literals, methods return values (which we
        // haven't covered yet) and operators. lastString+myDouble is an expression.

        // below we are using = which is an assignment operator means assign the right-hand side value to left
        // hand side variable , + which is an arithmetic operator does arithmetic operation between operands.
        int result = 1+2; // 1+2=3
        System.out.println(result);

        // " // " is used to comment out code , Comments are ignored by the computers and are added to a program
        // to help describe something. Comments are there for humans.

        // * arithmetic operator

        // * Addition(+): This operator is a binary operator and is used to add two operands.
        // initializing variables
        int num1 = 10, num2 = 20, sum ;
        // Displaying num1 and num2
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        // adding num1 and num2
        sum = num1 + num2;
        System.out.println("The sum = " + sum);

        //Subtraction(-): This operator is a binary operator and is used to subtract two operands.
        // initializing variables
        num1 = 20; num2 = 10;
        int sub;
        // Displaying num1 and num2
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        // subtracting num1 and num2
        sub = num1 - num2;
        System.out.println("Subtraction = " + sub);

        //Multiplication(*): This operator is a binary operator and is used to multiply two operands.
        // initializing variables
        int multi;
        // Displaying num1 and num2
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        // Multiplying num1 and num2
        multi = num1 * num2;
        System.out.println("Multiplication = " + multi);

        //Division(/): This is a binary operator that is used to divide the first operand(dividend) by the second
        // operand(divisor) and give the quotient as result.
        int div;
        // Displaying num1 and num2
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        // Dividing num1 and num2
        div = num1 / num2;
        System.out.println("Division = " + div);

        //Modulus(%): This is a binary operator that is used to return the remainder when the first operand(dividend)
        // is divided by the second operand(divisor).
        num1 = 5; num2 = 2;
        int mod;
        // Displaying num1 and num2
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        // Remaindering num1 and num2
        mod = num1 % num2;
        System.out.println("Remainder = " + mod);

        //Increment(++): This is a unary operator that acts on one operand, unlike the previous operations.
        // It is used to increment the value of an integer. It can be used in two ways:

        //Post-increment operator: When placed after the variable name, the value of the operand is incremented but the
        // previous value is retained temporarily until the execution of this statement, and it gets updated before
        // the execution of the next statement.

        //Pre-increment operator: When placed before the variable name, the operand’s value is incremented instantly.

        // initializing variables
        int num = 5;
        // first 5 gets printed and then
        // increment to 6
        System.out.println("Post "
                + "increment = " + num++);
        // num was 6, incremented to 7
        // then printed
        System.out.println("Pre "
                + "increment = " + ++num);

        //Decrement(–): This is also a unary operator that acts on one operand. It is used to decrement the value of
        // an integer. It can be used in two ways:

        //Post-decrement operator: When placed after the variable name, the value of the operand is decremented but
        // the previous values is retained temporarily until the execution of this statement, and it gets updated before
        // the execution of the next statement.

        //Pre-decrement operator: When placed before the variable name, the operand’s value is decremented instantly.
        // first 5 gets printed and then

        // decremented to 4
        System.out.println("Post "
                + "decrement = " + num--);
        System.out.println("num = " + num);
        // num was 4, decremented to 3
        // then printed
        System.out.println("Pre "
                + "decrement = " + --num);

        // * unary operator
        //Java unary operators are the types that need only one operand to perform any operation like increment,
        // decrement, negation etc. It consists of various arithmetic, logical and other operators that operate on a
        // single operand. Let’s look at the various unary operators in detail and see how they operate.

        //Unary minus(-): This operator can be used to convert a negative value to a positive one.
        // variable declaration
        int n1 = 20;
        System.out.println("Number = " + n1);
        // Performing unary operation
        n1 = -n1;
        // Print the result number
        System.out.println("Result = " + n1);

        //‘NOT’ Operator(!): This is used to convert true to false or vice versa. Basically it reverses the logical
        // state of an operand.
        // initializing variables
        boolean cond = true;
        int a = 10, b = 1;
        // Displaying cond, a, b
        System.out.println("Cond is: " + cond);
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);
        // Using unary NOT operator
        System.out.println("Now cond is: " + !cond);
        System.out.println("!(a < b) = " + !(a < b));
        System.out.println("!(a > b) = " + !(a > b));

        //Increment(++): It is used to increment the value of an integer. It can be used in two separate ways:
        //Post-increment operator: When placed after the variable name, the value of the operand is incremented but
        // the previous value is retained temporarily until the execution of this statement, and it gets updated before
        // the execution of the next statement.
        //Pre-increment operator: When placed before the variable name, the operand’s value is incremented instantly.

        //Decrement(--): It is used to decrement the value of an integer. It can be used in two separate ways:
        //Post-decrement operator: When placed after the variable name, the value of the operand is decremented but
        // the previous values is retained temporarily until the execution of this statement, and it gets updated before
        // the execution of the next statement.
        //Pre-decrement operator: When placed before the variable name, the operand’s value is decremented instantly.

        //Bitwise Complement(~): This unary operator returns the one’s complement representation of the input value or
        // operand, i.e, with all bits inverted, means it makes every 0 to 1, and every 1 to 0.
        // variable declaration
        //a = 5 [0101 in Binary]
        //result = ~5
        //This performs a bitwise complement of 5
        //~0101 = 1010 = 10 (in decimal)
        //Then the compiler will give 2’s complement
        //of that number.
        //2’s complement of 10 will be -6.
        //result = -6
        n1 = 6;
        int n2 = -2;
        // Displaying numbers
        System.out.println("First Number = " + n1);
        System.out.println("Second Number = " + n2);
        // Performing bitwise complement
        System.out.println(n1 + "'s bitwise complement = " + ~n1);
        System.out.println(n2 + "'s bitwise complement = " + ~n2);

        // * assignment operator
        // These operators are used to assign values to a variable. The left side operand of the assignment operator
        // is a variable and the right side operand of the assignment operator is a value. The value on the right side
        // must be of the same data-type of the operand on the left side otherwise the compiler will raise an error.
        // This means that the assignment operators have right to left associativity, i.e. value given on the right-hand
        // side of the operator is assigned to the variable on the left and therefore right-hand side value must be
        // declared before using it or should be a constant.

        //“=”: This is the simplest assignment operator which is used to assign the value on the right to the variable
        // on the left. This is the basic definition of assignment operator and how does it function.
        String name;
        // Assigning values
        num = 10;
        name = "GeeksGeeks";
        // Displaying the assigned values
        System.out.println("num is assigned: " + num);
        System.out.println("name is assigned: " + name);

        //“+=”: This operator is a compound of ‘+’ and ‘=’ operators. It operates by adding the current value of
        // the variable on left to the value on the right and then assigning the result to the operand on the left.
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        // Adding & Assigning values
        num1 += num2;
        // Displaying the assigned values
        System.out.println("num1 = " + num1);

        //“-=”: This operator is a compound of "-" and ‘=’ operators. It operates by subtracting the value of the
        // variable on right from the current value of the variable on the left and then assigning the result to the
        // operand on the left.
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        // Subtracting & Assigning values
        num1 -= num2;
        // Displaying the assigned values
        System.out.println("num1 = " + num1);

        //“*=”: This operator is a compound of ‘*’ and ‘=’ operators. It operates by multiplying the current value of
        // the variable on left to the value on the right and then assigning the result to the operand on the left.
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        // Multiplying & Assigning values
        num1 *= num2;
        // Displaying the assigned values
        System.out.println("num1 = " + num1);

        //“/=”: This operator is a compound of ‘/’ and ‘=’ operators. It operates by dividing the current value of the
        // variable on left by the value on the right and then assigning the quotient to the operand on the left.
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        // Dividing & Assigning values
        num1 /= num2;
        // Displaying the assigned values
        System.out.println("num1 = " + num1);

        //“%=”: This operator is a compound of ‘%’ and ‘=’ operators. It operates by dividing the current value of
        // the variable on left by the value on the right and then assigning the remainder to the operand on the left.
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        // Module ing & Assigning values
        num1 %= num2;
        // Displaying the assigned values
        System.out.println("num1 = " + num1);

        // * relational operator
        //These are a bunch of binary operators that are used to check for relations between two operands including
        // equality, greater than, less than etc. They return a boolean result after the comparison and are extensively
        // used in looping statements as well as conditional if-else statements and so on.

        //‘Equal to’ operator (==): This operator is used to check whether the two given operands are equal or not.
        // The operator returns true if the operand at the left-hand side is equal to the right-hand side, else false.
        int var1 = 5, var2 = 10, var3 = 5;
        // Displaying var1, var2, var3
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);
        // Comparing var1 and var2
        System.out.println("var1 == var2: "
                + (var1 == var2));
        // Comparing var1 and var3
        System.out.println("var1 == var3: "
                + (var1 == var3));

        //‘Not equal to’ Operator(!=): This operator is used to check whether the two given operands are equal or not.
        // It functions opposite to that of the equal-to operator. It returns true if the operand at the left-hand
        // side is not equal to the right-hand side, else false.
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);
        // Comparing var1 and var2
        System.out.println("var1 == var2: "
                + (var1 != var2));
        // Comparing var1 and var3
        System.out.println("var1 == var3: "
                + (var1 != var3));

        //‘Greater than’ operator(>): This checks whether the first operand is greater than the second operand or not.
        // The operator returns true when the operand at the left-hand side is greater than the right-hand side.
        // Displaying var1, var2, var3
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);
        // Comparing var1 and var2
        System.out.println("var1 > var2: "
                + (var1 > var2));
        // Comparing var1 and var3
        System.out.println("var3 > var1: "
                + (var3 >= var1));

        //‘Less than’ Operator(<): This checks whether the first operand is less than the second operand or not.
        // The operator returns true when the operand at the left-hand side is less than the right-hand side.
        // It functions opposite to that of the greater than operator.
        // Displaying var1, var2, var3
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);
        // Comparing var1 and var2
        System.out.println("var1 < var2: "
                + (var1 < var2));
        // Comparing var2 and var3
        System.out.println("var2 < var3: "
                + (var2 < var3));

        //'Greater than or equal to' operator(>=): This checks whether the first operand is greater than or equal to
        // the second operand or not. The operator returns true when the operand at the left-hand side is greater than
        // or equal to the right-hand side.
        // Displaying var1, var2, var3
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);
        // Comparing var1 and var2
        System.out.println("var1 >= var2: "
                + (var1 >= var2));
        // Comparing var2 and var3
        System.out.println("var2 >= var3: "
                + (var3 >= var1));

        //'Less than or equal to' Operator(<=): This checks whether the first operand is less than or equal to
        // the second operand or not. The operator returns true when the operand at the left-hand side is less than
        // or equal to the right-hand side.
        // Displaying var1, var2, var3
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);
        // Comparing var1 and var2
        System.out.println("var1 <= var2: "
                + (var1 <= var2));
        // Comparing var2 and var3
        System.out.println("var2 <= var3: "
                + (var2 <= var3));

         // * now before starting to the next operator we have known about if then statement
         // * if-then statement is the most basic of all the control flow statements, it tells your program to execute
         // a certain section of code only if a particular test evaluates to true . this is known as conditional logic.
         // * conditional logic uses specific statement in java to allow us to check a condition and execute certain
         // code based on whether tht condition (the expression) is true or false.
         // * if statement always allows one statement to run without code blocks, but we always use code block in
         // practise

         // * logical operator
         //These operators are used to perform logical AND, OR and NOT operation, i.e. the function similar to
         // AND gate and OR gate in digital electronics. They are used to combining two or more conditions/constraints or
         // to complement the evaluation of the original condition under particular consideration.

         // One thing to keep in mind is the second condition is not evaluated if the first one is false, i.e.
         // it has a short-circuiting effect. Used extensively to test for several conditions for making a decision.

         //‘Logical AND’ Operator(&&): This operator returns true when both the conditions under consideration are
         // satisfied or are true. If even one of the two yields false, the operator results false. For example,
         // cond1 && cond2 returns true when both cond1 and cond2 are true (i.e. non-zero).
         // initializing variables
         a = 10; b = 20; int c = 20;int d ;
         // Displaying a, b, c
         System.out.println("Var1 = " + a);
         System.out.println("Var2 = " + b);
         System.out.println("Var3 = " + c);
         // using logical AND to verify
         // two constraints
         if ((a < b) && (b == c)) {
         d = a + b + c;
         System.out.println("The sum is: " + d);
         }
         else
         System.out.println("False conditions");

         //'Logical OR' Operator(||): This operator returns true when one of the two conditions under consideration
         // are satisfied or are true. If even one of the two yields true, the operator results true. To make the
         // result false, both the constraints need to return false.
         b = 1; c = 10; d = 30;

         // Displaying a, b, c
         System.out.println("Var1 = " + a);
         System.out.println("Var2 = " + b);
         System.out.println("Var3 = " + c);
         System.out.println("Var4 = " + d);
         // using logical OR to verify
         // two constraints
         if (a > b || c == d)
         System.out.println("One or both"
         + " the conditions are true");
         else
         System.out.println("Both the"
         + " conditions are false");

         //'Logical NOT' Operator(!): Unlike the previous two, this is a unary operator and returns true when the
         // condition under consideration is not satisfied or is a false condition. Basically, if the condition is
         // false, the operation returns true and when the condition is true, the operation returns false.
         // Displaying a, b, c
         System.out.println("Var1 = " + a);
         System.out.println("Var2 = " + b);
         // Using logical NOT operator
         System.out.println("!(a < b) = " + !(a < b));
         System.out.println("!(a > b) = " + !(a > b));

         // * let's have fun
         int newValue = 50 ;
         // if(newValue=50){
         // System.out.println("this is an error");
        // this gave error because in parentheses we are using assignment operator which at the end provides te int
        // value but a boolean value is required, so we use == operator
        if(newValue==50){
            System.out.println("this is an true");
        }

        boolean isCar = false;
        if(isCar=true){
            System.out.println("this is not supposed to happen");
            // but this happens because een used assignment operator the expression is providing a boolean value which
            // is true and is excepted by the if statement, and it runs.
        }

        isCar = false;
        if(isCar==true){
            System.out.println("this is not running");
            // since we use comparing operator code does as it should be
        }

        // * ternary operator
        //Java ternary operator is the only conditional operator that takes three operands.
        // It’s a one-liner replacement for if-then-else statement and used a lot in Java programming.
        // We can use the ternary operator in place of if-else conditions or even switch conditions using
        // nested ternary operators. Although it follows the same algorithm as of if-else statement,
        // the conditional operator takes less space and helps to write the if-else statements in the shortest
        // way possible.

        /*Syntax
        variable = Expression1 ? Expression2: Expression3

        If operates similarly to that of the if-else statement as in Expression2 is executed if Expression1 is true
        else Expression3 is executed.
        if(Expression1)
        {
            variable = Expression2;
        }
        else
        {
            variable = Expression3;
        }

         Example:
       num1 = 10;
       num2 = 20
      res=(num1>num2) ? (num1+num2):(num1-num2)
      Since num1<num2,
      the second operation is performed
      res = num1-num2 = -10 */

        // variable declaration
        n1 = 5; n2 = 10; int max;

        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);
        // Largest among n1 and n2
        max = (n1 > n2) ? n1 : n2;
        // Print the largest number
        System.out.println("Maximum is = " + max);
        int res;
        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);
        // Performing ternary operation
        res = (n1 > n2) ? (n1 + n2) : (n1 - n2);
        // Print the largest number
        System.out.println("Result = " + res);

        // * some operator which we use later in the codes
        /*

        Bitwise Operators : These operators are used to perform manipulation of individual bits of a number.
         They can be used with any of the integer types. They are used when performing update and query operations of
         Binary indexed tree.

        &, Bitwise AND operator: returns bit by bit AND of input values.
        |, Bitwise OR operator: returns bit by bit OR of input values.
        ^, Bitwise XOR operator: returns bit by bit XOR of input values.
        ~, Bitwise Complement Operator: This is a unary operator which returns the one’s compliment representation of
        the input value, i.e. with all bits inverse.

        Shift Operators : These operators are used to shift the bits of a number left or right thereby multiplying or
        dividing the number by two respectively. They can be used when we have to multiply or divide a number by two.
        General format-number shift_op number_of_places_to_shift;
            <<, Left shift operator: shifts the bits of the number to the left and fills 0 on voids left as a result. Similar
            effect as of multiplying the number with some power of two.
            >>, Signed Right shift operator: shifts the bits of the number to the right and fills 0 on voids left as a result.
            The leftmost bit depends on the sign of initial number. Similar effect as of dividing the number with some power of two.
            >>>, Unsigned Right shift operator: shifts the bits of the number to the right and fills 0 on voids left as a result.
            The leftmost bit is set to 0.

       instance of operator : Instance of operator is used for type checking. It can be used to test if an object is an
       instance of a class, a subclass or an interface. General format-

        // * Precedence and Associativity of Operators
        // * Precedence and associative rules are used when dealing with hybrid equations involving more than one type of
        // operator. In such cases, these rules determine which part of the equation to consider first as there can be
        // many valuations for the same equation. The below table depicts the precedence of operators in
        // decreasing order as magnitude with the top representing the highest precedence and bottom shows the lowest
        // precedence. ( precedence table refer to oracle )

         */

        // let's have fun
        double z = 20d, y = 80d , x = 100d*(z+y) , w = x%40d;
        boolean k = (w==0) ?true:false ;
        System.out.println(k);
        if(!k){
            System.out.println("got some remainder");
        }



    }
}

