package de.DanielJosefKrueger.satisfactory.buildings;

import de.DanielJosefKrueger.satisfactory.Item;
import de.DanielJosefKrueger.satisfactory.ItemAmount;

public class IronRodProducer extends Building{

    private static final ItemAmount OUTGOING = new ItemAmount(Item.IronRod, 15);
    private static final ItemAmount INCOMING = new ItemAmount(Item.IronIngot, 15);

    public IronRodProducer() {
        super(OUTGOING, INCOMING);
    }


}
