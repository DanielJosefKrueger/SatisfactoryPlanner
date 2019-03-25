package de.DanielJosefKrueger.satisfactory;

public class SteelFoundry extends Building{

    private static final ItemAmount STAHLBARREN = new ItemAmount(Item.SteelIngot, 30);
    private static final ItemAmount EISENERZ = new ItemAmount(Item.IronOre, 45);
    private static final ItemAmount KOHLE = new ItemAmount(Item.Coal, 45);

    protected SteelFoundry() {
        super(STAHLBARREN, EISENERZ,KOHLE);
    }


}
