package de.DanielJosefKrueger.satisfactory;

public class CableProducer extends Building{

    private static final ItemAmount OUTGOING = new ItemAmount(Item.Cabel, 15);
    private static final ItemAmount INCOMING = new ItemAmount(Item.Wire, 30);

    protected CableProducer() {
        super(OUTGOING, INCOMING);
    }


}
