package com.company;

public class Main {

    public static void main(String[] args) {
        final int numberOfRounds = 1000;
        final int numberOfRuns = 10;

        for (int x = 0; x < numberOfRuns; x++) {
            AdvancedGamer PlayerOne = new AdvancedGamer("Player Ome", false);
            AdvancedGamer PlayerTwo = new AdvancedGamer("Player Two", true);
            Arena arena = new Arena(PlayerOne.name(), PlayerTwo.name());

            for (int i = 0; i < numberOfRounds; i++) {
                int fakeOne = PlayerOne.fake();
                int fakeTwo = PlayerTwo.fake();

                int moveOne = PlayerOne.play(fakeOne);
                int moveTwo = PlayerTwo.play(fakeTwo);

                boolean matchResult = arena.play(moveOne, moveTwo);

                PlayerOne.result(matchResult, moveTwo);
                PlayerTwo.result(matchResult, moveOne);
            }

            arena.summary();
        }
    }
}
