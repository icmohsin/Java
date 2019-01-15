package com.monu;

public class Main {

    public static void main(String[] args) {
	// write your code here

        public static void printMegaBytesAndKiloBytes (int kiloBytes) {
            int Calc;
            if (kiloBytes <0 ) {
                System.out.println("Invalid Value");
            }else{
                Calc = kiloBytes%1024;
                System.out.println("value is " + Calc);
            }
        }
        }
    }

