// Author:- TheAjayGurjar { bsag0001@gmail.com }

public class FloatDouble {

    public static void main(String[] args) {

        // * let's see floating point numbers , which are generally decimal . there are two of it data types namely
        // float and double . float is a single precision number and double is a double precision numbers .

        // precision refers to the format and amount of space occupied by the type . float occupies 32 bits and
        // double 64 bits , as a result float has range from 1.4E-45 to 3.4028235E+38 and double is more precise
        // with a range of 4.9E-324 to 1.7976931348623457E+308.

        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("max value of float data type is : "+maxFloatValue);
        System.out.println("min value of float data type is : "+minFloatValue);

        // * lets see double floating pont values
        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("max value of double data type is : "+maxDoubleValue);
        System.out.println("min value of double data type is : "+minDoubleValue);

        int myIntValue = 5 ;
        System.out.println(myIntValue);
        float myFloatValue = 5 ;
        System.out.println(myFloatValue);
        double myDoubleValue = 5 ;
        System.out.println(myDoubleValue);

        // * now as we have seen previously that by default integer number is considered as int data type in java same
        // is applied to floating point numbers as all floating point numbers are considered double in java.

        myIntValue = (int)6.5 ;// manually typecasting float to int
        System.out.println(myIntValue);
        myFloatValue = 5.5f ;// manually typecasting double to float
        System.out.println(myFloatValue);
        myDoubleValue = 5.5d ;// manually typecasting floating point to double but this happens automatically
        System.out.println(myDoubleValue);

        // * we do manually typecast because big data type cannot be converted to small data type automatically

        // lets do some division
        myIntValue = 5/3 ;//gives integer value as literal are by default int data type, expression is int in java.
        System.out.println(myIntValue);

        myFloatValue = 5f/3f ;// manually typecasting int to float
        System.out.println(myFloatValue);

        myDoubleValue = 5d/3d ;// manually typecasting int to double
        System.out.println(myDoubleValue);

        // let's have fun
        System.out.println();
        double weightInPounds = 200d ;
        double weightInKilograms = weightInPounds*0.45359237d;
        System.out.println(weightInPounds+" pounds are "+weightInKilograms+" kilograms");

        // * its okh to use double and float in daily use but for scientific calculation we have to use the BigDecimal
        // class of java for precision


    }
}
