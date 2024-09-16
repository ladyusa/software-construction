package lec3interface.generic.measurer;

import java.awt.Rectangle;

public class RectangleAreaMeasurer implements Measurer<Rectangle> {
    @Override
    public double measure(Rectangle rectangle) {

        // safe ไม่ต้อง down cast แล้ว
        // เพราะ compiler ตรวจเช็คให้แล้วว่า parameter
        // มี type เป็น Rectangle แน่นอน
        return rectangle.width * rectangle.height;
    }
}
