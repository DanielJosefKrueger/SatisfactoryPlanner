package de.DanielJosefKrueger.satisfactory;

public class ModularFrameAssembly extends Building{

    private static final ItemAmount OUTGOING = new ItemAmount(Item.ModularFrame, 4);
    private static final ItemAmount INCOMING = new ItemAmount(Item.ReinforcedIronPlate, 12);
    private static final ItemAmount INCOMING2 = new ItemAmount(Item.IronRod, 24);
    protected ModularFrameAssembly() {
        super(OUTGOING, INCOMING,INCOMING2);
    }


}
