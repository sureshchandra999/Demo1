package com.GFG.DesignPatterns.CreationalPatterns.Factory;

public class ThreeWheelerFactory implements VechileFactory{
    /**
     * @return
     */
    @Override
    public Vechile createVechile() {
        return new ThreeWheeler();
    }
}
