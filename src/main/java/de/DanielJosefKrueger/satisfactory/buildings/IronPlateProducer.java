package de.DanielJosefKrueger.satisfactory.buildings;

import de.DanielJosefKrueger.satisfactory.Item;
import de.DanielJosefKrueger.satisfactory.ItemAmount;

public class IronPlateProducer extends Building{

    private static final ItemAmount OUTGOING = new ItemAmount(Item.IronPlate, 15);
    private static final ItemAmount INCOMING = new ItemAmount(Item.IronIngot, 30);

    public IronPlateProducer() {
        super(OUTGOING, INCOMING);
    }


}
