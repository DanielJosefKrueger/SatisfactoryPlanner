package de.DanielJosefKrueger.satisfactory;

public class MotorAssembly extends Building{

    private static final ItemAmount OUTGOING = new ItemAmount(Item.Motor, 1);
    private static final ItemAmount INCOMING = new ItemAmount(Item.Rotor, 10);
    private static final ItemAmount INCOMING2 = new ItemAmount(Item.Stator, 10);
    protected MotorAssembly() {
        super(OUTGOING, INCOMING,INCOMING2);
    }


}
