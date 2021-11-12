package com.company.Task5;

import com.company.Task5.Figure;

public class Annotation {
    private String sign;
    private Figure figure;

    public Annotation(String sign, Figure figure) {
        this.sign = sign;
        this.figure = figure;
    }


    public void setSign(String sign) {
        this.sign = sign;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public String getSign() {
        return sign;
    }

    public Figure getFigure() {
        return figure;
    }


    public String toString() {
        return figure.toString() + sign;
    }
}
