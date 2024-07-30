package com.suresh.DeepCopy_ShallowCopy;

public class Address implements Cloneable{

    String city;
    String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
