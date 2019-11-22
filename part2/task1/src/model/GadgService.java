package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GadgService {
    public Stuff getStuff(List<Gadget> gadgets)
    {
        return new Stuff(gadgets);
    }

    public int getStuffPower(Stuff stuff) {
        int power = 0;
        for (Gadget gadget : stuff.getGadgets()) {
            power += gadget.getPower();
        }
        System.out.println("Full power of the plugged gadgets is " + power);
        System.out.println();
        return power;

    }
    public List<Gadget> getGadgetsByMaxPower(Stuff stuff, int maxPower) {
        List<Gadget> resultGadgets = new ArrayList<>();
        for (Gadget gadget : stuff.getGadgets()) {
            if (maxPower >= gadget.getPower()) {
                resultGadgets.add(gadget);
            }
        }
        System.out.println("Max power has " + resultGadgets);
        System.out.println();
        return resultGadgets;
    }

    public Stuff sortStuffByZoneAndByPower(Stuff stuff) {
        Comparator<Gadget> comparatorByZoneAndByPower = Comparator.comparing((Gadget gadget) -> gadget.getZone())
                .thenComparing(gadget -> gadget.getPower());
        Collections.sort(stuff.getGadgets(), comparatorByZoneAndByPower);
        System.out.println("The gadgets are sorted by Zone of using and power " + stuff);
        System.out.println();
        return stuff;
    }
}
