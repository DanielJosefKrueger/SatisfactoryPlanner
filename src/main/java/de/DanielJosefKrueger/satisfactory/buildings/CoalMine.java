package de.DanielJosefKrueger.satisfactory.buildings;

import de.DanielJosefKrueger.satisfactory.Item;
import de.DanielJosefKrueger.satisfactory.ItemAmount;

public class CoalMine extends Building{

    private static final ItemAmount OUTGOING = new ItemAmount(Item.Coal, 120);

    public CoalMine() {
        super(OUTGOING);
    }


}
