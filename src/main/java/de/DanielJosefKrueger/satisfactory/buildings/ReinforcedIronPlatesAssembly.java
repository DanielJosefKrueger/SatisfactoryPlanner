package de.DanielJosefKrueger.satisfactory.buildings;

import de.DanielJosefKrueger.satisfactory.Item;
import de.DanielJosefKrueger.satisfactory.ItemAmount;
import de.DanielJosefKrueger.satisfactory.buildings.Building;

public class ReinforcedIronPlatesAssembly extends Building {

    private static final ItemAmount OUTGOING = new ItemAmount(Item.ReinforcedIronPlate, 5);
    private static final ItemAmount INCOMING = new ItemAmount(Item.IronPlate, 20);
    private static final ItemAmount INCOMING2 = new ItemAmount(Item.Screws, 120);
    public ReinforcedIronPlatesAssembly() {
        super(OUTGOING, INCOMING,INCOMING2);
    }


}
