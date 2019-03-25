package de.DanielJosefKrueger.satisfactory;

public class OilPlattform extends Building{

    private static final ItemAmount OUTGOING = new ItemAmount(Item.CrudeOil, 240);

    protected OilPlattform() {
        super(OUTGOING);
    }


}
