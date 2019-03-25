package de.DanielJosefKrueger.satisfactory.buildings;

import de.DanielJosefKrueger.satisfactory.Item;
import de.DanielJosefKrueger.satisfactory.ItemAmount;

public class HeavyModularFrameManufacturer extends Building{

    private static final ItemAmount OUTGOING = new ItemAmount(Item.HeavyModularFrame, 2);
    private static final ItemAmount INCOMING = new ItemAmount(Item.ModularFrame, 10);
    private static final ItemAmount INCOMING2 = new ItemAmount(Item.SteelPipe, 30);
    private static final ItemAmount INCOMING3 = new ItemAmount(Item.EnceasedSteelBeam, 10);
    private static final ItemAmount INCOMING4 = new ItemAmount(Item.Screws, 180);
    public HeavyModularFrameManufacturer() {
        super(OUTGOING, INCOMING,INCOMING2,INCOMING3,INCOMING4);
    }


}
