package com.company.Task9;

public class Log {
    private final long time;
    private final String message;

    public Log(long time, String message) {
        this.time = time;
        this.message = message;
    }

    public long getTime() {
        return time;
    }

    public static Log parse(String input) {
        String[] arr = input.split(" ");
        long time = Long.parseLong(arr[0]);
        String message = arr[1];
        return new Log(time, message);
    }

    @Override
    public String toString() {
        return  time + " " + message;
    }
}
