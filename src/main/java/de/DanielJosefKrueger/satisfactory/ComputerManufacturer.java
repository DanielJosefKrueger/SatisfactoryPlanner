package de.DanielJosefKrueger.satisfactory;

public class ComputerManufacturer extends Building{

    private static final ItemAmount OUTGOING = new ItemAmount(Item.HeavyModularFrame, 2);
    private static final ItemAmount INCOMING = new ItemAmount(Item.CircuitBoard, 9.375);
    private static final ItemAmount INCOMING2 = new ItemAmount(Item.Cabel, 22.5);
    private static final ItemAmount INCOMING3 = new ItemAmount(Item.Plastic, 33.75);
    private static final ItemAmount INCOMING4 = new ItemAmount(Item.Screws, 112.5);
    protected ComputerManufacturer() {
        super(OUTGOING, INCOMING,INCOMING2);
    }


}
