package de.DanielJosefKrueger.satisfactory.buildings;

import de.DanielJosefKrueger.satisfactory.Item;
import de.DanielJosefKrueger.satisfactory.ItemAmount;

public class ModularFrameAssembly extends Building{

    private static final ItemAmount OUTGOING = new ItemAmount(Item.ModularFrame, 4);
    private static final ItemAmount INCOMING = new ItemAmount(Item.ReinforcedIronPlate, 12);
    private static final ItemAmount INCOMING2 = new ItemAmount(Item.IronRod, 24);
    public ModularFrameAssembly() {
        super(OUTGOING, INCOMING,INCOMING2);
    }


}
