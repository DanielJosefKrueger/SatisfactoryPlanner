package de.DanielJosefKrueger.satisfactory.buildings;

import de.DanielJosefKrueger.satisfactory.Item;
import de.DanielJosefKrueger.satisfactory.ItemAmount;

import java.util.Arrays;
import java.util.List;

public abstract class Building {

    private final ItemAmount[] incoming;
    private final ItemAmount outgoing;
    private final Item producedItem;
    private final Double producedAmount;

    public Building(ItemAmount outgoing, ItemAmount... incoming) {
        this.incoming = incoming;
        this.outgoing = outgoing;
        this.producedItem = outgoing.getItem();
        this.producedAmount = outgoing.getAmount();
    }


    public ItemAmount[] getIncoming() {
        return incoming;
    }

    public ItemAmount getOutgoing() {
        return outgoing;
    }


    public Item getProducedItem() {
        return producedItem;
    }

    public Double getProducedAmount() {
        return producedAmount;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Building building = (Building) o;


        return o.hashCode()==this.hashCode();
    }

    @Override
    public int hashCode() {
        return this.getClass().getSimpleName().hashCode();
    }
}
