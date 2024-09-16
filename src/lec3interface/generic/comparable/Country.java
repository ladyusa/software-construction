package lec3interface.generic.comparable;

public class Country implements Comparable<Country> {
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
    public int compareTo(Country other) {
        // safe ไม่ต้อง down cast แล้ว
        // เพราะ compiler ตรวจเช็คให้แล้วว่า parameter
        // มี type เป็น Country แน่นอน

        // เปรียบเทียบ this object กับ other object ใน parameter
        if (this.area < other.area) return -1;
        if (this.area > other.area) return 1;
        return 0;
    }
}
