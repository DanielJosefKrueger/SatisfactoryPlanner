package de.DanielJosefKrueger.satisfactory.buildings;

import de.DanielJosefKrueger.satisfactory.Item;
import de.DanielJosefKrueger.satisfactory.ItemAmount;
import de.DanielJosefKrueger.satisfactory.buildings.Building;

public class SteelBeamProducer extends Building {

    private static final ItemAmount OUTGOING = new ItemAmount(Item.SteelBeam, 10);
    private static final ItemAmount INCOMING = new ItemAmount(Item.SteelIngot, 30);

    public SteelBeamProducer() {
        super(OUTGOING, INCOMING);
    }


}
