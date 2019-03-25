package de.DanielJosefKrueger.satisfactory.buildings;

import de.DanielJosefKrueger.satisfactory.Item;
import de.DanielJosefKrueger.satisfactory.ItemAmount;
import de.DanielJosefKrueger.satisfactory.buildings.Building;

public class StratorAssembly extends Building {

    private static final ItemAmount OUTGOING = new ItemAmount(Item.Stator, 6);
    private static final ItemAmount INCOMING = new ItemAmount(Item.SteelPipe, 18);
    private static final ItemAmount INCOMING2 = new ItemAmount(Item.Wire, 60);
    public StratorAssembly() {
        super(OUTGOING, INCOMING,INCOMING2);
    }


}
