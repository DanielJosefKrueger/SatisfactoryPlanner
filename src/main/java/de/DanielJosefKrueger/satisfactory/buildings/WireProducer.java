package de.DanielJosefKrueger.satisfactory.buildings;

import de.DanielJosefKrueger.satisfactory.Item;
import de.DanielJosefKrueger.satisfactory.ItemAmount;
import de.DanielJosefKrueger.satisfactory.buildings.Building;

public class WireProducer extends Building {

    private static final ItemAmount OUTGOING = new ItemAmount(Item.Wire, 45);
    private static final ItemAmount INCOMING = new ItemAmount(Item.CopperOre, 15);

    public WireProducer() {
        super(OUTGOING, INCOMING);
    }


}
