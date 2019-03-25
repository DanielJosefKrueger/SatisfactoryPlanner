package de.DanielJosefKrueger.satisfactory;

public class CopperMine extends Building{

    private static final ItemAmount OUTGOING = new ItemAmount(Item.CopperOre, 120);

    protected CopperMine() {
        super(OUTGOING);
    }


}
