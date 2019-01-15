package com.monu;

public class Main {

    public static void main(String[] args) {
        // write your code here
       // System.out.println(sumDigit(125));
//        if (isPalindrome(11)) {
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        };

       // System.out.println("sum is : " + sumFirstAndLastDigit(-10));
    //    System.out.println("sum is : " + getEvenDigitSum(-22));

/*        if (hasSharedDigit(12,43)) {
            System.out.println("true");
        }else{
            System.out.println("false");
       };*/

/*
        if (hasSameLastDigit(43,22,71)) {
            System.out.println("true");
        }else{
            System.out.println("false");
        };

        System.out.println(getGreatestCommonDivisor(25,15));
*/

        printFactors(-1);
    }
    private static int sumDigit(int number) {
        if (number <10){
            return -1;
        }

        int sum =0;
        //123 -> 125/10 = 12 -> 12*10 = 120 -> 125-120 =5
        while (number >0){
            // extract lease sig. digit
            int digit = number % 10;
            sum += digit;

            //drop lease sig. digit

            number /= 10; //number =number/10

        }
        return sum;
    }

    public static boolean isPalindrome (int number) {
      int reverse = 0;

        if (number < 0 ) {
            number = (number *-1);
        }

      int  num = number;

      while (num > 0) {
          reverse = ((reverse*10) + (num % 10));
          num = num/10;

      }


      if (reverse == number) {
          return true;
      }else {
          return false;
      }
    }

    public static int sumFirstAndLastDigit (int number) {
        int first =0;
        int cnt =0;
        int sum =0;
        if (number < 0) {
            return -1;
        }

        while (number > 0) {
            if (cnt == 0){
                first = number % 10;
            }
            cnt ++;
            sum = number/10;
            if (sum ==0) {
                sum = number;
                number = 0;
            }else {
                number = sum;
            }

        }
        sum =sum+first;
        return sum;
    }

    public static int getEvenDigitSum (int number) {
        int val = 0;
        int even = 0;
        if (number < 0 ){
            return -1;
        }
        while (number >0){
            val = number%10;
            number = number/10;
            if ((val % 2) == 0) {
                even += val;
            }
        }
        return even;
    }

    public static boolean hasSharedDigit (int num1, int num2){
        if (((num1 <10) || (num1 > 99)) || ((num2 <10) || (num2 > 99))) {
            return false;
        }


        if (((num1%10)==(num2%10)) || ((num1%10)==(num2/10)) || ((num1/2==(num2%10))) || ((num1/10==(num2/10))) ){
            return true;
        }

        return false;
    }

    public static boolean hasSameLastDigit (int num1,int num2,int num3) {
        if (((num1 <10) || (num1 > 1000)) || ((num2 <10) || (num2 > 1000)) || ((num3 <10) || (num3 > 1000)) ) {
            return false;
        }

        int num1last = num1%10;
        int num2last = num2%10;
        int num3last = num3%10;

        if ((num1last == num2last) || (num1last == num3last ) || (num2last == num3last) ) {
            return true;
        }


        return false;
    }

    public static int getGreatestCommonDivisor (int first, int second) {
        if ((first <10)||(second <10)) {
            return -1;
        }
        int num = 0;
        if (first > second){
            num = first;
        }else{
            num = second;
        }

        for (int i = num; i>0;i--){
            if (((first % i) ==0) && (((second % i) ==0))) {
                return i;
            }
        }
        return -1;
    }

    public static void printFactors (int number) {
        if (number < 1) {
            System.out.println("Invalid Values");

        }else {
            for (int i = 1;i <= number;i++){
                if (number%i==0) {
                    System.out.println(i);
                }
            }
        }
    }
}


