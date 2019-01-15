package com.monu;

public class Main {

    public static void main(String[] args) {
/*
//        //  ***operators
//        int result = 1 + 2;
//      //  System.out.println(" result :" + result);
//
//        int prevresult = result;
//        result = result +2;
//
//      //  System.out.println("new result : " + result);
//
//        //reminder operator
//        result = result % 3;
//        System.out.println("reminder : " + result);
//
//        int varlp = 2;
//        if (varlp > 1 )
//            System.out.println("result matches");
//
//       // System.out.println("variable value is : " + varlp);
//
//         ///chalange
//
//        double mydou1 = 20;
//        double mydou2 = 80;
//        double outdouble = (mydou1 + mydou2) ;
//
//        outdouble = (outdouble * 25) % 40;
//
//       // if (outdouble <=20)
//       //  System.out.println("double calc : " + outdouble);
*/
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        if (score == 10000) {
            System.out.println("the score is : " + score);
        } else if (score > 10000) {
            System.out.println(" your score exceed");
        } else {
            System.out.println("nothing to say");
        }

    calculateScore(gameOver,score,levelCompleted,bonus);
        calculateScore(true,800,5,25);
      int highscore=  newmethod(false,800,5,25);
        System.out.println(highscore);
    }

//creating  a method
   //no return value
    public static void calculateScore(boolean gameOver,int score,int levelCompleted,int bonus) {
        if (gameOver) {
            int finalScore = score+(levelCompleted*bonus);
            System.out.println( "Final score is : " + finalScore);
        }
    }
 // if you want to return something
    public static int newmethod(boolean gameOver,int score,int levelCompleted,int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Final score is : " + finalScore);
            return finalScore;
        } else {
            return -1;
        }
    }
}
