package de.DanielJosefKrueger.satisfactory;

public class SteelPipeProducer extends Building{

    private static final ItemAmount OUTGOING = new ItemAmount(Item.SteelPipe, 15);
    private static final ItemAmount INCOMING = new ItemAmount(Item.SteelIngot, 15);

    protected SteelPipeProducer() {
        super(OUTGOING, INCOMING);
    }


}
