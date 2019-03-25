package de.DanielJosefKrueger.satisfactory.buildings;

import de.DanielJosefKrueger.satisfactory.Item;
import de.DanielJosefKrueger.satisfactory.ItemAmount;
import de.DanielJosefKrueger.satisfactory.buildings.Building;

public class ScrewProducer extends Building {

    private static final ItemAmount OUTGOING = new ItemAmount(Item.Screws, 90);
    private static final ItemAmount INCOMING = new ItemAmount(Item.IronRod, 15);

    public ScrewProducer() {
        super(OUTGOING, INCOMING);
    }


}
