package com.company.Task10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Call> calls = new ArrayList<Call>();
        calls.add(new Call(1, 12));
        calls.add(new Call(4, 6));
        calls.add(new Call(7, 12));
        calls.add(new Call(10, 32));
        calls.add(new Call(15, 30));
        long[] start = new long[calls.size()];
        long[] end = new long[calls.size()];
        int i = 0;
        for (Call call : calls) {
            start[i] = call.getStartTime();
            end[i] = call.getEndTime();
            i++;
        }
        Arrays.sort(end);
        int max = 0, cnt = 0, j = 0;
        for (i = 0; i < start.length; ) {
            if (start[i] < end[j]) {
                cnt++;
                i++;
            } else {
                if (cnt > max) {
                    max = cnt;
                }
                cnt--;
                j++;
            }
        }
        System.out.println(max);
    }
}
