package de.DanielJosefKrueger.satisfactory.buildings;


import de.DanielJosefKrueger.satisfactory.Item;
import de.DanielJosefKrueger.satisfactory.ItemAmount;

public class IronSmelter extends Building{

    private static final ItemAmount EISENBARREN = new ItemAmount(Item.IronIngot, 30);
    private static final ItemAmount EISENERZ = new ItemAmount(Item.IronOre, 30);


    public IronSmelter() {
        super(EISENBARREN, EISENERZ);
    }



}
