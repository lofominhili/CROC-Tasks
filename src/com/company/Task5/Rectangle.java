package com.company.Task5;

public class Rectangle extends Figure {
    public Rectangle(int[] firstCoordinate, int[] secondCoordinate) {
        this.firstCoordinate = firstCoordinate;
        this.secondCoordinate = secondCoordinate;
    }

    public boolean doesPointContain(int x, int y) {
        return (x >= firstCoordinate[0] && x <= secondCoordinate[0] && y >= firstCoordinate[1] && y <= secondCoordinate[1])
                || (x <= firstCoordinate[0] && x >= secondCoordinate[0] && y <= firstCoordinate[1] && y >= secondCoordinate[1]);
    }

    public void move(int dx, int dy) {
        firstCoordinate[0] += dx;
        secondCoordinate[0] += dx;
        firstCoordinate[1] += dy;
        secondCoordinate[1] += dy;
    }

        @Override
    public String toString() {
        return "R (" + firstCoordinate[0] + ", " + firstCoordinate[1] + "), " + "(" + secondCoordinate[0] + ", " + secondCoordinate[1] + "): ";
    }
}
