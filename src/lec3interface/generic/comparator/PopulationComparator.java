package lec3interface.generic.comparator;

import java.util.Comparator;

public class PopulationComparator implements Comparator<Country> {
    @Override
    public int compare(Country c1, Country c2) {

        // safe ไม่ต้อง down cast แล้ว
        // เพราะ compiler ตรวจเช็คให้แล้วว่า parameter
        // มี type เป็น Country แน่นอน
        if (c1.getPopulation() < c2.getPopulation()) return -1;
        if (c1.getPopulation() > c2.getPopulation()) return 1;
        return 0;
    }
}
