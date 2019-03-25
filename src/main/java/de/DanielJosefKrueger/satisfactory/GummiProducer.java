package de.DanielJosefKrueger.satisfactory;

public class GummiProducer extends Building{

    private static final ItemAmount OUTGOING = new ItemAmount(Item.Rubber, 30);
    private static final ItemAmount INCOMING = new ItemAmount(Item.CrudeOil, 30);

    protected GummiProducer() {
        super(OUTGOING, INCOMING);
    }


}
