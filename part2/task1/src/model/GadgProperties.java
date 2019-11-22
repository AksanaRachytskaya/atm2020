package model;

public class GadgProperties {
    public Gadget getFridge() {
        return new Gadget(GadgConstants.FRIDGE_NAME, GadgConstants.FRIDGE_ZONE, GadgConstants.FRIDGE_USESAWEEK, GadgConstants.FRIDGE_POWER, GadgConstants.FRIDGE_WORKINGTIME);
    }
    public Gadget getWasher (){
        return new Gadget(GadgConstants.WASHER_NAME, GadgConstants.WASHER_ZONE, GadgConstants.WASHER_USESAWEEK, GadgConstants.WASHER_POWER, GadgConstants.WASHER_WORKINGTIME);
    }
    public Gadget getIron (){
        return new Gadget(GadgConstants.IRON_NAME, GadgConstants.IRON_ZONE, GadgConstants.IRON_USESAWEEK, GadgConstants.IRON_POWER, GadgConstants.IRON_WORKINGTIME);
    }
}
