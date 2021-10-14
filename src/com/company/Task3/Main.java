package com.company.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input size of array: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        Change change = new Change(size);
        int[] arr = change.getArr();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("current a[" + i + "]= " + arr[i]);
        }
    }
}
