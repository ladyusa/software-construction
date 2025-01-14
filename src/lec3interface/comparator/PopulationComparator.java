package lec3interface.comparator;

import java.util.Comparator;

public class PopulationComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {

        // not safe, since object may not be Country
        Country c1 = (Country) o1;
        Country c2 = (Country) o2;
        if (c1.getPopulation() < c2.getPopulation()) return -1;
        if (c1.getPopulation() > c2.getPopulation()) return 1;
        return 0;
    }
}
