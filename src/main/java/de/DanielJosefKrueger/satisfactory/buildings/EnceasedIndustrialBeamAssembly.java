package de.DanielJosefKrueger.satisfactory.buildings;

import de.DanielJosefKrueger.satisfactory.Item;
import de.DanielJosefKrueger.satisfactory.ItemAmount;

public class EnceasedIndustrialBeamAssembly extends Building{

    private static final ItemAmount OUTGOING = new ItemAmount(Item.EnceasedSteelBeam, 4);
    private static final ItemAmount INCOMING = new ItemAmount(Item.SteelBeam, 16);
    private static final ItemAmount INCOMING2 = new ItemAmount(Item.Concrete, 20);
    public EnceasedIndustrialBeamAssembly() {
        super(OUTGOING, INCOMING,INCOMING2);
    }


}
