package com.company.Task15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public interface BlackListFilter<T> {

    default Collection<T> filterComments(Iterable<T> comments, Predicate<T> predicate) {
        List<T> filteredComments = new ArrayList<>();
        for (T comment : comments) {
            if (predicate.test(comment))
                filteredComments.add(comment);
        }
        return filteredComments;
    }
}
