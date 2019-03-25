package de.DanielJosefKrueger.satisfactory;

public class IronRodProducer extends Building{

    private static final ItemAmount OUTGOING = new ItemAmount(Item.IronRod, 15);
    private static final ItemAmount INCOMING = new ItemAmount(Item.IronIngot, 15);

    protected IronRodProducer() {
        super(OUTGOING, INCOMING);
    }


}
