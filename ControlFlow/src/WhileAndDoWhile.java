// Author:- TheAjayGurjar { bsag0001@gmail.com }

public class WhileAndDoWhile {

    public static void main(String[] args) {

        // * sometimes while looping instead of looping till a certain value is true like we did in for loop , we want to loop
        // till a value is false ,
        // * or sometimes we don't know for how many times we have to loop
        // * in while loop we don't  specify to terminate point instead we provide a boolean expression and run the loop till
        // that expression return true or false

        int count = 0;

        // syntax for while loop is given below it will run till the expression in parentheses returns true
        while (count != 6) {
            System.out.println("count value is :1 " + count);
            count++; // this increment is necessary to prevent the infinite loop to formed
        }
        // equivalent for loop will
        for (int i = 0; i < 6; i++) { // infinite loop will be formed if the termination condition is never achieved
            // like i<-1
            System.out.println("count value is :2 " + i);// we used i instead of count here cuz we have defined i
            // variable in for loop
        }

        // other example of while can be
        count = 1;

        // * in this loop we will always do our looping . but if a condition matches we will break our looping and come
        // out of the loop
        // * in above while loop we didn't go inside the loop if some condition matches , but in this case we are
        // thrown put of the loop if a condition is fulfilled or matched
        while (true) {
            if (count == 6)
                break;
            System.out.println("count value is :3 " + count);
            count++;}// this increment is necessary to prevent the infinite loop to formed

        // * sometimes code never gets in the while loop like
        // if we do this the loop never start
        while (count != 6) {
            System.out.println("count value is :4 " + count);
            count++; }// this increment is necessary to prevent the infinite loop to formed

        // but a third type of loop -> do while loop has an advantage that it will at least run once no mater
        // what the condition is or id returns true or not, syntax is given below
        do {
            System.out.println("count value is -> " + count);
            count++;// now this is creating an infinite loop as this code wil run and make count = 7 , and
            // after that it will always go to increment,
            // so we add a break statement
            if(count>100)
                break;
        } while (count != 6);



        // using isEvenNumber method
        int number = 4;
        int finishNumber = 20;
        count=0;
        while(number<=finishNumber){
            number++;
            if(!isEvenNumber(number)){

                continue;// continue statement is totally different to the brake statement : break statement stops
                // the execution of loop once the condition in break statement is reached but continue statement
                // doesn't stop the execution of loop instead it skips the later code inside the block and starts
                // the loop from starting , if the condition inside the continue statement is reached.

            }
            count++;
            System.out.println(count+". Even number "+ number);
            if(count==5)
                break;

        }






    }
    public static boolean isEvenNumber(int n){
        return n % 2 == 0;
    }
}

