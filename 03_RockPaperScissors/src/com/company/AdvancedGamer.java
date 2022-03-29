package com.company;

import java.util.ArrayList;

public class AdvancedGamer implements IAdvancedGamer {

    private final String name;
    private final boolean player;
    private int myMove;
    private final int max = 3;
    private final int min = 1;
    private ArrayList<Integer> enemyMoves = new ArrayList<Integer>();
    private ArrayList<Integer> winingMoves = new ArrayList<Integer>();

    public AdvancedGamer(String name, boolean player) {
        this.name = name;
        this.player = player;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public int fake() {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

    @Override
    public int play(int fake) {
        enemyMoves.add(fake);
        int sumOfMoves = 0;
        for (int i : enemyMoves) {
            sumOfMoves += i;
        }
        int move = Math.round((sumOfMoves / enemyMoves.size()));
        if (winingMoves.size() != 0) {
            move = Math.round((sumOfMoves / enemyMoves.size()) + (sumOfMoves / winingMoves.size()));
        }
//        int move = (int) Math.floor(Math.random() * (max - min + 1) + min);
        this.myMove = move;
        return move;
    }

    @Override
    public void result(boolean score, int enemyMove) {
        enemyMoves.remove(enemyMoves.size() - 1);
        enemyMoves.add(enemyMove);
        if (score == player) {
            winingMoves.add(myMove);
        } else {
            winingMoves.add(enemyMove);
        }
//        if (score) {
//            System.out.println("Player 2 wins " + enemyMove);
//        } else {
//            System.out.println("Player 1 wins " + enemyMove);
//        }
    }
}
