package lec3interface.measurer;

import java.awt.Rectangle;

public class MainRectangle {
    // สามารถใช้ measurer ได้ แม้กับคลาสที่เราไม่ได้เป็นเจ้าของ
    // เช่น คลาสที่อยู่ในไลบราลีของ Java เช่น Rectangle ใน
    // package java.jwt

    // inner class / nested class
    // นิยามคลาสภายในคลาส ใช้ได้ในทุกเมธอดในคลาสนี้
    static class PerimeterMeasurer implements Measurer {

        @Override
        public double measure(Object obj) {
            Rectangle rect = (Rectangle) obj;
            return 2 * (rect.width + rect.height);
        }
    }

    public static void main(String[] args) {
        // trivial class ภายในเมธอด ใช้ได้แค่ในเมธอด main() นี้เท่านั้น
        class HeightMeasurer implements Measurer {

            @Override
            public double measure(Object object) {
                Rectangle rectangle = (Rectangle) object;
                return rectangle.getHeight();
            }
        }

        Rectangle rect1 = new Rectangle(5,2); // 10
        Rectangle rect2 = new Rectangle(3,3); // 9
        Rectangle rect3 = new Rectangle(2,4); // 8
        Rectangle[] rectangles = {rect1, rect2, rect3};

        double avgArea = Data.average(rectangles, new RectangleAreaMeasurer());
        System.out.println("Average rectangle area = " + avgArea);

        // anonymous class
        // synchronous method - Java
        // asynchronous method - JavaScript
        double avgWidth = Data.average(rectangles, new Measurer() {
            // anonymous class (คลาสที่ไม่มีชื่อ)
            // นิยามเมธอดของ interface และนำมาใช้เลย
            // ใช้ได้แค่ในเมธอด sort() ในบรรทัดที่ 43 นี้เท่านั้น
            public double measure(Object object) {
                Rectangle rectangle = (Rectangle) object;
                return rectangle.width;
            }
        });
        System.out.println("Average rectangle width = " + avgWidth);

        double avgHeight = Data.average(rectangles, new HeightMeasurer());
        System.out.println("Average rectangle height = " + avgHeight);

        double avgPerimeter = Data.average(rectangles, new PerimeterMeasurer());
        System.out.println("Average rectangle perimeter = " + avgPerimeter);

    }


}
