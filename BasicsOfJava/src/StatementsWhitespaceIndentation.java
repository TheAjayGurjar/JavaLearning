// Author:- TheAjayGurjar { bsag0001@gmail.com }

public class StatementsWhitespaceIndentation {

    public static void main(String[] args) {

        // * statement is a combination of data type, expression and semicolon ending the line

        // method call is also a statement

        int myVariable = 50;
        //  int myVariable=50; is a statement

        myVariable++;
        //     myVariable++;    is a statement

        myVariable--;
        //   myVariable--;    is a statement

        System.out.println("this is test");
        // System.out.println("this is test");  is a statement.

        // * statement can be written in multiple lines
        System.out.println("this is" +
                " another " +
                "test");

        // * multiple statement can be written in single line, semicolon ends the line

        int anotherVariable = 50;
        myVariable--;
        System.out.println("this is another one");
        System.out.println(myVariable);

        // * whitespaces are the extra spaces that we use in our code , java generally delete these spaces internally
        int Variable
                = 50;
        // * but we cannot use the white spaces between the names and literals

        // * indentation helps the code readable by letting us know in which black we are using , by showing u the level
        // vertical lines in the left are indenting line
        // if you missed the indenting than you can go to code then on reformat code, and it will automatically
        // indent your code

        // * shortcut for reformat code is ctrl + alt + l


    }
}
