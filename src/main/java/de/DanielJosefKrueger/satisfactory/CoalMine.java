package de.DanielJosefKrueger.satisfactory;

public class CoalMine extends Building{

    private static final ItemAmount OUTGOING = new ItemAmount(Item.Coal, 120);

    protected CoalMine() {
        super(OUTGOING);
    }


}
