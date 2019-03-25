package de.DanielJosefKrueger.satisfactory;

public class WireProducer extends Building{

    private static final ItemAmount OUTGOING = new ItemAmount(Item.Wire, 45);
    private static final ItemAmount INCOMING = new ItemAmount(Item.CopperOre, 15);

    protected WireProducer() {
        super(OUTGOING, INCOMING);
    }


}
