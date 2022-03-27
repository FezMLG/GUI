package com.company;

public interface IAdvancedGamer {
    public abstract String name();

    public abstract int fake();

    public abstract int play(int fake);

    public abstract void result(boolean score, int enemyMove);
}