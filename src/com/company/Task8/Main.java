package com.company.Task8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Пустой ввод!!!");
            return;
        }
        try {
            File input = new File(args[0]);
            Scanner scanner = new Scanner(input);
            int cnt = 0;
            boolean checker = true;
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                if (str.isBlank()) break;
                str = str.trim() + '\n';
                for (int i = 0; i < str.length(); i++) {
                    if (!checker) {
                        if (str.charAt(i) == ' ') continue;
                        else checker = true;
                    }
                    if (str.charAt(i) == ' ') {
                        checker = false;
                        cnt++;
                    }
                    if (str.charAt(i) == '\n') cnt++;
                }
            }
            System.out.println(cnt);
        } catch (FileNotFoundException e) {
            System.out.println("Неправильный путь до файла!!!");
        }
    }
}
