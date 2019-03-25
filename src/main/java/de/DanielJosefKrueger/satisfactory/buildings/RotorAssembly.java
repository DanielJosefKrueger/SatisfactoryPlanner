package de.DanielJosefKrueger.satisfactory.buildings;

import de.DanielJosefKrueger.satisfactory.Item;
import de.DanielJosefKrueger.satisfactory.ItemAmount;
import de.DanielJosefKrueger.satisfactory.buildings.Building;

public class RotorAssembly extends Building {

    private static final ItemAmount OUTGOING = new ItemAmount(Item.Rotor, 6);
    private static final ItemAmount INCOMING = new ItemAmount(Item.IronRod, 18);
    private static final ItemAmount INCOMING2 = new ItemAmount(Item.Screws, 132);
    public RotorAssembly() {
        super(OUTGOING, INCOMING,INCOMING2);
    }


}
