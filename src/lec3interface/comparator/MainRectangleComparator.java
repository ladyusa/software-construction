package lec3interface.comparator;

import java.awt.Rectangle;
import java.util.Arrays;
import java.util.Comparator;

public class MainRectangleComparator {

    // สามารถใช้ Comparator ได้ แม้กับคลาสที่เราไม่ได้เป็นเจ้าของ
    // เช่น คลาสที่อยู่ในไลบราลีของ Java เช่น Rectangle ใน
    // package java.jwt

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 20);
        Rectangle rectangle2 = new Rectangle(30, 10);
        Rectangle rectangle3 = new Rectangle(20, 20);

        Rectangle[] rectangles = { rectangle1, rectangle2, rectangle3 };

        for (Rectangle rectangle : rectangles)
            System.out.println(rectangle);

        System.out.println(" ------- after sort by width ------- ");
        Arrays.sort(rectangles, new WidthComparator());

        for (Rectangle rectangle : rectangles)
            System.out.println(rectangle);

        System.out.println(" ------- after sort by height ------- ");
        // anonymous class
        Arrays.sort(rectangles, new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Rectangle r1 = (Rectangle) o1;
                Rectangle r2 = (Rectangle) o2;

                if (r1.getHeight() < r2.getHeight()) return -1;
                if (r1.getHeight() > r2.getHeight()) return 1;
                return 0;
            }
        });
        for (Rectangle rectangle : rectangles)
            System.out.println(rectangle);

        System.out.println(" ------- after sort by area ------- ");
        Arrays.sort(rectangles, new AreaComparator());
        for (Rectangle rectangle : rectangles)
            System.out.println(rectangle);

    }

    static class AreaComparator implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            Rectangle r1 = (Rectangle) o1;
            Rectangle r2 = (Rectangle) o2;

            if (r1.getWidth() * r1.getHeight() < r2.getWidth() * r2.getHeight()) return -1;
            if (r1.getWidth() * r1.getHeight() > r2.getWidth() * r2.getHeight()) return 1;
            return 0;
        }
    }

}
