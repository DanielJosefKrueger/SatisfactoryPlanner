package de.DanielJosefKrueger.satisfactory;

import java.util.List;

public abstract class Building {

    private final ItemAmount[] incoming;
    private final ItemAmount outgoing;


    protected Building(ItemAmount outgoing, ItemAmount... incoming) {
        this.incoming = incoming;
        this.outgoing = outgoing;
    }


    public ItemAmount[] getIncoming() {
        return incoming;
    }

    public ItemAmount getOutgoing() {
        return outgoing;
    }
}
