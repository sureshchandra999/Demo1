package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.Creational_Design_Patterns.AbstractFactoryPattern1;

public class VictorianFurnitureFactory implements FurnitureFactory{
    /**
     * @return
     */
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    /**
     * @return
     */
    @Override
    public Table createTable() {
        return new VictorianTable();
    }

    /**
     * @return
     */
    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
