// Author:- TheAjayGurjar { bsag0001@gmail.com }

// Print Day by day Number both with if and switch

public class Challenge1 {

        public static void main(String[] args) {
            printDayOfTheWeek(8);
            printDayOfTheWeek(1);
            int day = 3;
            if(day==0)
                System.out.println("Sunday");
            else if (day==1)
                System.out.println("Monday");
            else if (day==2)
                System.out.println("Tuesday");
            else if (day==3)
                System.out.println("Wednesday");
            else if (day==4)
                System.out.println("Thursday");
            else if (day==5)
                System.out.println("Friday");
            else if (day==6)
                System.out.println("Saturday");
            else
                System.out.println("Invalid Day");

        }
        public static void printDayOfTheWeek(int day){
            switch(day){
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Invalid Day");
                    break;

            }
        }
    }


