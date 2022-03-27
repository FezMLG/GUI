package com.company;

public class AdvancedGamer implements IAdvancedGamer {

    private final String name;
    private final int max = 3;
    private final int min = 1;

    public AdvancedGamer(String name) {
        this.name = name;
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
        int randomMove = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return randomMove;
    }

    @Override
    public void result(boolean score, int enemyMove) {
        if (score) {
            System.out.println("Player 2 wins" + enemyMove);
        } else {
            System.out.println("Player 1 wins" + enemyMove);
        }
    }
}
