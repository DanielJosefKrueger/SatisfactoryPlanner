package de.DanielJosefKrueger.satisfactory;

public class IronMine extends Building{

    private static final ItemAmount OUTGOING = new ItemAmount(Item.IronOre, 120);

    protected IronMine() {
        super(OUTGOING);
    }


}
