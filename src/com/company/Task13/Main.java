package com.company.Task13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        List <String> comments = new ArrayList<>();
        Set<String> blackList = new HashSet<>();
        BlackList list  = new BlackList();
        comments.add("Баштыркин сегодня провел хороший стрим!");
        comments.add("onexbet лучшие выигрыши только у нас!");
        comments.add("Купи мою тренерскую программу Воин Спарты, стань как Игорь Войтенко");
        comments.add("Стример лох" + "\n" + "Оффай с позором!");
        comments.add("Прекрасное выступление Маэстро!");
        comments.add("Если хотите разбогатеть, вы знаете что делать, ссылка в описании");
        blackList.add("onexbet");
        blackList.add("Купи");
        blackList.add("ссылка");
        blackList.add("лох");
        list.filterComments(comments, blackList);
        System.out.println(comments);
    }
}
