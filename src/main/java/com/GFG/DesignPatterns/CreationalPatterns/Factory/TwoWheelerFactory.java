package com.GFG.DesignPatterns.CreationalPatterns.Factory;

public class TwoWheelerFactory implements VechileFactory{
    /**
     * @return
     */
    @Override
    public Vechile createVechile() {
        return new TwoWheeler();
    }
}
