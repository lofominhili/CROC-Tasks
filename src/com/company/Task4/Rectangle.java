package com.company.Task4;

public class Rectangle extends Figure {
    public Rectangle(int[] firstCoordinate, int[] secondCoordinate) {
        this.firstCoordinate = firstCoordinate;
        this.secondCoordinate = secondCoordinate;
    }

    @Override
    public String toString() {
        return "R (" + firstCoordinate[0] + ", " + firstCoordinate[1] + "), " + "(" + secondCoordinate[0] + ", " + secondCoordinate[1] + "): ";
    }
}
