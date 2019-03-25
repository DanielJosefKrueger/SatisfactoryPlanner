package de.DanielJosefKrueger.satisfactory.buildings;

import de.DanielJosefKrueger.satisfactory.Item;
import de.DanielJosefKrueger.satisfactory.ItemAmount;

public class CableProducer extends Building{

    private static final ItemAmount OUTGOING = new ItemAmount(Item.Cabel, 15);
    private static final ItemAmount INCOMING = new ItemAmount(Item.Wire, 30);

    public CableProducer() {
        super(OUTGOING, INCOMING);
    }


}
