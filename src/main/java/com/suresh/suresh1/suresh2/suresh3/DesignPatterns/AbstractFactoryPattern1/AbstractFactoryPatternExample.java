package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.AbstractFactoryPattern1;

public class AbstractFactoryPatternExample {

    public static void main(String[] args) {
        // Create Victorian furniture
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Table victorianTable = victorianFactory.createTable();
        Sofa victorianSofa = victorianFactory.createSofa();

        victorianChair.sitOn(); // Output: Sitting on a Victorian chair.
        victorianTable.use();   // Output: Using a Victorian table.
        victorianSofa.lieOn();  // Output: Lying on a Victorian sofa.

        // Create Modern furniture
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Table modernTable = modernFactory.createTable();
        Sofa modernSofa = modernFactory.createSofa();

        modernChair.sitOn(); // Output: Sitting on a Modern chair.
        modernTable.use();   // Output: Using a Modern table.
        modernSofa.lieOn();  // Output: Lying on a Modern sofa.
    }
}
