package com.company.Task15;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> comments = new ArrayList<>();
        BlackListFilter<String> list = new BlackListFilter<>() {};
        comments.add("Баштыркин сегодня провел хороший стрим!");
        comments.add("onexbet лучшие выигрыши только у нас!");
        comments.add("Купи мою тренерскую программу Воин Спарты, стань как Игорь Войтенко");
        comments.add("Стример лох" + "\n" + "Оффай с позором!");
        comments.add("Прекрасное выступление Маэстро!");
        comments.add("Если хотите разбогатеть, вы знаете что делать, ссылка в описании");

        System.out.println(list.filterComments(comments, comment -> !comment.contains("onexbet") && !comment.contains("лох") && !comment.contains("Купи") && !comment.contains("ссылка")));
    }
}
