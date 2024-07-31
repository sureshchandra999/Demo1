package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.Creational_Design_Patterns.AbstractFactoryPattern1;

public class ModernFurnitureFactory implements FurnitureFactory{
    /**
     * @return
     */
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    /**
     * @return
     */
    @Override
    public Table createTable() {
        return new ModernTable();
    }

    /**
     * @return
     */
    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
