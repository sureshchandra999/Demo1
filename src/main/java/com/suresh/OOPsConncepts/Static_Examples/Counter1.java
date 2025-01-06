package com.suresh.OOPsConncepts.Static_Examples;

public class Counter1 {
    static int count = 0;

    Counter1() {
        count++;

    }
    public void getCounter(){
        System.out.println("count value is:::"+ count);
    }
}
