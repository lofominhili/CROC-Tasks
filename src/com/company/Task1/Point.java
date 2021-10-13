package com.company.Task1;

public class Point {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getSquare(Point a, Point b, Point c) {
        double t = Math.pow((c.x - b.x), 2);
        double e = Math.pow((c.y - b.y), 2);
        double g = Math.sqrt(t + e);
        double length_A = Math.sqrt(Math.pow((b.x - a.x), 2) + Math.pow((b.y - a.y), 2));
        double length_B = Math.sqrt(Math.pow((c.x - b.x), 2) + Math.pow((c.y - b.y), 2));
        double length_C = Math.sqrt(Math.pow((c.x - a.x), 2) + Math.pow((c.y - a.y), 2));
        double p = (length_A + length_B + length_C) / 2;
        return Math.sqrt(p * (p - length_A) * (p - length_B) * (p - length_C));
    }
}