package de.DanielJosefKrueger.satisfactory;

import java.util.HashMap;

public class Scenario {


    HashMap<Building, Double> buildingMapping = new HashMap<>();

    Scenario(){

        buildingMapping.put(new CableProducer(),0.0);
        buildingMapping.put(new CircuitBoardAssembly(),0.0);
        buildingMapping.put(new CoalMine(),0.0);
        buildingMapping.put(new ComputerManufacturer(),0.0);
        buildingMapping.put(new ConcreteProducer(),0.0);
        buildingMapping.put(new CopperMine(),0.0);
        buildingMapping.put(new CopperSmelter(),0.0);

        buildingMapping.put(new EnceasedIndustrialBeamAssembly(),0.0);
        buildingMapping.put(new GummiProducer(),0.0);
        buildingMapping.put(new HeavyModularFrameManufacturer(),0.0);

        buildingMapping.put(new IronMine(),0.0);
        buildingMapping.put(new IronPlateProducer(),0.0);
        buildingMapping.put(new IronRodProducer(),0.0);
        buildingMapping.put(new IronSmelter(),0.0);

        buildingMapping.put(new ModularFrameAssembly(),0.0);
        buildingMapping.put(new MotorAssembly(),0.0);

        buildingMapping.put(new OilPlattform(),0.0);
        buildingMapping.put(new ReinforcedIronPlatesAssembly(),0.0);
        buildingMapping.put(new RotorAssembly(),0.0);

        buildingMapping.put(new ScrewProducer(),0.0);
        buildingMapping.put(new SteelBeamProducer(),0.0);
        buildingMapping.put(new SteelFoundry(),0.0);
        buildingMapping.put(new SteelPipeProducer(),0.0);
        buildingMapping.put(new StratorAssembly(),0.0);
        buildingMapping.put(new WireProducer(),0.0);
        buildingMapping.put(new WireProducer(),0.0);
    }




}
