package de.DanielJosefKrueger.satisfactory;

public class ItemAmount{



    private final Item item;
    private final double amount;


        public ItemAmount(Item item, double amount) {
            this.item = item;
            this.amount = amount;
        }

    public Item getItem() {
        return item;
    }

    public double getAmount() {
        return amount;
    }
}
