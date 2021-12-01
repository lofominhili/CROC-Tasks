package com.company.Task9;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    private static ArrayList<Log> makeLogs(String logPath) {
        BufferedReader br = null;
        ArrayList<Log> listOfLogs = null;
        try {
            br = new BufferedReader(new FileReader(logPath));
            listOfLogs = new ArrayList<Log>();
            String input = br.readLine();
            while (input != null) {
                listOfLogs.add(Log.parse(input));
                input = br.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return listOfLogs;
    }

    private static void sortedOutput(ArrayList<Log> listOfLogs) {
        listOfLogs.sort(new Comparator<Log>() {
            @Override
            public int compare(Log log1, Log log2) {
                return Long.compare(log1.getTime(), log2.getTime());
            }
        });
        for (Log log : listOfLogs) {
            System.out.println(log);
        }
    }

    private static void getFiles(String dirPath, ArrayList<Log> list) {
        File file = new File(dirPath);
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File cur = new File(String.format("%s%s%s", dir.getPath(), "/", name));
                if (cur.isDirectory()) return true;
                return cur.getName().endsWith(".log") || cur.getName().endsWith(".trace");
            }
        };
        for (File cur : file.listFiles(filter)) {
            if (cur.isFile()) {
                list.addAll(makeLogs(cur.getPath()));
            } else if (cur.isDirectory()) {
                getFiles(cur.getPath(), list);
            }
        }
    }

    public static void main(String[] args) {
        File dir = new File("E:\\Projects-java\\Task1\\src\\com\\company\\Task9\\logs");
        ArrayList<Log> listOfLogs = new ArrayList<>();
        getFiles(dir.getPath(), listOfLogs);
        System.out.println("Sorted Logs:");
        sortedOutput(listOfLogs);
    }
}




