package com.company.Task4;

public class Circle extends Figure {

    public Circle(int[] coordinate, int radius) {
        firstCoordinate = coordinate;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "C (" + firstCoordinate[0] + ", " + firstCoordinate[1] + "), " + radius + ": ";
    }

}
