package model;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Gadget {
    protected String name;
    protected String zone;
    protected int usesAweek;
    protected int power;
    protected double workingTime;

    public Gadget() {

    }

    public Gadget(String name, String zone, int usesAweek, int power, double workingTime) {
        this.name = name;
        this.zone = zone;
        this.usesAweek = usesAweek;
        this.power = power;
        this.workingTime = workingTime;
    }

    public String getName() {
        return name;
    }

    public Gadget setName(String name) {
        this.name = name;
        return this;
    }

    public String getZone() {
        return zone;
    }

    public Gadget setZone(String zone) {
        this.zone = zone;
        return this;
    }

    public int getUsesAweek() {
        return usesAweek;
    }

    public Gadget setUsesAweek(int usesAweek) {
        this.usesAweek = usesAweek;
        return this;
    }

    public int getPower() {
        return power;
    }

    public Gadget setPower(int power) {
        this.power = power;
        return this;
    }

    public double getWorkingTime() {
        return workingTime;
    }

    public Gadget setWorkingTime(double workingTime) {
        this.workingTime = workingTime;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Gadget gadget = (Gadget) o;

        return new EqualsBuilder()
                .append(name, gadget.name)
                .append(zone, gadget.zone)
                .append(usesAweek, gadget.usesAweek)
                .append(power, gadget.power)
                .append(workingTime, gadget.workingTime)
                .isEquals();
    }



    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(name)
                .append(zone)
                .append(usesAweek)
                .append(power)
                .append(workingTime)
                .toHashCode();



    }
    @Override
    public String toString() {
        return "Gadget{" +
                "name='" + name + '\'' +
              /*  ", zone='" + zone + '\'' +
                ", usesAweek=" + usesAweek +
                ", power=" + power +
                ", workingTime=" + workingTime +*/
                '}';
    }
}

