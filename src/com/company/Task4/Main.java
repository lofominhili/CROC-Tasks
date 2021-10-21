package com.company.Task4;

public class Main {
    public static void main(String[] args) {
        Annotation input1 = new Annotation("Car", new Rectangle(new int[]{100, 100}, new int[]{150, 200}));
        Annotation input2 = new Annotation("Tree", new Circle(new int[]{100, 100}, 10));
        AnnotatedImage image = new AnnotatedImage("D:\\Names", input1, input2);
        System.out.println(input2.toString());
        System.out.println(input1.toString());
    }
}
