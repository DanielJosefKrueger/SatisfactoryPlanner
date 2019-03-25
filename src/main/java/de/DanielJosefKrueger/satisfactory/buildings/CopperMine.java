package de.DanielJosefKrueger.satisfactory.buildings;

import de.DanielJosefKrueger.satisfactory.Item;
import de.DanielJosefKrueger.satisfactory.ItemAmount;

public class CopperMine extends Building{

    private static final ItemAmount OUTGOING = new ItemAmount(Item.CopperOre, 120);

    public CopperMine() {
        super(OUTGOING);
    }


}
