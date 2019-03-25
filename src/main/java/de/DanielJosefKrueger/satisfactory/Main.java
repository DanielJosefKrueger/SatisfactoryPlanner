package de.DanielJosefKrueger.satisfactory;


public class Main {

    public static void main(String[] args) {
        Scenario scenario = new Scenario();
        scenario.addNeed(new ItemAmount(Item.Computer, 1.875));
        scenario.addNeed(new ItemAmount(Item.HeavyModularFrame, 2));

        scenario.printStatistics();


    }
}
