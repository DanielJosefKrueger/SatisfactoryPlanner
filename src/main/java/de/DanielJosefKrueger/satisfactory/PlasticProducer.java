package de.DanielJosefKrueger.satisfactory;

public class PlasticProducer extends Building{

    private static final ItemAmount OUTGOING = new ItemAmount(Item.Plastic, 22.5);
    private static final ItemAmount INCOMING = new ItemAmount(Item.CrudeOil, 30);

    protected PlasticProducer() {
        super(OUTGOING, INCOMING);
    }


}
