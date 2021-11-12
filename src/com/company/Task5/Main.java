package com.company.Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Annotation input1 = new Annotation("Car", new Rectangle(new int[]{100, 100}, new int[]{150, 200}));
        Annotation input2 = new Annotation("Tree", new Circle(new int[]{100, 100}, 10));
        AnnotatedImage image = new AnnotatedImage("D:\\Names", input1, input2);
        System.out.println(input2.toString());
        System.out.println(input1.toString());
        int[] point = new int[2];
        System.out.println("\nEnter the point(x,y) to find:");
        point[0] = scanner.nextInt();
        point[1] = scanner.nextInt();
        System.out.println("Annotation which contains a figure with this point:\n" + image.findByPoint(point[0], point[1]));
        String label;
        System.out.println("\nEnter a label to find:");
        label = scanner.next();
        System.out.println("Annotation which contains this label:\n" + image.findByLabel(label));
        int[] point2 = new int[2];
        System.out.println("Enter a point(x,y) to move a figure");
        point[0] = scanner.nextInt();
        point[1] = scanner.nextInt();
        input1.getFigure().move(point[0], point[1]);
        System.out.println("An annotation after moving a figure:\n" + input1);
    }
}
