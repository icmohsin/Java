package com.monu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        numberToWords(1010);
     //   System.out.println(getDigitCount(100));
    }

    public static void numberToWords (int number){
        int val=0;
        int digetcnt = getDigitCount(number);

        number = reverse(number);
        int input = ((number-digetcnt)*-1);
        if (number > 0) {
            while(number >0) {
                val = number%10;

                number = number/10;

                switch(val){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
            }
        while (input > 0 ) {
            System.out.println("Zero");
            input --;
        }
//            for (int i=0;i<number;i++){
//                System.out.println(i);
//            }
        }else{
            System.out.println("Invalid Value");
        }
    }

    public static int reverse(int value) {
        int reverse = 0;
        int  num = value;
        while (num > 0) {
            reverse = ((reverse*10) + (num % 10));
            num = num/10;
        }
        return reverse;
    }

    public static int getDigitCount(int cnt) {
        int count = 0;
        if (cnt == 0){
            return 1;
        }else if (cnt < 0) {
            return -1;
        }


        while (cnt > 0) {
            count ++;
            cnt = cnt/10;
        }
        return count;
    }
}
