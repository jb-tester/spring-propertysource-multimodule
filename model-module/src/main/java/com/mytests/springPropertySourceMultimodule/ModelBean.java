package com.mytests.springPropertySourceMultimodule;

public class ModelBean {
    private final String str;

    public ModelBean(String s) {
        this.str = s;
    }

    @Override
    public String toString() {
        return "Properties in @Value: {" +
                str +
                '}';
    }
}
