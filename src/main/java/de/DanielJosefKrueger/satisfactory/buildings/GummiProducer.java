package de.DanielJosefKrueger.satisfactory.buildings;

import de.DanielJosefKrueger.satisfactory.Item;
import de.DanielJosefKrueger.satisfactory.ItemAmount;

public class GummiProducer extends Building{

    private static final ItemAmount OUTGOING = new ItemAmount(Item.Rubber, 30);
    private static final ItemAmount INCOMING = new ItemAmount(Item.CrudeOil, 30);

    public GummiProducer() {
        super(OUTGOING, INCOMING);
    }


}
