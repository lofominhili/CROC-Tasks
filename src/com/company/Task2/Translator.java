package com.company.Task2;

public class Translator {
    private double cntBytes;
    private String type;
    private double result;

    public Translator(long input) {
        cntBytes = input;
    }

    private void getType() {
        double kilobyte = 1024;
        double megabyte = 1048576;
        double gigabyte = 1073741824;
        double terabyte = 1099511627776D;

        if (cntBytes >= kilobyte && cntBytes < megabyte) {
            type = "KB";
            result = cntBytes / 1024;
        } else if (cntBytes >= megabyte && cntBytes < gigabyte) {
            type = "MB";
            result = cntBytes / 1048576;
        } else if (cntBytes >= gigabyte && cntBytes < terabyte) {
            type = "GB";
            result = cntBytes / 1073741824;
        } else if (cntBytes >= terabyte) {
            type = "TB";
            result = cntBytes / 1099511627776L;
        } else {
            type = "B";
            result = cntBytes;
        }
    }

    public String getString() {
        getType();
        return String.format("%.1f",result) + type;
    }
}

