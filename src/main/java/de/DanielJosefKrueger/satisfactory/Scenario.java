package de.DanielJosefKrueger.satisfactory;

import de.DanielJosefKrueger.satisfactory.buildings.*;

import java.util.HashMap;
import java.util.Map;

public class Scenario {


    private final HashMap<Building, Double> buildingMapping = new HashMap<>();
    private final HashMap<Item, Double> itemsProduced = new HashMap<>();
    private final HashMap<Item, Double> itemsNeeded = new HashMap<>();





    public Scenario(){

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
        buildingMapping.put(new PlasticProducer(),0.0);


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










    public void addNeed(ItemAmount need){
        boolean producreFound = false;
        for (Building building : buildingMapping.keySet()) {

            if(building.getProducedItem().equals(need.getItem())){
                producreFound= true;
                // how many percent do we need from the new building?
                final double factor = need.getAmount() / building.getProducedAmount();

                //add to existing buildings
                Double amountBefore = buildingMapping.get(building);
                buildingMapping.put(building, amountBefore + factor);

                //this building needs items too => recursion
                for (ItemAmount newNeededItem : building.getIncoming()) {
                    // adjust to the factor
                    ItemAmount realAmount = new ItemAmount(newNeededItem.getItem(), newNeededItem.getAmount() * factor);
                    addNeed(realAmount);
                }
            }
        }

        if(!producreFound){
            System.out.println("No Producer found for item: " + need.getItem());
        }
    }



    private void updateStatistics(){
        for (Map.Entry<Building, Double> entry : buildingMapping.entrySet()) {
            Building building = entry.getKey();
            // produced
            Item producedItem = building.getProducedItem();
            Double factor = entry.getValue();
            Double alreadyProduced = itemsProduced.getOrDefault(producedItem, 0.0);
            this.itemsProduced.put(producedItem, alreadyProduced+ factor* building.getProducedAmount());
            // needed
            for (ItemAmount need : building.getIncoming()) {
                Item neededItem = need.getItem();
                Double alreadyNeeded = itemsNeeded.getOrDefault(neededItem, 0.0);
                this.itemsNeeded.put(neededItem, alreadyNeeded+ factor* need.getAmount());
            }
        }
    }


    public void printStatistics(){
        updateStatistics();
        System.out.println("Buildings");
        System.out.println("Building and Amount");
        for (Map.Entry<Building, Double> entry : buildingMapping.entrySet()) {
            if(!entry.getValue().equals(0.0)){
                System.out.println(entry.getKey().toString() + ":"+ entry.getValue() + "\n");
           }
        }

        System.out.println("\nItems produced:");
        for (Map.Entry<Item, Double> entry : this.itemsProduced.entrySet()) {
            if(entry.getValue()!=0.0){
                System.out.println(entry.getKey() + ":"+  entry.getValue());
            }

        }


        System.out.println("\nItems needed:");
        for (Map.Entry<Item, Double> entry : this.itemsNeeded.entrySet()) {
            if(entry.getValue()!=0.0) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }

    }


}
