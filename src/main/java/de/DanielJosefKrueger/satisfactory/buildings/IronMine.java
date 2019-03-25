package de.DanielJosefKrueger.satisfactory.buildings;

import de.DanielJosefKrueger.satisfactory.Item;
import de.DanielJosefKrueger.satisfactory.ItemAmount;

public class IronMine extends Building{

    private static final ItemAmount OUTGOING = new ItemAmount(Item.IronOre, 120);

    public IronMine() {
        super(OUTGOING);
    }


}
