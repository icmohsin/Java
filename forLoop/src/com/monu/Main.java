package com.monu;

public class Main {

    public static void main(String[] args) {
        // write your code here
        for (int i = 2; i <= 8; i++) {
            double val;
            double val2 = i;
            val = (10000 * (val2 / 100));
            // System.out.println("10,000 at " + i + "% intrest = " + String.format("%.2f",val));
        }
        System.out.println("****************************************");
        for (int i = 8; i >= 2; i--) {
            double val;
            double val2 = i;
            val = (10000 * (val2 / 100));
            // System.out.println("10,000 at " + i + "% intrest = " + String.format("%.2f",val));
        }
        System.out.println("output is : " + sumOdd(100,100));



//    boolean Prime = isPrime(2);

//    if Prime = "true"{
//        System.out.println("Prime");
//    }else {
//        System.out.println("Not");
//    }

//        int count = 0;
//
//        for (int i = 10; i < 50; i++) {
//            if (isPrime(i)) {
//                count++;
//                System.out.println("Number " + i + " is a prime number");
//            }
//            if (count == 10) {
//                System.out.println("Loop exit");
//                break;
//            }
//        }


        // check number div. by 3 and 5 ass.

/*
        int cnt = 0;
        int num =0;
        for (int i = 1; i <=1000; i++) {
            if ((i%3 ==0) && (i%5==0)){
                cnt = cnt +1;
                num = num+i;
                System.out.println("the number is " + i);
                if (cnt ==5) {
                    System.out.println("all number that meet the condition are " + num);
                    break;
                }
            }
        }
*/


//        public static boolean isPrime(int n){
//            if (n == 1) {
//                return false;
//            }
//            for (int i = 2; i <= n / 2; i++) {
//                if (n % i == 0) {
//                    return false;
//                }
//            }
//            return true;
//        }
    }

    // calculate prime numbers
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //calculation sum odd
    public static boolean isOdd (int number){
        if  (number <= 0) {
            return false;
        }

        if (number % 2 ==0 ) {
            return false;
        }else {
            return true;
        }
    }

    public static int sumOdd (int start, int end) {
        int sum = 0;
//        if (end == start){
//            return 0;
//        }
        if ((end >= start) && (start > 0) && (end > 0)) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i))  {
                    sum = sum + i;
                }
              //  return sum;
            }
        } else {
            sum = -1;
        }
        return sum;
    }

}