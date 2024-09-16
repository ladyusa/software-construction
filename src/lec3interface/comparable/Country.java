package lec3interface.comparable;

public class Country implements Comparable {
    private String name;
    private double population;
    private double area;
    private double gdp;

    public Country(String name, double population, double area, double gdp) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.gdp = gdp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getGdp() {
        return gdp;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", gdp=" + gdp +
                '}';
    }

    @Override
    public int compareTo(Object obj) {
        // not safe, since object may not be Country

        // เปรียบเทียบ this object กับ other object ใน parameter
        Country other = (Country) obj;
        if (this.area < other.area) return -1;
        if (this.area > other.area) return 1;
        return 0;
    }
}
