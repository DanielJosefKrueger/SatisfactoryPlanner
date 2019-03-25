package de.DanielJosefKrueger.satisfactory;

public class IronPlateProducer extends Building{

    private static final ItemAmount OUTGOING = new ItemAmount(Item.IronPlate, 15);
    private static final ItemAmount INCOMING = new ItemAmount(Item.IronIngot, 30);

    protected IronPlateProducer() {
        super(OUTGOING, INCOMING);
    }


}
