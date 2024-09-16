package lec3interface.infohiding.common;

public class Doctor {
    private String name;
    private double rate;

    public Doctor(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
