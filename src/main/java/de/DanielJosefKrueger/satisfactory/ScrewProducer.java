package de.DanielJosefKrueger.satisfactory;

public class ScrewProducer extends Building{

    private static final ItemAmount OUTGOING = new ItemAmount(Item.Screws, 90);
    private static final ItemAmount INCOMING = new ItemAmount(Item.IronRod, 15);

    protected ScrewProducer() {
        super(OUTGOING, INCOMING);
    }


}
