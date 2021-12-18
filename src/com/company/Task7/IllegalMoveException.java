package com.company.Task7;

public class IllegalMoveException extends Exception {
    public IllegalMoveException(ChessPosition start, ChessPosition end) {
        super(String.format("неправильный ход: %s -> %s", start, end));
    }
}
