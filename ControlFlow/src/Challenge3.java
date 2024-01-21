// Author:- TheAjayGurjar { bsag0001@gmail.com }

// Sum of all n0. divisible by 3 and 5 below 1000.

public class Challenge3 {

    public static void main(String[] args) {
        int sum = 0,count=0;
        for(int i=1; i<=1000;i++){
            if(((i%3)==0)&&((i%5)==0)){
                count++;
                System.out.println(count+". number that divide by 3 and 5 both is : "+i);
                sum+=i;
            }
            if(count==5)
                break;
        }
        System.out.println("sum of all the 5 numbers above is : "+sum);
    }
}
