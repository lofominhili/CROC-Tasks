package com.company.Task13;

import java.util.List;
import java.util.Set;

public class BlackList implements  BlackListFilter {

    @Override
    public void filterComments(List<String> comments, Set<String> blackList) {
        boolean checker = false;
        String[] verifiableWords;
        String comment ="";
        for (int counter = 0; counter < comments.size(); counter++){
            comment = comments.get(counter);
            verifiableWords = comment.split("[ ,!?:;.\n]");
            for (String word : verifiableWords) {
                if (checker) {
                    comments.remove(comment);
                    counter--;
                    checker = false;
                    break;
                }
                for (String forbidden : blackList) {
                    if (word.equals(forbidden)) {
                        checker = true;
                        break;
                    }
                }
            }
        }
    }
}
