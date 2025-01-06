package com.suresh.OOPsConncepts.Composition_Aggregation.Composition;

public class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void start() {
        System.out.println("Engine starts......");
    }
}
