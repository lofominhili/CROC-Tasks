package com.company.Task5;

public class Circle extends  Figure {
    public Circle(int[] coordinate, int radius) {
        firstCoordinate = coordinate;
        this.radius = radius;
    }

    private int[] getVector(int x, int y) {
        int[] vector = new int[2];
        vector[0] = x - firstCoordinate[0];
        vector[1] = y - firstCoordinate[1];
        return vector;
    }

    private double getLength(int[] vector) {
        return Math.sqrt(Math.pow(vector[0], 2) + Math.pow(vector[1], 2));
    }

    public boolean doesPointContain(int x, int y) {
        return getLength(getVector(x, y)) <= radius;
    }

    public void move(int dx, int dy) {
        firstCoordinate[0] += dx;
        firstCoordinate[1] += dy;
    }

    @Override
    public String toString() {
        return "C (" + firstCoordinate[0] + ", " + firstCoordinate[1] + "), " + radius + ": ";
    }

}
