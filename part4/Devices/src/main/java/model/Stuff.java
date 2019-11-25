package model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.ArrayList;
import java.util.List;

public class Stuff {
    public List<Gadget> gadgets;

    public Stuff() {

    }

    public Stuff(List<Gadget> gadgets) {
        this.gadgets = new ArrayList<>(gadgets);
    }

    public List<Gadget> getGadgets() {
        return gadgets;
    }

    public Stuff setGadgets(List<Gadget> gadgets) {
        this.gadgets = gadgets;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stuff stuff = (Stuff) o;

        return new EqualsBuilder()
                .append(gadgets, stuff.gadgets)
                .isEquals();
    }

    @Override
    public int hashCode() {
      return new HashCodeBuilder(17,37)
               .append(gadgets)
               .toHashCode();
}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Stuff{");
        sb.append("gadgets=").append(gadgets);
        sb.append('}');
        return sb.toString();
    }
}
