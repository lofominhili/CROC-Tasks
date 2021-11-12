package com.company.Task5;

import com.company.Task5.Annotation;

public class AnnotatedImage {
    private final String imagePath;

    private final Annotation[] annotations;

    public AnnotatedImage(String imagePath, Annotation... annotations) {
        this.imagePath = imagePath;
        this.annotations = annotations;
    }

    public Annotation findByPoint(int x, int y){
        for (Annotation i : annotations)
            if (i.getFigure().doesPointContain(x, y))
                return i;

        return null;
    }

    public Annotation findByLabel(String label) {
        for (Annotation i : annotations)
            if (i.getSign().contains(label))
                return i;

        return null;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    public Annotation[] getAnnotations() {
        return this.annotations;
    }
}
