package com.company.Task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input Bytes: ");
        long input = in.nextLong();
        Translator translator = new Translator(input);
        System.out.println(translator.getString());
    }
}
