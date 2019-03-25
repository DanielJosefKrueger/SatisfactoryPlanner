package de.DanielJosefKrueger.satisfactory.buildings;

import de.DanielJosefKrueger.satisfactory.Item;
import de.DanielJosefKrueger.satisfactory.ItemAmount;

public class ConcreteProducer extends Building{

    private static final ItemAmount OUTGOING = new ItemAmount(Item.Concrete, 15);
    private static final ItemAmount INCOMING = new ItemAmount(Item.Wire, 30);

    public ConcreteProducer() {
        super(OUTGOING, INCOMING);
    }


}
