package de.DanielJosefKrueger.satisfactory;


public class IronSmelter extends Building{

    private static final ItemAmount EISENBARREN = new ItemAmount(Item.IronIngot, 30);
    private static final ItemAmount EISENERZ = new ItemAmount(Item.IronOre, 30);


    protected IronSmelter() {
        super(EISENBARREN, EISENERZ);
    }



}
