package de.DanielJosefKrueger.satisfactory.buildings;

import de.DanielJosefKrueger.satisfactory.Item;
import de.DanielJosefKrueger.satisfactory.ItemAmount;

public class CircuitBoardAssembly extends Building{

    private static final ItemAmount OUTGOING = new ItemAmount(Item.CircuitBoard, 5);
    private static final ItemAmount INCOMING = new ItemAmount(Item.Wire, 60);
    private static final ItemAmount INCOMING2 = new ItemAmount(Item.Plastic, 30);
    public CircuitBoardAssembly() {
        super(OUTGOING, INCOMING,INCOMING2);
    }


}
