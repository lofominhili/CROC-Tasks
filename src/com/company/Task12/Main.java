package com.company.Task12;

public class Main {
    public static void main(String[] args) {
        int cntThread = Integer.parseInt(args[0]);
        String hashStr = args[1];
        int difference = 26 / cntThread;
        char[] symbol = new char[cntThread + 1];
        int cnt = 0;
        for (char i = 'a'; i <= 'z'; i += difference) {
            symbol[cnt] = i;
            cnt++;
        }
        for (int i = 0; i < cntThread; i++) {
            new Hash(hashStr, symbol[i]).start();
        }
        int i = 1;
        while (true) {
            if (Thread.currentThread().isInterrupted()) break;
            System.out.println("Time: " + i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

