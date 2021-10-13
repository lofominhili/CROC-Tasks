package com.company.Task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Point a = new Point();
        Point b = new Point();
        Point c = new Point();
        Point square = new Point();
        Scanner in = new Scanner(System.in);

        System.out.println("Input values of the first side(order(x,y)): ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        a.setX(x);
        a.setY(y);
        System.out.println("Input values of the  second side(order(x,y)): ");
        x = in.nextDouble();
        y = in.nextDouble();
        b.setX(x);
        b.setY(y);
        System.out.println("Input values of the third side(order(x,y)): ");
        x = in.nextDouble();
        y = in.nextDouble();
        c.setX(x);
        c.setY(y);
        System.out.println("Your square =  " + String.format("%.1f", square.getSquare(a, b, c)));
    }
}
