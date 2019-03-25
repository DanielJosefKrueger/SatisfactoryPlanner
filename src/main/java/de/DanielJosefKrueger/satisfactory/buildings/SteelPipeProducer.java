package de.DanielJosefKrueger.satisfactory.buildings;

import de.DanielJosefKrueger.satisfactory.Item;
import de.DanielJosefKrueger.satisfactory.ItemAmount;
import de.DanielJosefKrueger.satisfactory.buildings.Building;

public class SteelPipeProducer extends Building {

    private static final ItemAmount OUTGOING = new ItemAmount(Item.SteelPipe, 15);
    private static final ItemAmount INCOMING = new ItemAmount(Item.SteelIngot, 15);

    public SteelPipeProducer() {
        super(OUTGOING, INCOMING);
    }


}
