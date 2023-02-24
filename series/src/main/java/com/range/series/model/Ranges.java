package com.range.series.model;

public class Ranges {

    public String label;
    public int inf, sup;

    public Ranges(String label, int inf, int sup) {
        this.label = label;
        this.inf = inf;
        this.sup = sup;
    }

    public Ranges() {

    }

    public String getLabel() {
        return label;
    }

    public int getInf() {
        return inf;
    }

    public int getSup() {
        return sup;
    }
}


