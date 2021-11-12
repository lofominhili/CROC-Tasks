package com.company.Task5;

public abstract class Figure implements Movable {
    protected int[] firstCoordinate;
    protected int[] secondCoordinate;
    protected int radius;
    public abstract boolean doesPointContain(int x, int y);
}
