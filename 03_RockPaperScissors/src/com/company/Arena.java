package com.company;

import java.util.HashMap;

public class Arena {

    private final String playerTwoName;
    private final String playerOneName;
    private HashMap<String, Integer> scoreBoard = new HashMap<>();

    public Arena(String playerOneName, String playerTwoName) {
        this.playerOneName = playerOneName;
        this.playerTwoName = playerTwoName;
    }

    public boolean play(int playerOne, int playerTwo) {
        // false -> playerOne wins, true -> playerTwo
        if (playerOne == 1 && playerTwo == 2) {
            int count = scoreBoard.getOrDefault(this.playerTwoName, 0);
            scoreBoard.put(this.playerTwoName, count + 1);
            return true;
        } else if (playerOne == 2 && playerTwo == 3) {
            int count = scoreBoard.getOrDefault(this.playerTwoName, 0);
            scoreBoard.put(this.playerTwoName, count + 1);
            return true;
        } else if (playerOne == 3 && playerTwo == 1) {
            int count = scoreBoard.getOrDefault(this.playerTwoName, 0);
            scoreBoard.put(this.playerTwoName, count + 1);
            return true;
        } else {
            int count = scoreBoard.getOrDefault(this.playerOneName, 0);
            scoreBoard.put(this.playerOneName, count + 1);
            return false;
        }
    }

    public void summary() {
        scoreBoard.forEach((key, value) -> System.out.println(key + " | " + value));
    }
}
