package de.DanielJosefKrueger.satisfactory;


public class CopperSmelter extends Building{

    private static final ItemAmount KUPFERBARREN = new ItemAmount(Item.CopperIngot, 30);
    private static final ItemAmount KUPFERERZ = new ItemAmount(Item.CopperOre, 30);

    protected CopperSmelter() {
        super(KUPFERBARREN, KUPFERERZ);
    }
}
