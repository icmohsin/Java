package com.monu;

public class Main {

    public static void main(String[] args) {
        //example for switch statement
        int value = 1;
        if (value == 1) {
            System.out.println("value was 1");
        } else if (value == 2) {
            System.out.println("value was 2");
        } else {
            System.out.println("was not 1 or 2");
        }


        // writing the same above code in switch statements

        int val = 8;

        switch (val) {
            case 1:
                System.out.println("value is 1");
                break;

            case 2:
                System.out.println("Value is 2");
                break;

            case 3: case 4: case 5:
                System.out.println("value is 3 or 4 or 5");
                break;

            default:
                System.out.println("value is out of range");

        }

        char chVal = 'F';

        switch(chVal) {
            case 'A':
                System.out.println("value is A");
                break;

                case 'B':
                    System.out.println("value is B");
                    break;

            case 'C':
                System.out.println("value is C");
                break;
                default:
                    System.out.println("none");

        }


    }
}
