package com.monu;



import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Collections.reverseOrder;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        int[] myEntery = getIntegers(5);
      //  printArray(myEntery);
        sortIntegers(myEntery);
    }

    public static int[] getIntegers(int number) {
        int[] myArray = new int[number];
        System.out.println("Please enter " + number + " values\r");
        for (int i=0;i<myArray.length;i++){
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    public static void printArray (int[] myArray1){
        for (int i=0;i<myArray1.length;i++){
            System.out.println("you entered "+myArray1[i]);
        }
    }

    public static void sortIntegers (int[] myArray2) {
/*        int[] newArray = new int[myArray2.length] ;
        for (int i=0;i<newArray.length;i++){
            newArray[i] = myArray2[i];
        }*/
        int [] newArray = Arrays.copyOf(myArray2,myArray2.length); // copy array to another array

        boolean flag = true;
        int temp;
        Arrays.sort(newArray);
        for (int i = newArray.length-1;i>=0;i--){
            System.out.println("reverse is " + newArray[i]);
        }
      //  Arrays.sort( myArray2, Collections.reverseOrder());
   //     printArray(myArray2);
    }
}
