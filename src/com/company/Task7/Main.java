package com.company.Task7;

public class Main {
    public static void main(String[] args) {
        String input = "g8,e7,e6";
        checkMove(input);
        input = "g8,e7,c8";
        checkMove(input);
    }

    private static void checkMove(String input) {
        String[] Arr = input.split(",");
        for (int i = 0; i < Arr.length - 1; i++) {
            try {
                checkHorseStep(ChessPosition.parse(Arr[i]), ChessPosition.parse(Arr[i + 1]));
            } catch (IllegalMoveException e) {
                System.out.println(e.getMessage());
                return;
            }
        }
        System.out.println("OK");
    }

    private static void checkHorseStep(ChessPosition start, ChessPosition end) throws IllegalMoveException {
        if (Math.abs(start.getY() - end.getY()) + Math.abs(start.getX() - end.getX()) != 3) {
            throw new IllegalMoveException(start, end);
        }
    }
}
