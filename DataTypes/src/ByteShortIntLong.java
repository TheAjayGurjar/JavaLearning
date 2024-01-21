// Author:- TheAjayGurjar { bsag0001@gmail.com }

public class ByteShortIntLong {

    public static void main(String[] args) {

        // * java doesn't read underscore, or we can say it ignores them, so we will use them to make long
        // numbers readable
        int myValue = 10_000;

        System.out.println(myValue);
        // * all data type has a range of numbers that they can store  , because each data type has different memory
        // size in RAM

        // * int is a primitive data type whereas Integer is wrapper class
        // * java uses the concept of wrapper class for all 8 primitive data types , for int we have Integer and
        // by using it we can perform various operation on int
        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;

        // * we are using string on one side of the + operator and on other side is an int type but java converts
        // the other data type to string before printing
        System.out.println("Integer minimum value is : "+ minIntValue);
        System.out.println("Integer maximum value is : "+ maxIntValue);

        // * if we try to add one more count to the maximum value of int data type and store it in int data type,
        // it doesn't fit but computer anyway try to fit it and the value overflows and this converts the max value
        // to min value and then adds the number , this is called overflow and the reverse is also tru in case of
        // subtracting one from the min value and storing it in the int data type, but this is known as underflow.
        System.out.println("Busted max value of int : "+(maxIntValue+1));
        System.out.println("Busted min value of int : "+(minIntValue-1));

        // * let's check for the byte data type
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;

        // * we are using string on one side of the + operator and on other side is a byte type but java converts
        // the other data type to string before printing
        System.out.println("Byte minimum value is : "+ minByteValue);
        System.out.println("Byte maximum value is : "+ maxByteValue);

        // * if we try to add one more count to the maximum value of byte data type and store it in byte data type,
        // it doesn't fit but computer anyway try to fit it and the value overflows and this converts the max value
        // to min value and then adds the number , this is called overflow and the reverse is also tru in case of
        // subtracting one from the min value and storing it in the byte data type   , but this is known as underflow.
        // we see that no overflow or underflow happened because java considers every integer number as int data type
        // by default after operation or output of the expression like (maxByteValue+1) and int has large range
        System.out.println("Busted max value of byte : "+(maxByteValue+1));
        System.out.println("Busted min value of byte : "+(minByteValue-1));

        // * let's check for the Short data type
        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;

        // * we are using string on one side of the + operator and on other side is a short type but java converts
        // the other data type to string before printing
        System.out.println("Short minimum value is : "+ minShortValue);
        System.out.println("Short maximum value is : "+ maxShortValue);

        // * if we try to add one more count to the maximum value of short data type and store it in short data type,
        // it doesn't fit but computer anyway try to fit it and the value overflows and this converts the max value
        // to min value and then adds the number , this is called overflow and the reverse is also tru in case of
        // subtracting one from the min value and storing it in the short data type   , but this is known as underflow.
        // we see that no overflow or underflow happened because java considers every integer number as int data type
        // by default after operation or output of the expression like (maxShortValue+1) and int has large range
        System.out.println("Busted max value of short : "+(maxShortValue+1));
        System.out.println("Busted min value of short : "+(minShortValue-1));

        // * we can use search and replace function of idea intellij by using (ctrl + R command)

        // * size(width) of primitive data types in the RAM is as follows -> byte-8bits(1 byte),short-16bits(2 byte)
        // ,int-32bits(4 byte)

        // * let's check for the long data type

        // we know that java considers the integer number as int data type by default, so we use L in the end of the
        // number to tell java that consider it as long data type , we didn't use the same for byte and short . we will
        // see why in typecasting topic.

        //  long has the width f 64 bits
        long myLongValue = 100L;
        System.out.println(myLongValue);
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;

        // * we are using string on one side of the + operator and on other side is a long type but java converts
        // the other data type to string before printing
        System.out.println("Long minimum value is : "+ minLongValue);
        System.out.println("Long maximum value is : "+ maxLongValue);

        // * if we try to add one more count to the maximum value of long data type and store it in long data type,
        // it doesn't fit but computer anyway try to fit it and the value overflows and this converts the max value
        // to min value and then adds the number , this is called overflow and the reverse is also tru in case of
        // subtracting one from the min value and storing it in the long data type   , but this is known as underflow.
        System.out.println("Busted max value of long : "+(maxLongValue+1));
        System.out.println("Busted min value of long : "+(minLongValue-1));

        // * a default whole number is int in java that is why long bigLongLiteralValue = 2_147_483_647_234; gives
        // error, so we use L to tell java treat it as long.
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        // * however, in case of short java smartly understood it as a short type , we can say that literal value can
        // be assigned to small data type than int without any problem, but they should be in their respective range.
        // like short bigShortLiteralValue = 32768; will give error as the number is out of range of the short
        // data type
        short bigShortLiteralValue = 32767;
        System.out.println(bigShortLiteralValue);

        // * now lets talk about typecasting

        // * if literal value is assigned to the variable small data type than int java smartly understood
        // that(automatic typecasting) , but if literal value is provided to the bigger data type than int we have
        // to assign the L at the end of value (manual typecasting), this can also be done by java automatically.
        // * also, if the literal value is not provided to the variable than the default integer number value is
        // considered as int type in java.( ALL THIS HAPPENS IN INTEGRAL TYPE DATA TYPES)

        // so , when java doesn't automatically typecast the one data type to another we typecast it manually by
        // adding the name of data type before the number, value, or expression in the parenthesis

        int myTotal = (minIntValue/2);// automatically typecast
        System.out.println(myTotal);

        byte myNewByteValue = (byte)(minByteValue/2);// manually typecasting as java is considering as int type
        // because it doesn't kno  about variable whether it wil fit inside the byte or not while it was not the case in
        // literal value, Also every expression is considered as Int in java.
        System.out.println(myNewByteValue);

        short myNewShortValue = (short)(minShortValue/2);// manually typecasting as java is considering as int type
        // because it doesn't kno  about variable whether it wil fit inside the byte or not while it was not the case in
        // literal value, Also every expression is considered as Int in java. and expression can result in any value.
        System.out.println(myNewShortValue);

        // * now let's have some fun
        System.out.println();
        System.out.println();
        byte b = 67 ;
        short s = 267 ;
        int i =  45675 ;
        long l = 1000 + 10*(b+s+i);
        System.out.println(l);
        short newS = (short)(1000 + 10*(b+s+i));
        System.out.println(newS);






    }
}
