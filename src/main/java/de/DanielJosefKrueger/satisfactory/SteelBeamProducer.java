package de.DanielJosefKrueger.satisfactory;

public class SteelBeamProducer extends Building{

    private static final ItemAmount OUTGOING = new ItemAmount(Item.SteelBeam, 10);
    private static final ItemAmount INCOMING = new ItemAmount(Item.SteelIngot, 30);

    protected SteelBeamProducer() {
        super(OUTGOING, INCOMING);
    }


}
