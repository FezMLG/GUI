package com.company;

public class Arena {

    public boolean play(int playerMove, int randomMove) {
        // false -> enemy wins, true -> player wins
        if (playerMove == 1 && randomMove == 2) {
            return false;
        } else if (playerMove == 2 && randomMove == 3) {
            return false;
        } else if (playerMove == 3 && randomMove == 1) {
            return false;
        } else {
            return true;
        }
    }
}
