package model;

import java.util.Arrays;

import static model.GadgConstants.MESSAGE_1;

public class Runner {
    public static void main(String[] args) {

        GadgProperties gadgProperties = new GadgProperties();
        GadgService gadgetService = new GadgService();
        Stuff stuff = new Stuff();
        Gadget fridge = gadgProperties.getFridge();
        Gadget washer = gadgProperties.getWasher();
        Gadget iron = gadgProperties.getIron();

        stuff = gadgetService.getStuff(Arrays.asList(fridge, washer, iron));
        System.out.println(MESSAGE_1);

        gadgetService.getGadgetsByMaxPower(stuff, 800);
    }
}