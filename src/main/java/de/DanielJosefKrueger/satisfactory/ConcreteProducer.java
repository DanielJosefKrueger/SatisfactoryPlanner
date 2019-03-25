package de.DanielJosefKrueger.satisfactory;

public class ConcreteProducer extends Building{

    private static final ItemAmount OUTGOING = new ItemAmount(Item.Concrete, 15);
    private static final ItemAmount INCOMING = new ItemAmount(Item.Wire, 30);

    protected ConcreteProducer() {
        super(OUTGOING, INCOMING);
    }


}
