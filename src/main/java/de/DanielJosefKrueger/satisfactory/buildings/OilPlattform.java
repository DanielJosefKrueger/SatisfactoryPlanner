package de.DanielJosefKrueger.satisfactory.buildings;

import de.DanielJosefKrueger.satisfactory.Item;
import de.DanielJosefKrueger.satisfactory.ItemAmount;

public class OilPlattform extends Building{

    private static final ItemAmount OUTGOING = new ItemAmount(Item.CrudeOil, 240);

    public OilPlattform() {
        super(OUTGOING);
    }


}
