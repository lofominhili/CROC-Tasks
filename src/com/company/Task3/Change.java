package com.company.Task3;

import java.util.Scanner;

public class Change {
    private int[] arr;
    ;

    public Change(int length) {
        arr = new int[length];
        initArr();
    }

    public int[] getArr() {
        changeValues();
        return arr;
    }

    private void initArr() {
        Scanner in = new Scanner(System.in);
        int value;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input a[" + i + "]: ");
            value = in.nextInt();
            arr[i] = value;
        }
    }

    private void changeValues() {
        int max = arr[0];
        int min = arr[0];
        int addressMax = 0;
        int addressMin = 0;
        int tmp;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                addressMax = i;
            }
            if (min > arr[i]) {
                min = arr[i];
                addressMin = i;
            }
        }
        tmp = arr[addressMin];
        arr[addressMin] = arr[0];
        arr[0] = min;
        tmp = arr[addressMax];
        arr[addressMax] = arr[arr.length - 1];
        arr[arr.length - 1] = max;
    }
}
