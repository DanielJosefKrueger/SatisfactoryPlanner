package de.DanielJosefKrueger.satisfactory.buildings;

import de.DanielJosefKrueger.satisfactory.Item;
import de.DanielJosefKrueger.satisfactory.ItemAmount;
import de.DanielJosefKrueger.satisfactory.buildings.Building;

public class PlasticProducer extends Building {

    private static final ItemAmount OUTGOING = new ItemAmount(Item.Plastic, 22.5);
    private static final ItemAmount INCOMING = new ItemAmount(Item.CrudeOil, 30);

    public PlasticProducer() {
        super(OUTGOING, INCOMING);
    }


}
