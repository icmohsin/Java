package com.monu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String numberAsString = "2018.125";
        System.out.println("number as string= " + numberAsString);

        double number = Double.parseDouble(numberAsString);

        System.out.println("intiger value is : "+ number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString : " + numberAsString);
        System.out.println("number : " + number);
    }
}
