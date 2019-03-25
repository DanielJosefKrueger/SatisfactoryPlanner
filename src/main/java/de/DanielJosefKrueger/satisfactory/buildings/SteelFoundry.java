package de.DanielJosefKrueger.satisfactory.buildings;

import de.DanielJosefKrueger.satisfactory.Item;
import de.DanielJosefKrueger.satisfactory.ItemAmount;
import de.DanielJosefKrueger.satisfactory.buildings.Building;

public class SteelFoundry extends Building {

    private static final ItemAmount STAHLBARREN = new ItemAmount(Item.SteelIngot, 30);
    private static final ItemAmount EISENERZ = new ItemAmount(Item.IronOre, 45);
    private static final ItemAmount KOHLE = new ItemAmount(Item.Coal, 45);

    public SteelFoundry() {
        super(STAHLBARREN, EISENERZ,KOHLE);
    }


}
