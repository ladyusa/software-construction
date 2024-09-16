package lec3interface.measurer;

import java.awt.Rectangle;

public class RectangleAreaMeasurer implements Measurer {
    @Override
    public double measure(Object object) {

        // สามารถใช้ measurer ได้ แม้กับคลาสที่เราไม่ได้เป็นเจ้าของ
        // เช่น คลาสที่อยู่ในไลบราลีของ Java เช่น Rectangle ใน
        // package java.jwt

        // not safe, since object may not be Rectangle
        Rectangle rectangle = (Rectangle) object;
        return rectangle.width * rectangle.height;
    }
}
