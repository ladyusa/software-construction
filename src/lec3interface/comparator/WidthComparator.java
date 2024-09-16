package lec3interface.comparator;

import java.awt.Rectangle;
import java.util.Comparator;

public class WidthComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Rectangle r1 = (Rectangle) o1;
        Rectangle r2 = (Rectangle) o2;

        if (r1.getWidth() < r2.getWidth()) return -1;
        if (r1.getWidth() > r2.getWidth()) return 1;
        return 0;
    }
}
