package com.GFG.DesignPatterns.CreationalPatterns.Factory;

public class FourWheelerFactory implements VechileFactory {
    /**
     * @return
     */
    @Override
    public Vechile createVechile() {
        return new FourWheeler();
    }
}
