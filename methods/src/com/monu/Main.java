package com.monu;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim",highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob",highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy",highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert",highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Test",highScorePosition);
    }

    public static void displayHighScorePosition (String playerName,int highSocrePosition) {
        System.out.println(playerName + " Managed to get into position " + highSocrePosition
                + " on the high score table");
    }

    public static  int calculateHighScorePosition (int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 ) {
            return 2;
        } else if (playerScore >= 100 ) {
            return 3;
        }else {
            return 4;
        }
    }
}

