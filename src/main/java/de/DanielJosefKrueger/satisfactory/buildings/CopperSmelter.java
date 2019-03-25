package de.DanielJosefKrueger.satisfactory.buildings;


import de.DanielJosefKrueger.satisfactory.Item;
import de.DanielJosefKrueger.satisfactory.ItemAmount;

public class CopperSmelter extends Building{

    private static final ItemAmount KUPFERBARREN = new ItemAmount(Item.CopperIngot, 30);
    private static final ItemAmount KUPFERERZ = new ItemAmount(Item.CopperOre, 30);

    public CopperSmelter() {
        super(KUPFERBARREN, KUPFERERZ);
    }
}
